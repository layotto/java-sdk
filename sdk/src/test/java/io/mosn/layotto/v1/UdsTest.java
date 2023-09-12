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

import io.grpc.Server;
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder;
import io.grpc.netty.shaded.io.netty.channel.EventLoopGroup;
import io.grpc.netty.shaded.io.netty.channel.epoll.EpollEventLoopGroup;
import io.grpc.netty.shaded.io.netty.channel.epoll.EpollServerDomainSocketChannel;
import io.grpc.netty.shaded.io.netty.channel.unix.DomainSocketAddress;
import io.mosn.layotto.v1.grpc.ExceptionHandler;
import io.mosn.layotto.v1.grpc.GrpcRuntimeClient;
import io.mosn.layotto.v1.mock.MyHelloService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import spec.proto.runtime.v1.RuntimeGrpc;

import static org.junit.Assert.assertEquals;

/**
 * @author zisong
 * @version UdsTest.java, v 0.1 2023年09月12日 11:49 zisong
 */
public class UdsTest {

    private RuntimeGrpc.RuntimeImplBase helloService  = new MyHelloService();

    private Server                      srv;
    private GrpcRuntimeClient           client;

    String                              socketAddress = "/tmp/client-proxy.sock";

    private boolean isLinuxPlatform() {
        String os = System.getProperty("os.name").toLowerCase();
        return os.equals("linux");
    }

    @Before
    public void setUp() throws Exception {
        if (!isLinuxPlatform()) {
            return;
        }

        DomainSocketAddress udsAddress = new DomainSocketAddress(socketAddress);

        // start grpc server with unix domain socket
        EventLoopGroup boss = new EpollEventLoopGroup(1);
        EventLoopGroup elg = new EpollEventLoopGroup();

        srv = NettyServerBuilder
            .forAddress(udsAddress)
            .bossEventLoopGroup(boss)
            .workerEventLoopGroup(elg)
            .channelType(EpollServerDomainSocketChannel.class)
            .addService(helloService)
            .intercept(new ExceptionHandler())
            .build()
            .start();

        // build a client
        client = new RuntimeClientBuilder()
            .withUdsSocket(udsAddress)
            .withConnectionPoolSize(4)
            .withTimeout(2000)
            .buildGrpc();
    }

    @After
    public void shutdown() throws InterruptedException {
        if (!isLinuxPlatform()) {
            return;
        }

        client.shutdown();
        srv.shutdownNow();
    }

    @Test
    public void sayHello() {
        if (!isLinuxPlatform()) {
            return;
        }

        String greet = client.sayHello("layotto");
        assertEquals("hi, layotto", greet);
    }

}