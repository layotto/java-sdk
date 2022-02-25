package io.mosn.layotto.v1;

import io.grpc.ManagedChannel;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.stub.StreamObserver;
import io.grpc.testing.GrpcCleanupRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import spec.proto.runtime.v1.RuntimeGrpc;
import spec.proto.runtime.v1.RuntimeProto;
import spec.sdk.runtime.v1.client.RuntimeClient;
import spec.sdk.runtime.v1.domain.sequencer.GetNextIdRequest;
import spec.sdk.runtime.v1.domain.sequencer.GetNextIdResponse;
import spec.sdk.runtime.v1.domain.sequencer.SequencerOptions;

import static org.junit.Assert.assertEquals;
import static org.mockito.AdditionalAnswers.delegatesTo;
import static org.mockito.Mockito.mock;

@RunWith(JUnit4.class)
public class SequencerTest {
    @Rule
    public final GrpcCleanupRule grpcCleanup = new GrpcCleanupRule();

    private final RuntimeGrpc.RuntimeImplBase serviceImpl = mock(RuntimeGrpc.RuntimeImplBase.class,delegatesTo(new RuntimeGrpc.RuntimeImplBase(){
        @Override
        public void getNextId(RuntimeProto.GetNextIdRequest request, StreamObserver<RuntimeProto.GetNextIdResponse> responseObserver) {
            responseObserver.onNext(
                    RuntimeProto.GetNextIdResponse
                            .newBuilder()
                            .setNextId(1)
                            .build());
            responseObserver.onCompleted();
        }
    }));

    private RuntimeClient client;

    @Before
    public void setUp() throws Exception {
        String serverName = InProcessServerBuilder.generateName();

        grpcCleanup.register(InProcessServerBuilder
                .forName(serverName).directExecutor().addService(serviceImpl).build().start());

        ManagedChannel channel = grpcCleanup.register(
                InProcessChannelBuilder.forName(serverName).directExecutor().build());

        client = new RuntimeClientBuilder()
                .buildGrpcWithExistingChannel(channel);
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
