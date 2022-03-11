package io.mosn.layotto.v1.mock;

import io.grpc.stub.StreamObserver;
import spec.proto.runtime.v1.RuntimeGrpc;
import spec.proto.runtime.v1.RuntimeProto;

public class MySequencerService extends RuntimeGrpc.RuntimeImplBase{

    @Override
    public void getNextId(RuntimeProto.GetNextIdRequest request, StreamObserver<RuntimeProto.GetNextIdResponse> responseObserver) {
        RuntimeProto.GetNextIdResponse response = RuntimeProto.GetNextIdResponse.newBuilder()
                .setNextId(1)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
