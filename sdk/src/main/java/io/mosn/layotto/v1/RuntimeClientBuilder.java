/*
 * Copyright 2021 Layotto Authors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mosn.layotto.v1;

import com.google.errorprone.annotations.DoNotCall;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import io.grpc.netty.shaded.io.netty.channel.epoll.EpollDomainSocketChannel;
import io.grpc.netty.shaded.io.netty.channel.epoll.EpollEventLoopGroup;
import io.grpc.netty.shaded.io.netty.channel.unix.DomainSocketAddress;
import io.mosn.layotto.v1.config.RuntimeProperties;
import io.mosn.layotto.v1.domain.ApiProtocol;
import io.mosn.layotto.v1.grpc.GrpcRuntimeClient;
import io.mosn.layotto.v1.grpc.stub.PooledStubManager;
import io.mosn.layotto.v1.grpc.stub.SingleStubManager;
import io.mosn.layotto.v1.grpc.stub.StubCreator;
import io.mosn.layotto.v1.grpc.stub.StubManager;
import io.mosn.layotto.v1.serializer.JSONSerializer;
import io.mosn.layotto.v1.serializer.ObjectSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spec.proto.runtime.v1.RuntimeGrpc;
import spec.proto.extension.v1.s3.ObjectStorageServiceGrpc;
import spec.sdk.runtime.v1.client.RuntimeClient;

/**
 * A builder for the RuntimeClient,
 */
public class RuntimeClientBuilder {

    private static final Logger DEFAULT_LOGGER  = LoggerFactory.getLogger(RuntimeClient.class.getName());

    private int                 timeoutMs       = RuntimeProperties.DEFAULT_TIMEOUT_MS;

    private String              ip              = RuntimeProperties.DEFAULT_IP;

    private int                 port            = RuntimeProperties.DEFAULT_PORT;

    private ApiProtocol         protocol        = RuntimeProperties.DEFAULT_API_PROTOCOL;

    private Logger              logger          = DEFAULT_LOGGER;

    private ObjectSerializer    stateSerializer = new JSONSerializer();

    private int                 poolSize;

    private DomainSocketAddress domainSocketAddress = null;

    // TODO add rpc serializer

    /**
     * Creates a constructor for RuntimeClient.
     */
    public RuntimeClientBuilder() {
    }

    public RuntimeClientBuilder withConnectionPoolSize(int poolSize) {
        if (poolSize <= 0) {
            throw new IllegalArgumentException("Invalid poolSize.");
        }
        this.poolSize = poolSize;
        return this;
    }

    public RuntimeClientBuilder withIp(String ip) {
        if (ip == null || ip.isEmpty()) {
            throw new IllegalArgumentException("Invalid ip.");
        }
        this.ip = ip;
        return this;
    }

    public RuntimeClientBuilder withPort(int port) {
        if (port <= 0) {
            throw new IllegalArgumentException("Invalid port.");
        }
        this.port = port;
        return this;
    }

    @DoNotCall
    public RuntimeClientBuilder withApiProtocol(ApiProtocol protocol) {
        if (protocol == null) {
            throw new IllegalArgumentException("Invalid protocol.");
        }
        this.protocol = protocol;
        return this;
    }

    public RuntimeClientBuilder withTimeout(int timeoutMillisecond) {
        if (timeoutMillisecond <= 0) {
            throw new IllegalArgumentException("Invalid timeout.");
        }
        this.timeoutMs = timeoutMillisecond;
        return this;
    }

    public RuntimeClientBuilder withLogger(Logger logger) {
        if (logger == null) {
            throw new IllegalArgumentException("Invalid logger.");
        }
        this.logger = logger;
        return this;
    }

    /**
     * Sets the serializer for objects to be persisted.
     *
     * @param stateSerializer Serializer for objects to be persisted.
     * @return This instance.
     */
    public RuntimeClientBuilder withStateSerializer(ObjectSerializer stateSerializer) {
        if (stateSerializer == null) {
            throw new IllegalArgumentException("State serializer is required");
        }

        this.stateSerializer = stateSerializer;
        return this;
    }

    /**
     * Sets the unix domain socket channel for objects to be persisted.
     *
     * @param udsAddress unix domain socket address
     * @return builder
     */
    public RuntimeClientBuilder withUdsSocket(DomainSocketAddress udsAddress) {
        if (udsAddress == null) {
            throw new IllegalArgumentException("Invalid unix domain socket address");
        }

        this.domainSocketAddress = udsAddress;
        return this;
    }

    private ManagedChannel buildTcpChannel(String ip, int port) {
        ManagedChannel tcpChannel = ManagedChannelBuilder
                .forAddress(ip, port)
                .usePlaintext()
                .build();

        return tcpChannel;
    }

    private ManagedChannel[] buildTcpChannels(String ip, int port, int poolSize) {
        ManagedChannel[] channels = new ManagedChannel[poolSize];
        for (int i = 0; i < poolSize; i++) {
            channels[i] = buildTcpChannel(ip, port);
        }

        return channels;
    }

