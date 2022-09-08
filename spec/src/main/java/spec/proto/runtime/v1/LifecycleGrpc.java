package spec.proto.runtime.v1;

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
 * Lifecycle API is used to manage the sidecar lifecycle.
 * For example, by invoking the lifecycle API, you can modify the components' configuration during runtime
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: proto/runtime/v1/lifecycle.proto")
public final class LifecycleGrpc {

  private LifecycleGrpc() {}

  public static final String SERVICE_NAME = "spec.proto.runtime.v1.Lifecycle";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.LifecycleProto.DynamicConfiguration,
      spec.proto.runtime.v1.LifecycleProto.ApplyConfigurationResponse> getApplyConfigurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApplyConfiguration",
      requestType = spec.proto.runtime.v1.LifecycleProto.DynamicConfiguration.class,
      responseType = spec.proto.runtime.v1.LifecycleProto.ApplyConfigurationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.LifecycleProto.DynamicConfiguration,
      spec.proto.runtime.v1.LifecycleProto.ApplyConfigurationResponse> getApplyConfigurationMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.LifecycleProto.DynamicConfiguration, spec.proto.runtime.v1.LifecycleProto.ApplyConfigurationResponse> getApplyConfigurationMethod;
    if ((getApplyConfigurationMethod = LifecycleGrpc.getApplyConfigurationMethod) == null) {
      synchronized (LifecycleGrpc.class) {
        if ((getApplyConfigurationMethod = LifecycleGrpc.getApplyConfigurationMethod) == null) {
          LifecycleGrpc.getApplyConfigurationMethod = getApplyConfigurationMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.LifecycleProto.DynamicConfiguration, spec.proto.runtime.v1.LifecycleProto.ApplyConfigurationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApplyConfiguration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.LifecycleProto.DynamicConfiguration.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.LifecycleProto.ApplyConfigurationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LifecycleMethodDescriptorSupplier("ApplyConfiguration"))
              .build();
        }
      }
    }
    return getApplyConfigurationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LifecycleStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LifecycleStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LifecycleStub>() {
        @java.lang.Override
        public LifecycleStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LifecycleStub(channel, callOptions);
        }
      };
    return LifecycleStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LifecycleBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LifecycleBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LifecycleBlockingStub>() {
        @java.lang.Override
        public LifecycleBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LifecycleBlockingStub(channel, callOptions);
        }
      };
    return LifecycleBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LifecycleFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LifecycleFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LifecycleFutureStub>() {
        @java.lang.Override
        public LifecycleFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LifecycleFutureStub(channel, callOptions);
        }
      };
    return LifecycleFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Lifecycle API is used to manage the sidecar lifecycle.
   * For example, by invoking the lifecycle API, you can modify the components' configuration during runtime
   * </pre>
   */
  public static abstract class LifecycleImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Apply the dynamic configuration.
     * The DynamicConfiguration here should be full configuration, not incremental configuration
     * </pre>
     */
    public void applyConfiguration(spec.proto.runtime.v1.LifecycleProto.DynamicConfiguration request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.LifecycleProto.ApplyConfigurationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getApplyConfigurationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getApplyConfigurationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.LifecycleProto.DynamicConfiguration,
                spec.proto.runtime.v1.LifecycleProto.ApplyConfigurationResponse>(
                  this, METHODID_APPLY_CONFIGURATION)))
          .build();
    }
  }

  /**
   * <pre>
   * Lifecycle API is used to manage the sidecar lifecycle.
   * For example, by invoking the lifecycle API, you can modify the components' configuration during runtime
   * </pre>
   */
  public static final class LifecycleStub extends io.grpc.stub.AbstractAsyncStub<LifecycleStub> {
    private LifecycleStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LifecycleStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LifecycleStub(channel, callOptions);
    }

    /**
     * <pre>
     * Apply the dynamic configuration.
     * The DynamicConfiguration here should be full configuration, not incremental configuration
     * </pre>
     */
    public void applyConfiguration(spec.proto.runtime.v1.LifecycleProto.DynamicConfiguration request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.LifecycleProto.ApplyConfigurationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getApplyConfigurationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Lifecycle API is used to manage the sidecar lifecycle.
   * For example, by invoking the lifecycle API, you can modify the components' configuration during runtime
   * </pre>
   */
  public static final class LifecycleBlockingStub extends io.grpc.stub.AbstractBlockingStub<LifecycleBlockingStub> {
    private LifecycleBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LifecycleBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LifecycleBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Apply the dynamic configuration.
     * The DynamicConfiguration here should be full configuration, not incremental configuration
     * </pre>
     */
    public spec.proto.runtime.v1.LifecycleProto.ApplyConfigurationResponse applyConfiguration(spec.proto.runtime.v1.LifecycleProto.DynamicConfiguration request) {
      return blockingUnaryCall(
          getChannel(), getApplyConfigurationMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Lifecycle API is used to manage the sidecar lifecycle.
   * For example, by invoking the lifecycle API, you can modify the components' configuration during runtime
   * </pre>
   */
  public static final class LifecycleFutureStub extends io.grpc.stub.AbstractFutureStub<LifecycleFutureStub> {
    private LifecycleFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LifecycleFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LifecycleFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Apply the dynamic configuration.
     * The DynamicConfiguration here should be full configuration, not incremental configuration
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.LifecycleProto.ApplyConfigurationResponse> applyConfiguration(
        spec.proto.runtime.v1.LifecycleProto.DynamicConfiguration request) {
      return futureUnaryCall(
          getChannel().newCall(getApplyConfigurationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_APPLY_CONFIGURATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LifecycleImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LifecycleImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_APPLY_CONFIGURATION:
          serviceImpl.applyConfiguration((spec.proto.runtime.v1.LifecycleProto.DynamicConfiguration) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.LifecycleProto.ApplyConfigurationResponse>) responseObserver);
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

  private static abstract class LifecycleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LifecycleBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return spec.proto.runtime.v1.LifecycleProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Lifecycle");
    }
  }

  private static final class LifecycleFileDescriptorSupplier
      extends LifecycleBaseDescriptorSupplier {
    LifecycleFileDescriptorSupplier() {}
  }

  private static final class LifecycleMethodDescriptorSupplier
      extends LifecycleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LifecycleMethodDescriptorSupplier(String methodName) {
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
      synchronized (LifecycleGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LifecycleFileDescriptorSupplier())
              .addMethod(getApplyConfigurationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
