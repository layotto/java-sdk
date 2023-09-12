/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package io.mosn.layotto.v1;

import io.grpc.Server;
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder;
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

    private RuntimeGrpc.RuntimeImplBase helloService = new MyHelloService();

    private Server srv;
    private GrpcRuntimeClient client;

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

        // start grpc server
        srv = NettyServerBuilder
                .forAddress(udsAddress)
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