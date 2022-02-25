package io.mosn.layotto.v1;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.mosn.layotto.v1.grpc.ExceptionHandler;
import io.mosn.layotto.v1.grpc.GrpcRuntimeClient;
import io.mosn.layotto.v1.mock.MyFileService;
import io.mosn.layotto.v1.mock.MySequencerService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import spec.proto.runtime.v1.RuntimeGrpc;
import spec.proto.runtime.v1.RuntimeProto;
import spec.sdk.runtime.v1.domain.sequencer.*;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class SequencerTestWithRealServer {

    private final RuntimeGrpc.RuntimeImplBase sequencerService = new MySequencerService();

    private Server srv;
    private GrpcRuntimeClient client;

    int                            port        = 9999;
    String                         ip          = "127.0.0.1";

    @Before
    public void setUp() throws Exception {
        // start grpc server
        /* The port on which the server should run */
        srv = ServerBuilder.forPort(port)
                .addService(sequencerService)
                .intercept(new ExceptionHandler())
                .build()
                .start();

        // build a client
        client = new RuntimeClientBuilder()
                .withIp(ip)
                .withPort(port)
                .withConnectionPoolSize(4)
                .withTimeout(1000)
                .buildGrpc();
    }

    @After
    public void shutdown() throws InterruptedException {
        client.shutdown();
        srv.shutdownNow();
    }

    @Test
    public void getNextId() {
        GetNextIdRequest getNextIdRequest = new GetNextIdRequest();
        SequencerOptions sequencerOptions = new SequencerOptions();
        sequencerOptions.setOption(SequencerOptions.AutoIncrement.WEAK);
        getNextIdRequest.setStoreName("redis");
        getNextIdRequest.setKey("test");
        getNextIdRequest.setOptions(sequencerOptions);

        GetNextIdResponse nextId = client.getNextId(getNextIdRequest);
        assertEquals(nextId.getNextId(), 1);
    }
}
