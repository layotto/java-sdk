package spec.proto.extension.v1.phone;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * PhoneCallService is one of Notify APIs. It's used to send voice messages
 * </pre>
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.34.1)",
        comments = "Source: phone.proto")
public final class PhoneCallServiceGrpc {

    private PhoneCallServiceGrpc() {
    }

    public static final String                                                                                                                                                            SERVICE_NAME = "spec.proto.extension.v1.phone.PhoneCallService";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<spec.proto.extension.v1.phone.Phone.SendVoiceWithTemplateRequest, spec.proto.extension.v1.phone.Phone.SendVoiceWithTemplateResponse> getSendVoiceWithTemplateMethod;

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "SendVoiceWithTemplate",
            requestType = spec.proto.extension.v1.phone.Phone.SendVoiceWithTemplateRequest.class,
            responseType = spec.proto.extension.v1.phone.Phone.SendVoiceWithTemplateResponse.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<spec.proto.extension.v1.phone.Phone.SendVoiceWithTemplateRequest,
            spec.proto.extension.v1.phone.Phone.SendVoiceWithTemplateResponse> getSendVoiceWithTemplateMethod() {
        io.grpc.MethodDescriptor<spec.proto.extension.v1.phone.Phone.SendVoiceWithTemplateRequest, spec.proto.extension.v1.phone.Phone.SendVoiceWithTemplateResponse> getSendVoiceWithTemplateMethod;
        if ((getSendVoiceWithTemplateMethod = PhoneCallServiceGrpc.getSendVoiceWithTemplateMethod) == null) {
            synchronized (PhoneCallServiceGrpc.class) {
                if ((getSendVoiceWithTemplateMethod = PhoneCallServiceGrpc.getSendVoiceWithTemplateMethod) == null) {
                    PhoneCallServiceGrpc.getSendVoiceWithTemplateMethod = getSendVoiceWithTemplateMethod =
                            io.grpc.MethodDescriptor
                                .<spec.proto.extension.v1.phone.Phone.SendVoiceWithTemplateRequest, spec.proto.extension.v1.phone.Phone.SendVoiceWithTemplateResponse> newBuilder()
                                .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendVoiceWithTemplate"))
                                .setSampledToLocalTracing(true)
                                .setRequestMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(
                                        spec.proto.extension.v1.phone.Phone.SendVoiceWithTemplateRequest
                                            .getDefaultInstance()))
                                .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(
                                        spec.proto.extension.v1.phone.Phone.SendVoiceWithTemplateResponse
                                            .getDefaultInstance()))
                                .setSchemaDescriptor(
                                    new PhoneCallServiceMethodDescriptorSupplier("SendVoiceWithTemplate"))
                                .build();
                }
            }
        }
        return getSendVoiceWithTemplateMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static PhoneCallServiceStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<PhoneCallServiceStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<PhoneCallServiceStub>() {
                    @java.lang.Override
                    public PhoneCallServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                        return new PhoneCallServiceStub(channel, callOptions);
                    }
                };
        return PhoneCallServiceStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static PhoneCallServiceBlockingStub newBlockingStub(
                                                               io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<PhoneCallServiceBlockingStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<PhoneCallServiceBlockingStub>() {
                    @java.lang.Override
                    public PhoneCallServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                        return new PhoneCallServiceBlockingStub(channel, callOptions);
                    }
                };
        return PhoneCallServiceBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static PhoneCallServiceFutureStub newFutureStub(
                                                           io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<PhoneCallServiceFutureStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<PhoneCallServiceFutureStub>() {
                    @java.lang.Override
                    public PhoneCallServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                        return new PhoneCallServiceFutureStub(channel, callOptions);
                    }
                };
        return PhoneCallServiceFutureStub.newStub(factory, channel);
    }

    /**
     * <pre>
     * PhoneCallService is one of Notify APIs. It's used to send voice messages
     * </pre>
     */
    public static abstract class PhoneCallServiceImplBase implements io.grpc.BindableService {

        /**
         * <pre>
         * Send voice using the specific template
         * </pre>
         */
        public void sendVoiceWithTemplate(spec.proto.extension.v1.phone.Phone.SendVoiceWithTemplateRequest request,
                                          io.grpc.stub.StreamObserver<spec.proto.extension.v1.phone.Phone.SendVoiceWithTemplateResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSendVoiceWithTemplateMethod(), responseObserver);
        }

        @java.lang.Override
        public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                .addMethod(
                    getSendVoiceWithTemplateMethod(),
                    asyncUnaryCall(
                    new MethodHandlers<
                    spec.proto.extension.v1.phone.Phone.SendVoiceWithTemplateRequest,
                    spec.proto.extension.v1.phone.Phone.SendVoiceWithTemplateResponse>(
                        this, METHODID_SEND_VOICE_WITH_TEMPLATE)))
                .build();
        }
    }

    /**
     * <pre>
     * PhoneCallService is one of Notify APIs. It's used to send voice messages
     * </pre>
     */
    public static final class PhoneCallServiceStub extends io.grpc.stub.AbstractAsyncStub<PhoneCallServiceStub> {
        private PhoneCallServiceStub(
                                     io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected PhoneCallServiceStub build(
                                             io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new PhoneCallServiceStub(channel, callOptions);
        }

        /**
         * <pre>
         * Send voice using the specific template
         * </pre>
         */
        public void sendVoiceWithTemplate(spec.proto.extension.v1.phone.Phone.SendVoiceWithTemplateRequest request,
                                          io.grpc.stub.StreamObserver<spec.proto.extension.v1.phone.Phone.SendVoiceWithTemplateResponse> responseObserver) {
            asyncUnaryCall(
                getChannel().newCall(getSendVoiceWithTemplateMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * <pre>
     * PhoneCallService is one of Notify APIs. It's used to send voice messages
     * </pre>
     */
    public static final class PhoneCallServiceBlockingStub
                                                          extends
                                                          io.grpc.stub.AbstractBlockingStub<PhoneCallServiceBlockingStub> {
        private PhoneCallServiceBlockingStub(
                                             io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected PhoneCallServiceBlockingStub build(
                                                     io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new PhoneCallServiceBlockingStub(channel, callOptions);
        }

        /**
         * <pre>
         * Send voice using the specific template
         * </pre>
         */
        public spec.proto.extension.v1.phone.Phone.SendVoiceWithTemplateResponse sendVoiceWithTemplate(spec.proto.extension.v1.phone.Phone.SendVoiceWithTemplateRequest request) {
            return blockingUnaryCall(
                getChannel(), getSendVoiceWithTemplateMethod(), getCallOptions(), request);
        }
    }

    /**
     * <pre>
     * PhoneCallService is one of Notify APIs. It's used to send voice messages
     * </pre>
     */
    public static final class PhoneCallServiceFutureStub extends
                                                        io.grpc.stub.AbstractFutureStub<PhoneCallServiceFutureStub> {
        private PhoneCallServiceFutureStub(
                                           io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected PhoneCallServiceFutureStub build(
                                                   io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new PhoneCallServiceFutureStub(channel, callOptions);
        }

        /**
         * <pre>
         * Send voice using the specific template
         * </pre>
         */
        public com.google.common.util.concurrent.ListenableFuture<spec.proto.extension.v1.phone.Phone.SendVoiceWithTemplateResponse> sendVoiceWithTemplate(
                                                                                                                                                           spec.proto.extension.v1.phone.Phone.SendVoiceWithTemplateRequest request) {
            return futureUnaryCall(
                getChannel().newCall(getSendVoiceWithTemplateMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_SEND_VOICE_WITH_TEMPLATE = 0;

    private static final class MethodHandlers<Req, Resp> implements
                                                         io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
                                                         io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
                                                         io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
                                                         io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final PhoneCallServiceImplBase serviceImpl;
        private final int                      methodId;

        MethodHandlers(PhoneCallServiceImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_SEND_VOICE_WITH_TEMPLATE:
                    serviceImpl
                        .sendVoiceWithTemplate(
                            (spec.proto.extension.v1.phone.Phone.SendVoiceWithTemplateRequest) request,
                            (io.grpc.stub.StreamObserver<spec.proto.extension.v1.phone.Phone.SendVoiceWithTemplateResponse>) responseObserver);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(
                                                       io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new AssertionError();
            }
        }
    }

    private static abstract class PhoneCallServiceBaseDescriptorSupplier
                                                                        implements
                                                                        io.grpc.protobuf.ProtoFileDescriptorSupplier,
                                                                        io.grpc.protobuf.ProtoServiceDescriptorSupplier {
        PhoneCallServiceBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return spec.proto.extension.v1.phone.Phone.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("PhoneCallService");
        }
    }

    private static final class PhoneCallServiceFileDescriptorSupplier
                                                                     extends PhoneCallServiceBaseDescriptorSupplier {
        PhoneCallServiceFileDescriptorSupplier() {
        }
    }

    private static final class PhoneCallServiceMethodDescriptorSupplier
                                                                       extends PhoneCallServiceBaseDescriptorSupplier
                                                                                                                     implements
                                                                                                                     io.grpc.protobuf.ProtoMethodDescriptorSupplier {
        private final String methodName;

        PhoneCallServiceMethodDescriptorSupplier(String methodName) {
            this.methodName = methodName;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(methodName);
        }
    }

    private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

    public static io.grpc.ServiceDescriptor getServiceDescriptor() {
        io.grpc.ServiceDescriptor result = serviceDescriptor;
        if (result == null) {
            synchronized (PhoneCallServiceGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                        .setSchemaDescriptor(new PhoneCallServiceFileDescriptorSupplier())
                        .addMethod(getSendVoiceWithTemplateMethod())
                        .build();
                }
            }
        }
        return result;
    }
}