    private ManagedChannel buildUdsChannel(DomainSocketAddress udsAddress) {
        ManagedChannel udsChannel;
        try {
            udsChannel = NettyChannelBuilder
                    .forAddress(udsAddress)
                    .eventLoopGroup(new EpollEventLoopGroup())
                    .channelType(EpollDomainSocketChannel.class)
                    .usePlaintext()
                    .build();
        } catch (UnsatisfiedLinkError error) {
            throw new IllegalArgumentException("Unix domain socket only supports the Linux platform");
        } catch (Throwable e) {
            throw new IllegalArgumentException("Invalid unix domain socket address");
        }

        return udsChannel;
    }

    private ManagedChannel[] buildUdsChannels(DomainSocketAddress udsAddress, int poolSize) {
        ManagedChannel[] channels = new ManagedChannel[poolSize];
        for (int i = 0; i < poolSize; i++) {
            channels[i] = buildUdsChannel(udsAddress);
        }

        return channels;
    }

    /**
     * Build an instance of the Client based on the provided setup.
     *
     * @return an instance of the setup Client
     * @throws IllegalStateException if any required field is missing
     */
    public RuntimeClient build() {
        if (protocol == null) {
            throw new IllegalStateException("Protocol is required.");
        }

        switch (protocol) {
            case GRPC:
                return buildGrpc();
            default:
                throw new IllegalStateException("Unsupported protocol: " + protocol.name());
        }
    }

    public GrpcRuntimeClient buildGrpc() {
        // 1. validate
        if (port <= 0) {
            throw new IllegalArgumentException("Invalid port.");
        }
        // 2. construct stubManager
        StubManager<RuntimeGrpc.RuntimeStub, RuntimeGrpc.RuntimeBlockingStub> runtimeStubManager;
        StubManager<ObjectStorageServiceGrpc.ObjectStorageServiceStub, ObjectStorageServiceGrpc.ObjectStorageServiceBlockingStub> ossStubManager;
        if (poolSize > 1) {
            ManagedChannel[] channels;
            if (this.domainSocketAddress != null) {
                channels = buildUdsChannels(this.domainSocketAddress, this.poolSize);
            } else {
                channels = buildTcpChannels(this.ip, this.port, this.poolSize);
            }

            runtimeStubManager = new PooledStubManager<>(channels, new RuntimeStubCreatorImpl());
            ossStubManager = new PooledStubManager<>(runtimeStubManager.getChannels(), new OssStubCreatorImpl());
        } else {
            ManagedChannel channel;
            if (this.domainSocketAddress != null) {
                channel = buildUdsChannel(this.domainSocketAddress);
            } else {
                channel = buildTcpChannel(this.ip, this.port);
            }

            runtimeStubManager = new SingleStubManager<>(channel, new RuntimeStubCreatorImpl());
            ossStubManager = new SingleStubManager<>(channel, new OssStubCreatorImpl());
        }
        // 3. construct client
        return new RuntimeClientGrpc(
                logger,
                timeoutMs,
                stateSerializer,
                runtimeStubManager,
                ossStubManager
        );
    }

    public GrpcRuntimeClient buildGrpcWithExistingChannel(ManagedChannel channel) {
        // 1. validate
        if (port <= 0) {
            throw new IllegalArgumentException("Invalid port.");
        }
        // 2. construct stubManager
        StubManager<RuntimeGrpc.RuntimeStub, RuntimeGrpc.RuntimeBlockingStub> stubManager = new SingleStubManager(
                channel, new RuntimeStubCreatorImpl());
        StubManager<ObjectStorageServiceGrpc.ObjectStorageServiceStub, ObjectStorageServiceGrpc.ObjectStorageServiceBlockingStub> ossStubManager = new SingleStubManager(
                channel, new OssStubCreatorImpl());
        // 3. construct client
        return new RuntimeClientGrpc(
                logger,
                timeoutMs,
                stateSerializer,
                stubManager,
                ossStubManager);
    }

    public static class RuntimeStubCreatorImpl implements
            StubCreator<RuntimeGrpc.RuntimeStub, RuntimeGrpc.RuntimeBlockingStub> {

        @Override
        public RuntimeGrpc.RuntimeStub createAsyncStub(ManagedChannel channel) {
            return RuntimeGrpc.newStub(channel);
        }

        @Override
        public RuntimeGrpc.RuntimeBlockingStub createBlockingStub(ManagedChannel channel) {
            return RuntimeGrpc.newBlockingStub(channel);
        }

    }

    public static class OssStubCreatorImpl
            implements
            StubCreator<ObjectStorageServiceGrpc.ObjectStorageServiceStub, ObjectStorageServiceGrpc.ObjectStorageServiceBlockingStub> {

        @Override
        public ObjectStorageServiceGrpc.ObjectStorageServiceStub createAsyncStub(ManagedChannel channel) {
            return ObjectStorageServiceGrpc.newStub(channel);
        }

        @Override
        public ObjectStorageServiceGrpc.ObjectStorageServiceBlockingStub createBlockingStub(ManagedChannel channel) {
            return ObjectStorageServiceGrpc.newBlockingStub(channel);
        }

    }
}
