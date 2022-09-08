package spec.proto.extension.v1.email;

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
 * EmailService is used to send emails.
 * </pre>
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.34.1)",
        comments = "Source: email.proto")
public final class EmailServiceGrpc {

    private EmailServiceGrpc() {
    }

    public static final String                                                                                                                                                            SERVICE_NAME = "spec.proto.extension.v1.email.EmailService";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<spec.proto.extension.v1.email.Email.SendEmailWithTemplateRequest, spec.proto.extension.v1.email.Email.SendEmailWithTemplateResponse> getSendEmailWithTemplateMethod;

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "SendEmailWithTemplate",
            requestType = spec.proto.extension.v1.email.Email.SendEmailWithTemplateRequest.class,
            responseType = spec.proto.extension.v1.email.Email.SendEmailWithTemplateResponse.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<spec.proto.extension.v1.email.Email.SendEmailWithTemplateRequest,
            spec.proto.extension.v1.email.Email.SendEmailWithTemplateResponse> getSendEmailWithTemplateMethod() {
        io.grpc.MethodDescriptor<spec.proto.extension.v1.email.Email.SendEmailWithTemplateRequest, spec.proto.extension.v1.email.Email.SendEmailWithTemplateResponse> getSendEmailWithTemplateMethod;
        if ((getSendEmailWithTemplateMethod = EmailServiceGrpc.getSendEmailWithTemplateMethod) == null) {
            synchronized (EmailServiceGrpc.class) {
                if ((getSendEmailWithTemplateMethod = EmailServiceGrpc.getSendEmailWithTemplateMethod) == null) {
                    EmailServiceGrpc.getSendEmailWithTemplateMethod = getSendEmailWithTemplateMethod =
                            io.grpc.MethodDescriptor
                                .<spec.proto.extension.v1.email.Email.SendEmailWithTemplateRequest, spec.proto.extension.v1.email.Email.SendEmailWithTemplateResponse> newBuilder()
                                .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendEmailWithTemplate"))
                                .setSampledToLocalTracing(true)
                                .setRequestMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(
                                        spec.proto.extension.v1.email.Email.SendEmailWithTemplateRequest
                                            .getDefaultInstance()))
                                .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(
                                        spec.proto.extension.v1.email.Email.SendEmailWithTemplateResponse
                                            .getDefaultInstance()))
                                .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("SendEmailWithTemplate"))
                                .build();
                }
            }
        }
        return getSendEmailWithTemplateMethod;
    }

    private static volatile io.grpc.MethodDescriptor<spec.proto.extension.v1.email.Email.SendEmailRequest, spec.proto.extension.v1.email.Email.SendEmailResponse> getSendEmailMethod;

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "SendEmail",
            requestType = spec.proto.extension.v1.email.Email.SendEmailRequest.class,
            responseType = spec.proto.extension.v1.email.Email.SendEmailResponse.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<spec.proto.extension.v1.email.Email.SendEmailRequest,
            spec.proto.extension.v1.email.Email.SendEmailResponse> getSendEmailMethod() {
        io.grpc.MethodDescriptor<spec.proto.extension.v1.email.Email.SendEmailRequest, spec.proto.extension.v1.email.Email.SendEmailResponse> getSendEmailMethod;
        if ((getSendEmailMethod = EmailServiceGrpc.getSendEmailMethod) == null) {
            synchronized (EmailServiceGrpc.class) {
                if ((getSendEmailMethod = EmailServiceGrpc.getSendEmailMethod) == null) {
                    EmailServiceGrpc.getSendEmailMethod = getSendEmailMethod =
                            io.grpc.MethodDescriptor
                                .<spec.proto.extension.v1.email.Email.SendEmailRequest, spec.proto.extension.v1.email.Email.SendEmailResponse> newBuilder()
                                .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendEmail"))
                                .setSampledToLocalTracing(true)
                                .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                    spec.proto.extension.v1.email.Email.SendEmailRequest.getDefaultInstance()))
                                .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                    spec.proto.extension.v1.email.Email.SendEmailResponse.getDefaultInstance()))
                                .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("SendEmail"))
                                .build();
                }
            }
        }
        return getSendEmailMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static EmailServiceStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<EmailServiceStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<EmailServiceStub>() {
                    @java.lang.Override
                    public EmailServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                        return new EmailServiceStub(channel, callOptions);
                    }
                };
        return EmailServiceStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static EmailServiceBlockingStub newBlockingStub(
                                                           io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<EmailServiceBlockingStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<EmailServiceBlockingStub>() {
                    @java.lang.Override
                    public EmailServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                        return new EmailServiceBlockingStub(channel, callOptions);
                    }
                };
        return EmailServiceBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static EmailServiceFutureStub newFutureStub(
                                                       io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<EmailServiceFutureStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<EmailServiceFutureStub>() {
                    @java.lang.Override
                    public EmailServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                        return new EmailServiceFutureStub(channel, callOptions);
                    }
                };
        return EmailServiceFutureStub.newStub(factory, channel);
    }

    /**
     * <pre>
     * EmailService is used to send emails.
     * </pre>
     */
    public static abstract class EmailServiceImplBase implements io.grpc.BindableService {

        /**
         * <pre>
         * Send an email with template
         * </pre>
         */
        public void sendEmailWithTemplate(spec.proto.extension.v1.email.Email.SendEmailWithTemplateRequest request,
                                          io.grpc.stub.StreamObserver<spec.proto.extension.v1.email.Email.SendEmailWithTemplateResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSendEmailWithTemplateMethod(), responseObserver);
        }

        /**
         * <pre>
         * Send an email with raw content instead of using templates.
         * </pre>
         */
        public void sendEmail(spec.proto.extension.v1.email.Email.SendEmailRequest request,
                              io.grpc.stub.StreamObserver<spec.proto.extension.v1.email.Email.SendEmailResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSendEmailMethod(), responseObserver);
        }

        @java.lang.Override
        public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                .addMethod(
                    getSendEmailWithTemplateMethod(),
                    asyncUnaryCall(
                    new MethodHandlers<
                    spec.proto.extension.v1.email.Email.SendEmailWithTemplateRequest,
                    spec.proto.extension.v1.email.Email.SendEmailWithTemplateResponse>(
                        this, METHODID_SEND_EMAIL_WITH_TEMPLATE)))
                .addMethod(
                    getSendEmailMethod(),
                    asyncUnaryCall(
                    new MethodHandlers<
                    spec.proto.extension.v1.email.Email.SendEmailRequest,
                    spec.proto.extension.v1.email.Email.SendEmailResponse>(
                        this, METHODID_SEND_EMAIL)))
                .build();
        }
    }

    /**
     * <pre>
     * EmailService is used to send emails.
     * </pre>
     */
    public static final class EmailServiceStub extends io.grpc.stub.AbstractAsyncStub<EmailServiceStub> {
        private EmailServiceStub(
                                 io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected EmailServiceStub build(
                                         io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new EmailServiceStub(channel, callOptions);
        }

        /**
         * <pre>
         * Send an email with template
         * </pre>
         */
        public void sendEmailWithTemplate(spec.proto.extension.v1.email.Email.SendEmailWithTemplateRequest request,
                                          io.grpc.stub.StreamObserver<spec.proto.extension.v1.email.Email.SendEmailWithTemplateResponse> responseObserver) {
            asyncUnaryCall(
                getChannel().newCall(getSendEmailWithTemplateMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         * <pre>
         * Send an email with raw content instead of using templates.
         * </pre>
         */
        public void sendEmail(spec.proto.extension.v1.email.Email.SendEmailRequest request,
                              io.grpc.stub.StreamObserver<spec.proto.extension.v1.email.Email.SendEmailResponse> responseObserver) {
            asyncUnaryCall(
                getChannel().newCall(getSendEmailMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * <pre>
     * EmailService is used to send emails.
     * </pre>
     */
    public static final class EmailServiceBlockingStub extends
                                                      io.grpc.stub.AbstractBlockingStub<EmailServiceBlockingStub> {
        private EmailServiceBlockingStub(
                                         io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected EmailServiceBlockingStub build(
                                                 io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new EmailServiceBlockingStub(channel, callOptions);
        }

        /**
         * <pre>
         * Send an email with template
         * </pre>
         */
        public spec.proto.extension.v1.email.Email.SendEmailWithTemplateResponse sendEmailWithTemplate(spec.proto.extension.v1.email.Email.SendEmailWithTemplateRequest request) {
            return blockingUnaryCall(
                getChannel(), getSendEmailWithTemplateMethod(), getCallOptions(), request);
        }

        /**
         * <pre>
         * Send an email with raw content instead of using templates.
         * </pre>
         */
        public spec.proto.extension.v1.email.Email.SendEmailResponse sendEmail(spec.proto.extension.v1.email.Email.SendEmailRequest request) {
            return blockingUnaryCall(
                getChannel(), getSendEmailMethod(), getCallOptions(), request);
        }
    }

    /**
     * <pre>
     * EmailService is used to send emails.
     * </pre>
     */
    public static final class EmailServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EmailServiceFutureStub> {
        private EmailServiceFutureStub(
                                       io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected EmailServiceFutureStub build(
                                               io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new EmailServiceFutureStub(channel, callOptions);
        }

        /**
         * <pre>
         * Send an email with template
         * </pre>
         */
        public com.google.common.util.concurrent.ListenableFuture<spec.proto.extension.v1.email.Email.SendEmailWithTemplateResponse> sendEmailWithTemplate(
                                                                                                                                                           spec.proto.extension.v1.email.Email.SendEmailWithTemplateRequest request) {
            return futureUnaryCall(
                getChannel().newCall(getSendEmailWithTemplateMethod(), getCallOptions()), request);
        }

        /**
         * <pre>
         * Send an email with raw content instead of using templates.
         * </pre>
         */
        public com.google.common.util.concurrent.ListenableFuture<spec.proto.extension.v1.email.Email.SendEmailResponse> sendEmail(
                                                                                                                                   spec.proto.extension.v1.email.Email.SendEmailRequest request) {
            return futureUnaryCall(
                getChannel().newCall(getSendEmailMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_SEND_EMAIL_WITH_TEMPLATE = 0;
    private static final int METHODID_SEND_EMAIL               = 1;

    private static final class MethodHandlers<Req, Resp> implements
                                                         io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
                                                         io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
                                                         io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
                                                         io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final EmailServiceImplBase serviceImpl;
        private final int                  methodId;

        MethodHandlers(EmailServiceImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_SEND_EMAIL_WITH_TEMPLATE:
                    serviceImpl
                        .sendEmailWithTemplate(
                            (spec.proto.extension.v1.email.Email.SendEmailWithTemplateRequest) request,
                            (io.grpc.stub.StreamObserver<spec.proto.extension.v1.email.Email.SendEmailWithTemplateResponse>) responseObserver);
                    break;
                case METHODID_SEND_EMAIL:
                    serviceImpl
                        .sendEmail(
                            (spec.proto.extension.v1.email.Email.SendEmailRequest) request,
                            (io.grpc.stub.StreamObserver<spec.proto.extension.v1.email.Email.SendEmailResponse>) responseObserver);
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

    private static abstract class EmailServiceBaseDescriptorSupplier
                                                                    implements
                                                                    io.grpc.protobuf.ProtoFileDescriptorSupplier,
                                                                    io.grpc.protobuf.ProtoServiceDescriptorSupplier {
        EmailServiceBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return spec.proto.extension.v1.email.Email.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("EmailService");
        }
    }

    private static final class EmailServiceFileDescriptorSupplier
                                                                 extends EmailServiceBaseDescriptorSupplier {
        EmailServiceFileDescriptorSupplier() {
        }
    }

    private static final class EmailServiceMethodDescriptorSupplier
                                                                   extends EmailServiceBaseDescriptorSupplier
                                                                                                             implements
                                                                                                             io.grpc.protobuf.ProtoMethodDescriptorSupplier {
        private final String methodName;

        EmailServiceMethodDescriptorSupplier(String methodName) {
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
            synchronized (EmailServiceGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                        .setSchemaDescriptor(new EmailServiceFileDescriptorSupplier())
                        .addMethod(getSendEmailWithTemplateMethod())
                        .addMethod(getSendEmailMethod())
                        .build();
                }
            }
        }
        return result;
    }
}
