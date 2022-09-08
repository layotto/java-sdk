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
 * Runtime encapsulates variours Runtime APIs(such as Configuration API, Pub/Sub API, etc)
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: proto/runtime/v1/runtime.proto")
public final class RuntimeGrpc {

  private RuntimeGrpc() {}

  public static final String SERVICE_NAME = "spec.proto.runtime.v1.Runtime";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.SayHelloRequest,
      spec.proto.runtime.v1.RuntimeProto.SayHelloResponse> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = spec.proto.runtime.v1.RuntimeProto.SayHelloRequest.class,
      responseType = spec.proto.runtime.v1.RuntimeProto.SayHelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.SayHelloRequest,
      spec.proto.runtime.v1.RuntimeProto.SayHelloResponse> getSayHelloMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.SayHelloRequest, spec.proto.runtime.v1.RuntimeProto.SayHelloResponse> getSayHelloMethod;
    if ((getSayHelloMethod = RuntimeGrpc.getSayHelloMethod) == null) {
      synchronized (RuntimeGrpc.class) {
        if ((getSayHelloMethod = RuntimeGrpc.getSayHelloMethod) == null) {
          RuntimeGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.RuntimeProto.SayHelloRequest, spec.proto.runtime.v1.RuntimeProto.SayHelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.SayHelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.SayHelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RuntimeMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.InvokeServiceRequest,
      spec.proto.runtime.v1.RuntimeProto.InvokeResponse> getInvokeServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InvokeService",
      requestType = spec.proto.runtime.v1.RuntimeProto.InvokeServiceRequest.class,
      responseType = spec.proto.runtime.v1.RuntimeProto.InvokeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.InvokeServiceRequest,
      spec.proto.runtime.v1.RuntimeProto.InvokeResponse> getInvokeServiceMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.InvokeServiceRequest, spec.proto.runtime.v1.RuntimeProto.InvokeResponse> getInvokeServiceMethod;
    if ((getInvokeServiceMethod = RuntimeGrpc.getInvokeServiceMethod) == null) {
      synchronized (RuntimeGrpc.class) {
        if ((getInvokeServiceMethod = RuntimeGrpc.getInvokeServiceMethod) == null) {
          RuntimeGrpc.getInvokeServiceMethod = getInvokeServiceMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.RuntimeProto.InvokeServiceRequest, spec.proto.runtime.v1.RuntimeProto.InvokeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InvokeService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.InvokeServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.InvokeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RuntimeMethodDescriptorSupplier("InvokeService"))
              .build();
        }
      }
    }
    return getInvokeServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.GetConfigurationRequest,
      spec.proto.runtime.v1.RuntimeProto.GetConfigurationResponse> getGetConfigurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConfiguration",
      requestType = spec.proto.runtime.v1.RuntimeProto.GetConfigurationRequest.class,
      responseType = spec.proto.runtime.v1.RuntimeProto.GetConfigurationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.GetConfigurationRequest,
      spec.proto.runtime.v1.RuntimeProto.GetConfigurationResponse> getGetConfigurationMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.GetConfigurationRequest, spec.proto.runtime.v1.RuntimeProto.GetConfigurationResponse> getGetConfigurationMethod;
    if ((getGetConfigurationMethod = RuntimeGrpc.getGetConfigurationMethod) == null) {
      synchronized (RuntimeGrpc.class) {
        if ((getGetConfigurationMethod = RuntimeGrpc.getGetConfigurationMethod) == null) {
          RuntimeGrpc.getGetConfigurationMethod = getGetConfigurationMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.RuntimeProto.GetConfigurationRequest, spec.proto.runtime.v1.RuntimeProto.GetConfigurationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetConfiguration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.GetConfigurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.GetConfigurationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RuntimeMethodDescriptorSupplier("GetConfiguration"))
              .build();
        }
      }
    }
    return getGetConfigurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.SaveConfigurationRequest,
      com.google.protobuf.Empty> getSaveConfigurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveConfiguration",
      requestType = spec.proto.runtime.v1.RuntimeProto.SaveConfigurationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.SaveConfigurationRequest,
      com.google.protobuf.Empty> getSaveConfigurationMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.SaveConfigurationRequest, com.google.protobuf.Empty> getSaveConfigurationMethod;
    if ((getSaveConfigurationMethod = RuntimeGrpc.getSaveConfigurationMethod) == null) {
      synchronized (RuntimeGrpc.class) {
        if ((getSaveConfigurationMethod = RuntimeGrpc.getSaveConfigurationMethod) == null) {
          RuntimeGrpc.getSaveConfigurationMethod = getSaveConfigurationMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.RuntimeProto.SaveConfigurationRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveConfiguration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.SaveConfigurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RuntimeMethodDescriptorSupplier("SaveConfiguration"))
              .build();
        }
      }
    }
    return getSaveConfigurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.DeleteConfigurationRequest,
      com.google.protobuf.Empty> getDeleteConfigurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteConfiguration",
      requestType = spec.proto.runtime.v1.RuntimeProto.DeleteConfigurationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.DeleteConfigurationRequest,
      com.google.protobuf.Empty> getDeleteConfigurationMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.DeleteConfigurationRequest, com.google.protobuf.Empty> getDeleteConfigurationMethod;
    if ((getDeleteConfigurationMethod = RuntimeGrpc.getDeleteConfigurationMethod) == null) {
      synchronized (RuntimeGrpc.class) {
        if ((getDeleteConfigurationMethod = RuntimeGrpc.getDeleteConfigurationMethod) == null) {
          RuntimeGrpc.getDeleteConfigurationMethod = getDeleteConfigurationMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.RuntimeProto.DeleteConfigurationRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteConfiguration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.DeleteConfigurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RuntimeMethodDescriptorSupplier("DeleteConfiguration"))
              .build();
        }
      }
    }
    return getDeleteConfigurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.SubscribeConfigurationRequest,
      spec.proto.runtime.v1.RuntimeProto.SubscribeConfigurationResponse> getSubscribeConfigurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeConfiguration",
      requestType = spec.proto.runtime.v1.RuntimeProto.SubscribeConfigurationRequest.class,
      responseType = spec.proto.runtime.v1.RuntimeProto.SubscribeConfigurationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.SubscribeConfigurationRequest,
      spec.proto.runtime.v1.RuntimeProto.SubscribeConfigurationResponse> getSubscribeConfigurationMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.SubscribeConfigurationRequest, spec.proto.runtime.v1.RuntimeProto.SubscribeConfigurationResponse> getSubscribeConfigurationMethod;
    if ((getSubscribeConfigurationMethod = RuntimeGrpc.getSubscribeConfigurationMethod) == null) {
      synchronized (RuntimeGrpc.class) {
        if ((getSubscribeConfigurationMethod = RuntimeGrpc.getSubscribeConfigurationMethod) == null) {
          RuntimeGrpc.getSubscribeConfigurationMethod = getSubscribeConfigurationMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.RuntimeProto.SubscribeConfigurationRequest, spec.proto.runtime.v1.RuntimeProto.SubscribeConfigurationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeConfiguration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.SubscribeConfigurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.SubscribeConfigurationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RuntimeMethodDescriptorSupplier("SubscribeConfiguration"))
              .build();
        }
      }
    }
    return getSubscribeConfigurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.TryLockRequest,
      spec.proto.runtime.v1.RuntimeProto.TryLockResponse> getTryLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TryLock",
      requestType = spec.proto.runtime.v1.RuntimeProto.TryLockRequest.class,
      responseType = spec.proto.runtime.v1.RuntimeProto.TryLockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.TryLockRequest,
      spec.proto.runtime.v1.RuntimeProto.TryLockResponse> getTryLockMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.TryLockRequest, spec.proto.runtime.v1.RuntimeProto.TryLockResponse> getTryLockMethod;
    if ((getTryLockMethod = RuntimeGrpc.getTryLockMethod) == null) {
      synchronized (RuntimeGrpc.class) {
        if ((getTryLockMethod = RuntimeGrpc.getTryLockMethod) == null) {
          RuntimeGrpc.getTryLockMethod = getTryLockMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.RuntimeProto.TryLockRequest, spec.proto.runtime.v1.RuntimeProto.TryLockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TryLock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.TryLockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.TryLockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RuntimeMethodDescriptorSupplier("TryLock"))
              .build();
        }
      }
    }
    return getTryLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.UnlockRequest,
      spec.proto.runtime.v1.RuntimeProto.UnlockResponse> getUnlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unlock",
      requestType = spec.proto.runtime.v1.RuntimeProto.UnlockRequest.class,
      responseType = spec.proto.runtime.v1.RuntimeProto.UnlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.UnlockRequest,
      spec.proto.runtime.v1.RuntimeProto.UnlockResponse> getUnlockMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.UnlockRequest, spec.proto.runtime.v1.RuntimeProto.UnlockResponse> getUnlockMethod;
    if ((getUnlockMethod = RuntimeGrpc.getUnlockMethod) == null) {
      synchronized (RuntimeGrpc.class) {
        if ((getUnlockMethod = RuntimeGrpc.getUnlockMethod) == null) {
          RuntimeGrpc.getUnlockMethod = getUnlockMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.RuntimeProto.UnlockRequest, spec.proto.runtime.v1.RuntimeProto.UnlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.UnlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.UnlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RuntimeMethodDescriptorSupplier("Unlock"))
              .build();
        }
      }
    }
    return getUnlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.GetNextIdRequest,
      spec.proto.runtime.v1.RuntimeProto.GetNextIdResponse> getGetNextIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNextId",
      requestType = spec.proto.runtime.v1.RuntimeProto.GetNextIdRequest.class,
      responseType = spec.proto.runtime.v1.RuntimeProto.GetNextIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.GetNextIdRequest,
      spec.proto.runtime.v1.RuntimeProto.GetNextIdResponse> getGetNextIdMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.GetNextIdRequest, spec.proto.runtime.v1.RuntimeProto.GetNextIdResponse> getGetNextIdMethod;
    if ((getGetNextIdMethod = RuntimeGrpc.getGetNextIdMethod) == null) {
      synchronized (RuntimeGrpc.class) {
        if ((getGetNextIdMethod = RuntimeGrpc.getGetNextIdMethod) == null) {
          RuntimeGrpc.getGetNextIdMethod = getGetNextIdMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.RuntimeProto.GetNextIdRequest, spec.proto.runtime.v1.RuntimeProto.GetNextIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNextId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.GetNextIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.GetNextIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RuntimeMethodDescriptorSupplier("GetNextId"))
              .build();
        }
      }
    }
    return getGetNextIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.GetStateRequest,
      spec.proto.runtime.v1.RuntimeProto.GetStateResponse> getGetStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetState",
      requestType = spec.proto.runtime.v1.RuntimeProto.GetStateRequest.class,
      responseType = spec.proto.runtime.v1.RuntimeProto.GetStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.GetStateRequest,
      spec.proto.runtime.v1.RuntimeProto.GetStateResponse> getGetStateMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.GetStateRequest, spec.proto.runtime.v1.RuntimeProto.GetStateResponse> getGetStateMethod;
    if ((getGetStateMethod = RuntimeGrpc.getGetStateMethod) == null) {
      synchronized (RuntimeGrpc.class) {
        if ((getGetStateMethod = RuntimeGrpc.getGetStateMethod) == null) {
          RuntimeGrpc.getGetStateMethod = getGetStateMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.RuntimeProto.GetStateRequest, spec.proto.runtime.v1.RuntimeProto.GetStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.GetStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.GetStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RuntimeMethodDescriptorSupplier("GetState"))
              .build();
        }
      }
    }
    return getGetStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.GetBulkStateRequest,
      spec.proto.runtime.v1.RuntimeProto.GetBulkStateResponse> getGetBulkStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBulkState",
      requestType = spec.proto.runtime.v1.RuntimeProto.GetBulkStateRequest.class,
      responseType = spec.proto.runtime.v1.RuntimeProto.GetBulkStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.GetBulkStateRequest,
      spec.proto.runtime.v1.RuntimeProto.GetBulkStateResponse> getGetBulkStateMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.GetBulkStateRequest, spec.proto.runtime.v1.RuntimeProto.GetBulkStateResponse> getGetBulkStateMethod;
    if ((getGetBulkStateMethod = RuntimeGrpc.getGetBulkStateMethod) == null) {
      synchronized (RuntimeGrpc.class) {
        if ((getGetBulkStateMethod = RuntimeGrpc.getGetBulkStateMethod) == null) {
          RuntimeGrpc.getGetBulkStateMethod = getGetBulkStateMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.RuntimeProto.GetBulkStateRequest, spec.proto.runtime.v1.RuntimeProto.GetBulkStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBulkState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.GetBulkStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.GetBulkStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RuntimeMethodDescriptorSupplier("GetBulkState"))
              .build();
        }
      }
    }
    return getGetBulkStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.SaveStateRequest,
      com.google.protobuf.Empty> getSaveStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveState",
      requestType = spec.proto.runtime.v1.RuntimeProto.SaveStateRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.SaveStateRequest,
      com.google.protobuf.Empty> getSaveStateMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.SaveStateRequest, com.google.protobuf.Empty> getSaveStateMethod;
    if ((getSaveStateMethod = RuntimeGrpc.getSaveStateMethod) == null) {
      synchronized (RuntimeGrpc.class) {
        if ((getSaveStateMethod = RuntimeGrpc.getSaveStateMethod) == null) {
          RuntimeGrpc.getSaveStateMethod = getSaveStateMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.RuntimeProto.SaveStateRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.SaveStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RuntimeMethodDescriptorSupplier("SaveState"))
              .build();
        }
      }
    }
    return getSaveStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.DeleteStateRequest,
      com.google.protobuf.Empty> getDeleteStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteState",
      requestType = spec.proto.runtime.v1.RuntimeProto.DeleteStateRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.DeleteStateRequest,
      com.google.protobuf.Empty> getDeleteStateMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.DeleteStateRequest, com.google.protobuf.Empty> getDeleteStateMethod;
    if ((getDeleteStateMethod = RuntimeGrpc.getDeleteStateMethod) == null) {
      synchronized (RuntimeGrpc.class) {
        if ((getDeleteStateMethod = RuntimeGrpc.getDeleteStateMethod) == null) {
          RuntimeGrpc.getDeleteStateMethod = getDeleteStateMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.RuntimeProto.DeleteStateRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.DeleteStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RuntimeMethodDescriptorSupplier("DeleteState"))
              .build();
        }
      }
    }
    return getDeleteStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.DeleteBulkStateRequest,
      com.google.protobuf.Empty> getDeleteBulkStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBulkState",
      requestType = spec.proto.runtime.v1.RuntimeProto.DeleteBulkStateRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.DeleteBulkStateRequest,
      com.google.protobuf.Empty> getDeleteBulkStateMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.DeleteBulkStateRequest, com.google.protobuf.Empty> getDeleteBulkStateMethod;
    if ((getDeleteBulkStateMethod = RuntimeGrpc.getDeleteBulkStateMethod) == null) {
      synchronized (RuntimeGrpc.class) {
        if ((getDeleteBulkStateMethod = RuntimeGrpc.getDeleteBulkStateMethod) == null) {
          RuntimeGrpc.getDeleteBulkStateMethod = getDeleteBulkStateMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.RuntimeProto.DeleteBulkStateRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBulkState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.DeleteBulkStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RuntimeMethodDescriptorSupplier("DeleteBulkState"))
              .build();
        }
      }
    }
    return getDeleteBulkStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.ExecuteStateTransactionRequest,
      com.google.protobuf.Empty> getExecuteStateTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteStateTransaction",
      requestType = spec.proto.runtime.v1.RuntimeProto.ExecuteStateTransactionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.ExecuteStateTransactionRequest,
      com.google.protobuf.Empty> getExecuteStateTransactionMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.ExecuteStateTransactionRequest, com.google.protobuf.Empty> getExecuteStateTransactionMethod;
    if ((getExecuteStateTransactionMethod = RuntimeGrpc.getExecuteStateTransactionMethod) == null) {
      synchronized (RuntimeGrpc.class) {
        if ((getExecuteStateTransactionMethod = RuntimeGrpc.getExecuteStateTransactionMethod) == null) {
          RuntimeGrpc.getExecuteStateTransactionMethod = getExecuteStateTransactionMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.RuntimeProto.ExecuteStateTransactionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecuteStateTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.ExecuteStateTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RuntimeMethodDescriptorSupplier("ExecuteStateTransaction"))
              .build();
        }
      }
    }
    return getExecuteStateTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.PublishEventRequest,
      com.google.protobuf.Empty> getPublishEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishEvent",
      requestType = spec.proto.runtime.v1.RuntimeProto.PublishEventRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.PublishEventRequest,
      com.google.protobuf.Empty> getPublishEventMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.PublishEventRequest, com.google.protobuf.Empty> getPublishEventMethod;
    if ((getPublishEventMethod = RuntimeGrpc.getPublishEventMethod) == null) {
      synchronized (RuntimeGrpc.class) {
        if ((getPublishEventMethod = RuntimeGrpc.getPublishEventMethod) == null) {
          RuntimeGrpc.getPublishEventMethod = getPublishEventMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.RuntimeProto.PublishEventRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.PublishEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RuntimeMethodDescriptorSupplier("PublishEvent"))
              .build();
        }
      }
    }
    return getPublishEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.GetFileRequest,
      spec.proto.runtime.v1.RuntimeProto.GetFileResponse> getGetFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFile",
      requestType = spec.proto.runtime.v1.RuntimeProto.GetFileRequest.class,
      responseType = spec.proto.runtime.v1.RuntimeProto.GetFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.GetFileRequest,
      spec.proto.runtime.v1.RuntimeProto.GetFileResponse> getGetFileMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.GetFileRequest, spec.proto.runtime.v1.RuntimeProto.GetFileResponse> getGetFileMethod;
    if ((getGetFileMethod = RuntimeGrpc.getGetFileMethod) == null) {
      synchronized (RuntimeGrpc.class) {
        if ((getGetFileMethod = RuntimeGrpc.getGetFileMethod) == null) {
          RuntimeGrpc.getGetFileMethod = getGetFileMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.RuntimeProto.GetFileRequest, spec.proto.runtime.v1.RuntimeProto.GetFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.GetFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.GetFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RuntimeMethodDescriptorSupplier("GetFile"))
              .build();
        }
      }
    }
    return getGetFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.PutFileRequest,
      com.google.protobuf.Empty> getPutFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutFile",
      requestType = spec.proto.runtime.v1.RuntimeProto.PutFileRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.PutFileRequest,
      com.google.protobuf.Empty> getPutFileMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.PutFileRequest, com.google.protobuf.Empty> getPutFileMethod;
    if ((getPutFileMethod = RuntimeGrpc.getPutFileMethod) == null) {
      synchronized (RuntimeGrpc.class) {
        if ((getPutFileMethod = RuntimeGrpc.getPutFileMethod) == null) {
          RuntimeGrpc.getPutFileMethod = getPutFileMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.RuntimeProto.PutFileRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.PutFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RuntimeMethodDescriptorSupplier("PutFile"))
              .build();
        }
      }
    }
    return getPutFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.ListFileRequest,
      spec.proto.runtime.v1.RuntimeProto.ListFileResp> getListFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFile",
      requestType = spec.proto.runtime.v1.RuntimeProto.ListFileRequest.class,
      responseType = spec.proto.runtime.v1.RuntimeProto.ListFileResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.ListFileRequest,
      spec.proto.runtime.v1.RuntimeProto.ListFileResp> getListFileMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.ListFileRequest, spec.proto.runtime.v1.RuntimeProto.ListFileResp> getListFileMethod;
    if ((getListFileMethod = RuntimeGrpc.getListFileMethod) == null) {
      synchronized (RuntimeGrpc.class) {
        if ((getListFileMethod = RuntimeGrpc.getListFileMethod) == null) {
          RuntimeGrpc.getListFileMethod = getListFileMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.RuntimeProto.ListFileRequest, spec.proto.runtime.v1.RuntimeProto.ListFileResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.ListFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.ListFileResp.getDefaultInstance()))
              .setSchemaDescriptor(new RuntimeMethodDescriptorSupplier("ListFile"))
              .build();
        }
      }
    }
    return getListFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.DelFileRequest,
      com.google.protobuf.Empty> getDelFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelFile",
      requestType = spec.proto.runtime.v1.RuntimeProto.DelFileRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.DelFileRequest,
      com.google.protobuf.Empty> getDelFileMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.DelFileRequest, com.google.protobuf.Empty> getDelFileMethod;
    if ((getDelFileMethod = RuntimeGrpc.getDelFileMethod) == null) {
      synchronized (RuntimeGrpc.class) {
        if ((getDelFileMethod = RuntimeGrpc.getDelFileMethod) == null) {
          RuntimeGrpc.getDelFileMethod = getDelFileMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.RuntimeProto.DelFileRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.DelFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RuntimeMethodDescriptorSupplier("DelFile"))
              .build();
        }
      }
    }
    return getDelFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.GetFileMetaRequest,
      spec.proto.runtime.v1.RuntimeProto.GetFileMetaResponse> getGetFileMetaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFileMeta",
      requestType = spec.proto.runtime.v1.RuntimeProto.GetFileMetaRequest.class,
      responseType = spec.proto.runtime.v1.RuntimeProto.GetFileMetaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.GetFileMetaRequest,
      spec.proto.runtime.v1.RuntimeProto.GetFileMetaResponse> getGetFileMetaMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.GetFileMetaRequest, spec.proto.runtime.v1.RuntimeProto.GetFileMetaResponse> getGetFileMetaMethod;
    if ((getGetFileMetaMethod = RuntimeGrpc.getGetFileMetaMethod) == null) {
      synchronized (RuntimeGrpc.class) {
        if ((getGetFileMetaMethod = RuntimeGrpc.getGetFileMetaMethod) == null) {
          RuntimeGrpc.getGetFileMetaMethod = getGetFileMetaMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.RuntimeProto.GetFileMetaRequest, spec.proto.runtime.v1.RuntimeProto.GetFileMetaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFileMeta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.GetFileMetaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.GetFileMetaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RuntimeMethodDescriptorSupplier("GetFileMeta"))
              .build();
        }
      }
    }
    return getGetFileMetaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.InvokeBindingRequest,
      spec.proto.runtime.v1.RuntimeProto.InvokeBindingResponse> getInvokeBindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InvokeBinding",
      requestType = spec.proto.runtime.v1.RuntimeProto.InvokeBindingRequest.class,
      responseType = spec.proto.runtime.v1.RuntimeProto.InvokeBindingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.InvokeBindingRequest,
      spec.proto.runtime.v1.RuntimeProto.InvokeBindingResponse> getInvokeBindingMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.InvokeBindingRequest, spec.proto.runtime.v1.RuntimeProto.InvokeBindingResponse> getInvokeBindingMethod;
    if ((getInvokeBindingMethod = RuntimeGrpc.getInvokeBindingMethod) == null) {
      synchronized (RuntimeGrpc.class) {
        if ((getInvokeBindingMethod = RuntimeGrpc.getInvokeBindingMethod) == null) {
          RuntimeGrpc.getInvokeBindingMethod = getInvokeBindingMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.RuntimeProto.InvokeBindingRequest, spec.proto.runtime.v1.RuntimeProto.InvokeBindingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InvokeBinding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.InvokeBindingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.InvokeBindingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RuntimeMethodDescriptorSupplier("InvokeBinding"))
              .build();
        }
      }
    }
    return getInvokeBindingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.GetSecretRequest,
      spec.proto.runtime.v1.RuntimeProto.GetSecretResponse> getGetSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSecret",
      requestType = spec.proto.runtime.v1.RuntimeProto.GetSecretRequest.class,
      responseType = spec.proto.runtime.v1.RuntimeProto.GetSecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.GetSecretRequest,
      spec.proto.runtime.v1.RuntimeProto.GetSecretResponse> getGetSecretMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.GetSecretRequest, spec.proto.runtime.v1.RuntimeProto.GetSecretResponse> getGetSecretMethod;
    if ((getGetSecretMethod = RuntimeGrpc.getGetSecretMethod) == null) {
      synchronized (RuntimeGrpc.class) {
        if ((getGetSecretMethod = RuntimeGrpc.getGetSecretMethod) == null) {
          RuntimeGrpc.getGetSecretMethod = getGetSecretMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.RuntimeProto.GetSecretRequest, spec.proto.runtime.v1.RuntimeProto.GetSecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.GetSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.GetSecretResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RuntimeMethodDescriptorSupplier("GetSecret"))
              .build();
        }
      }
    }
    return getGetSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.GetBulkSecretRequest,
      spec.proto.runtime.v1.RuntimeProto.GetBulkSecretResponse> getGetBulkSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBulkSecret",
      requestType = spec.proto.runtime.v1.RuntimeProto.GetBulkSecretRequest.class,
      responseType = spec.proto.runtime.v1.RuntimeProto.GetBulkSecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.GetBulkSecretRequest,
      spec.proto.runtime.v1.RuntimeProto.GetBulkSecretResponse> getGetBulkSecretMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.RuntimeProto.GetBulkSecretRequest, spec.proto.runtime.v1.RuntimeProto.GetBulkSecretResponse> getGetBulkSecretMethod;
    if ((getGetBulkSecretMethod = RuntimeGrpc.getGetBulkSecretMethod) == null) {
      synchronized (RuntimeGrpc.class) {
        if ((getGetBulkSecretMethod = RuntimeGrpc.getGetBulkSecretMethod) == null) {
          RuntimeGrpc.getGetBulkSecretMethod = getGetBulkSecretMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.RuntimeProto.GetBulkSecretRequest, spec.proto.runtime.v1.RuntimeProto.GetBulkSecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBulkSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.GetBulkSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.RuntimeProto.GetBulkSecretResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RuntimeMethodDescriptorSupplier("GetBulkSecret"))
              .build();
        }
      }
    }
    return getGetBulkSecretMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RuntimeStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RuntimeStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RuntimeStub>() {
        @java.lang.Override
        public RuntimeStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RuntimeStub(channel, callOptions);
        }
      };
    return RuntimeStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RuntimeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RuntimeBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RuntimeBlockingStub>() {
        @java.lang.Override
        public RuntimeBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RuntimeBlockingStub(channel, callOptions);
        }
      };
    return RuntimeBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RuntimeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RuntimeFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RuntimeFutureStub>() {
        @java.lang.Override
        public RuntimeFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RuntimeFutureStub(channel, callOptions);
        }
      };
    return RuntimeFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Runtime encapsulates variours Runtime APIs(such as Configuration API, Pub/Sub API, etc)
   * </pre>
   */
  public static abstract class RuntimeImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *SayHello used for test
     * </pre>
     */
    public void sayHello(spec.proto.runtime.v1.RuntimeProto.SayHelloRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.SayHelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     * <pre>
     * InvokeService do rpc calls
     * </pre>
     */
    public void invokeService(spec.proto.runtime.v1.RuntimeProto.InvokeServiceRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.InvokeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInvokeServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetConfiguration gets configuration from configuration store.
     * </pre>
     */
    public void getConfiguration(spec.proto.runtime.v1.RuntimeProto.GetConfigurationRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.GetConfigurationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetConfigurationMethod(), responseObserver);
    }

    /**
     * <pre>
     * SaveConfiguration saves configuration into configuration store.
     * </pre>
     */
    public void saveConfiguration(spec.proto.runtime.v1.RuntimeProto.SaveConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveConfigurationMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteConfiguration deletes configuration from configuration store.
     * </pre>
     */
    public void deleteConfiguration(spec.proto.runtime.v1.RuntimeProto.DeleteConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteConfigurationMethod(), responseObserver);
    }

    /**
     * <pre>
     * SubscribeConfiguration gets configuration from configuration store and subscribe the updates.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.SubscribeConfigurationRequest> subscribeConfiguration(
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.SubscribeConfigurationResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSubscribeConfigurationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Distributed Lock API
     * A non-blocking method trying to get a lock with ttl.
     * </pre>
     */
    public void tryLock(spec.proto.runtime.v1.RuntimeProto.TryLockRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.TryLockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTryLockMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method trying to unlock.
     * </pre>
     */
    public void unlock(spec.proto.runtime.v1.RuntimeProto.UnlockRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.UnlockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sequencer API
     * Get next unique id with some auto-increment guarantee
     * </pre>
     */
    public void getNextId(spec.proto.runtime.v1.RuntimeProto.GetNextIdRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.GetNextIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNextIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the state for a specific key.
     * </pre>
     */
    public void getState(spec.proto.runtime.v1.RuntimeProto.GetStateRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.GetStateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a bulk of state items for a list of keys
     * </pre>
     */
    public void getBulkState(spec.proto.runtime.v1.RuntimeProto.GetBulkStateRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.GetBulkStateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBulkStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Saves an array of state objects
     * </pre>
     */
    public void saveState(spec.proto.runtime.v1.RuntimeProto.SaveStateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the state for a specific key.
     * </pre>
     */
    public void deleteState(spec.proto.runtime.v1.RuntimeProto.DeleteStateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a bulk of state items for a list of keys
     * </pre>
     */
    public void deleteBulkState(spec.proto.runtime.v1.RuntimeProto.DeleteBulkStateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteBulkStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Executes transactions for a specified store
     * </pre>
     */
    public void executeStateTransaction(spec.proto.runtime.v1.RuntimeProto.ExecuteStateTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getExecuteStateTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Publishes events to the specific topic
     * </pre>
     */
    public void publishEvent(spec.proto.runtime.v1.RuntimeProto.PublishEventRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getPublishEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get file with stream
     * </pre>
     */
    public void getFile(spec.proto.runtime.v1.RuntimeProto.GetFileRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.GetFileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Put file with stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.PutFileRequest> putFile(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getPutFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all files
     * </pre>
     */
    public void listFile(spec.proto.runtime.v1.RuntimeProto.ListFileRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.ListFileResp> responseObserver) {
      asyncUnimplementedUnaryCall(getListFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete specific file
     * </pre>
     */
    public void delFile(spec.proto.runtime.v1.RuntimeProto.DelFileRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDelFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get file meta data, if file not exist,return code.NotFound error
     * </pre>
     */
    public void getFileMeta(spec.proto.runtime.v1.RuntimeProto.GetFileMetaRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.GetFileMetaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFileMetaMethod(), responseObserver);
    }

    /**
     * <pre>
     * Invokes binding data to specific output bindings
     * </pre>
     */
    public void invokeBinding(spec.proto.runtime.v1.RuntimeProto.InvokeBindingRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.InvokeBindingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInvokeBindingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets secrets from secret stores.
     * </pre>
     */
    public void getSecret(spec.proto.runtime.v1.RuntimeProto.GetSecretRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.GetSecretResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSecretMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a bulk of secrets
     * </pre>
     */
    public void getBulkSecret(spec.proto.runtime.v1.RuntimeProto.GetBulkSecretRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.GetBulkSecretResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBulkSecretMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.RuntimeProto.SayHelloRequest,
                spec.proto.runtime.v1.RuntimeProto.SayHelloResponse>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getInvokeServiceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.RuntimeProto.InvokeServiceRequest,
                spec.proto.runtime.v1.RuntimeProto.InvokeResponse>(
                  this, METHODID_INVOKE_SERVICE)))
          .addMethod(
            getGetConfigurationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.RuntimeProto.GetConfigurationRequest,
                spec.proto.runtime.v1.RuntimeProto.GetConfigurationResponse>(
                  this, METHODID_GET_CONFIGURATION)))
          .addMethod(
            getSaveConfigurationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.RuntimeProto.SaveConfigurationRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_SAVE_CONFIGURATION)))
          .addMethod(
            getDeleteConfigurationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.RuntimeProto.DeleteConfigurationRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_CONFIGURATION)))
          .addMethod(
            getSubscribeConfigurationMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                spec.proto.runtime.v1.RuntimeProto.SubscribeConfigurationRequest,
                spec.proto.runtime.v1.RuntimeProto.SubscribeConfigurationResponse>(
                  this, METHODID_SUBSCRIBE_CONFIGURATION)))
          .addMethod(
            getTryLockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.RuntimeProto.TryLockRequest,
                spec.proto.runtime.v1.RuntimeProto.TryLockResponse>(
                  this, METHODID_TRY_LOCK)))
          .addMethod(
            getUnlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.RuntimeProto.UnlockRequest,
                spec.proto.runtime.v1.RuntimeProto.UnlockResponse>(
                  this, METHODID_UNLOCK)))
          .addMethod(
            getGetNextIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.RuntimeProto.GetNextIdRequest,
                spec.proto.runtime.v1.RuntimeProto.GetNextIdResponse>(
                  this, METHODID_GET_NEXT_ID)))
          .addMethod(
            getGetStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.RuntimeProto.GetStateRequest,
                spec.proto.runtime.v1.RuntimeProto.GetStateResponse>(
                  this, METHODID_GET_STATE)))
          .addMethod(
            getGetBulkStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.RuntimeProto.GetBulkStateRequest,
                spec.proto.runtime.v1.RuntimeProto.GetBulkStateResponse>(
                  this, METHODID_GET_BULK_STATE)))
          .addMethod(
            getSaveStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.RuntimeProto.SaveStateRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_SAVE_STATE)))
          .addMethod(
            getDeleteStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.RuntimeProto.DeleteStateRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_STATE)))
          .addMethod(
            getDeleteBulkStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.RuntimeProto.DeleteBulkStateRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_BULK_STATE)))
          .addMethod(
            getExecuteStateTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.RuntimeProto.ExecuteStateTransactionRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_EXECUTE_STATE_TRANSACTION)))
          .addMethod(
            getPublishEventMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.RuntimeProto.PublishEventRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_PUBLISH_EVENT)))
          .addMethod(
            getGetFileMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                spec.proto.runtime.v1.RuntimeProto.GetFileRequest,
                spec.proto.runtime.v1.RuntimeProto.GetFileResponse>(
                  this, METHODID_GET_FILE)))
          .addMethod(
            getPutFileMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                spec.proto.runtime.v1.RuntimeProto.PutFileRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_PUT_FILE)))
          .addMethod(
            getListFileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.RuntimeProto.ListFileRequest,
                spec.proto.runtime.v1.RuntimeProto.ListFileResp>(
                  this, METHODID_LIST_FILE)))
          .addMethod(
            getDelFileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.RuntimeProto.DelFileRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DEL_FILE)))
          .addMethod(
            getGetFileMetaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.RuntimeProto.GetFileMetaRequest,
                spec.proto.runtime.v1.RuntimeProto.GetFileMetaResponse>(
                  this, METHODID_GET_FILE_META)))
          .addMethod(
            getInvokeBindingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.RuntimeProto.InvokeBindingRequest,
                spec.proto.runtime.v1.RuntimeProto.InvokeBindingResponse>(
                  this, METHODID_INVOKE_BINDING)))
          .addMethod(
            getGetSecretMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.RuntimeProto.GetSecretRequest,
                spec.proto.runtime.v1.RuntimeProto.GetSecretResponse>(
                  this, METHODID_GET_SECRET)))
          .addMethod(
            getGetBulkSecretMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.RuntimeProto.GetBulkSecretRequest,
                spec.proto.runtime.v1.RuntimeProto.GetBulkSecretResponse>(
                  this, METHODID_GET_BULK_SECRET)))
          .build();
    }
  }

  /**
   * <pre>
   * Runtime encapsulates variours Runtime APIs(such as Configuration API, Pub/Sub API, etc)
   * </pre>
   */
  public static final class RuntimeStub extends io.grpc.stub.AbstractAsyncStub<RuntimeStub> {
    private RuntimeStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RuntimeStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RuntimeStub(channel, callOptions);
    }

    /**
     * <pre>
     *SayHello used for test
     * </pre>
     */
    public void sayHello(spec.proto.runtime.v1.RuntimeProto.SayHelloRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.SayHelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * InvokeService do rpc calls
     * </pre>
     */
    public void invokeService(spec.proto.runtime.v1.RuntimeProto.InvokeServiceRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.InvokeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInvokeServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetConfiguration gets configuration from configuration store.
     * </pre>
     */
    public void getConfiguration(spec.proto.runtime.v1.RuntimeProto.GetConfigurationRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.GetConfigurationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetConfigurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SaveConfiguration saves configuration into configuration store.
     * </pre>
     */
    public void saveConfiguration(spec.proto.runtime.v1.RuntimeProto.SaveConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveConfigurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteConfiguration deletes configuration from configuration store.
     * </pre>
     */
    public void deleteConfiguration(spec.proto.runtime.v1.RuntimeProto.DeleteConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteConfigurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SubscribeConfiguration gets configuration from configuration store and subscribe the updates.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.SubscribeConfigurationRequest> subscribeConfiguration(
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.SubscribeConfigurationResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSubscribeConfigurationMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Distributed Lock API
     * A non-blocking method trying to get a lock with ttl.
     * </pre>
     */
    public void tryLock(spec.proto.runtime.v1.RuntimeProto.TryLockRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.TryLockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTryLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A method trying to unlock.
     * </pre>
     */
    public void unlock(spec.proto.runtime.v1.RuntimeProto.UnlockRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.UnlockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sequencer API
     * Get next unique id with some auto-increment guarantee
     * </pre>
     */
    public void getNextId(spec.proto.runtime.v1.RuntimeProto.GetNextIdRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.GetNextIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNextIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the state for a specific key.
     * </pre>
     */
    public void getState(spec.proto.runtime.v1.RuntimeProto.GetStateRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.GetStateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a bulk of state items for a list of keys
     * </pre>
     */
    public void getBulkState(spec.proto.runtime.v1.RuntimeProto.GetBulkStateRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.GetBulkStateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBulkStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Saves an array of state objects
     * </pre>
     */
    public void saveState(spec.proto.runtime.v1.RuntimeProto.SaveStateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the state for a specific key.
     * </pre>
     */
    public void deleteState(spec.proto.runtime.v1.RuntimeProto.DeleteStateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a bulk of state items for a list of keys
     * </pre>
     */
    public void deleteBulkState(spec.proto.runtime.v1.RuntimeProto.DeleteBulkStateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteBulkStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Executes transactions for a specified store
     * </pre>
     */
    public void executeStateTransaction(spec.proto.runtime.v1.RuntimeProto.ExecuteStateTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExecuteStateTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Publishes events to the specific topic
     * </pre>
     */
    public void publishEvent(spec.proto.runtime.v1.RuntimeProto.PublishEventRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPublishEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get file with stream
     * </pre>
     */
    public void getFile(spec.proto.runtime.v1.RuntimeProto.GetFileRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.GetFileResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Put file with stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.PutFileRequest> putFile(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getPutFileMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * List all files
     * </pre>
     */
    public void listFile(spec.proto.runtime.v1.RuntimeProto.ListFileRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.ListFileResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete specific file
     * </pre>
     */
    public void delFile(spec.proto.runtime.v1.RuntimeProto.DelFileRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get file meta data, if file not exist,return code.NotFound error
     * </pre>
     */
    public void getFileMeta(spec.proto.runtime.v1.RuntimeProto.GetFileMetaRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.GetFileMetaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFileMetaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Invokes binding data to specific output bindings
     * </pre>
     */
    public void invokeBinding(spec.proto.runtime.v1.RuntimeProto.InvokeBindingRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.InvokeBindingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInvokeBindingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets secrets from secret stores.
     * </pre>
     */
    public void getSecret(spec.proto.runtime.v1.RuntimeProto.GetSecretRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.GetSecretResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a bulk of secrets
     * </pre>
     */
    public void getBulkSecret(spec.proto.runtime.v1.RuntimeProto.GetBulkSecretRequest request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.GetBulkSecretResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBulkSecretMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Runtime encapsulates variours Runtime APIs(such as Configuration API, Pub/Sub API, etc)
   * </pre>
   */
  public static final class RuntimeBlockingStub extends io.grpc.stub.AbstractBlockingStub<RuntimeBlockingStub> {
    private RuntimeBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RuntimeBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RuntimeBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *SayHello used for test
     * </pre>
     */
    public spec.proto.runtime.v1.RuntimeProto.SayHelloResponse sayHello(spec.proto.runtime.v1.RuntimeProto.SayHelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * InvokeService do rpc calls
     * </pre>
     */
    public spec.proto.runtime.v1.RuntimeProto.InvokeResponse invokeService(spec.proto.runtime.v1.RuntimeProto.InvokeServiceRequest request) {
      return blockingUnaryCall(
          getChannel(), getInvokeServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetConfiguration gets configuration from configuration store.
     * </pre>
     */
    public spec.proto.runtime.v1.RuntimeProto.GetConfigurationResponse getConfiguration(spec.proto.runtime.v1.RuntimeProto.GetConfigurationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetConfigurationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SaveConfiguration saves configuration into configuration store.
     * </pre>
     */
    public com.google.protobuf.Empty saveConfiguration(spec.proto.runtime.v1.RuntimeProto.SaveConfigurationRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveConfigurationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteConfiguration deletes configuration from configuration store.
     * </pre>
     */
    public com.google.protobuf.Empty deleteConfiguration(spec.proto.runtime.v1.RuntimeProto.DeleteConfigurationRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteConfigurationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Distributed Lock API
     * A non-blocking method trying to get a lock with ttl.
     * </pre>
     */
    public spec.proto.runtime.v1.RuntimeProto.TryLockResponse tryLock(spec.proto.runtime.v1.RuntimeProto.TryLockRequest request) {
      return blockingUnaryCall(
          getChannel(), getTryLockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A method trying to unlock.
     * </pre>
     */
    public spec.proto.runtime.v1.RuntimeProto.UnlockResponse unlock(spec.proto.runtime.v1.RuntimeProto.UnlockRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sequencer API
     * Get next unique id with some auto-increment guarantee
     * </pre>
     */
    public spec.proto.runtime.v1.RuntimeProto.GetNextIdResponse getNextId(spec.proto.runtime.v1.RuntimeProto.GetNextIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNextIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the state for a specific key.
     * </pre>
     */
    public spec.proto.runtime.v1.RuntimeProto.GetStateResponse getState(spec.proto.runtime.v1.RuntimeProto.GetStateRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a bulk of state items for a list of keys
     * </pre>
     */
    public spec.proto.runtime.v1.RuntimeProto.GetBulkStateResponse getBulkState(spec.proto.runtime.v1.RuntimeProto.GetBulkStateRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBulkStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Saves an array of state objects
     * </pre>
     */
    public com.google.protobuf.Empty saveState(spec.proto.runtime.v1.RuntimeProto.SaveStateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the state for a specific key.
     * </pre>
     */
    public com.google.protobuf.Empty deleteState(spec.proto.runtime.v1.RuntimeProto.DeleteStateRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a bulk of state items for a list of keys
     * </pre>
     */
    public com.google.protobuf.Empty deleteBulkState(spec.proto.runtime.v1.RuntimeProto.DeleteBulkStateRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteBulkStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Executes transactions for a specified store
     * </pre>
     */
    public com.google.protobuf.Empty executeStateTransaction(spec.proto.runtime.v1.RuntimeProto.ExecuteStateTransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), getExecuteStateTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Publishes events to the specific topic
     * </pre>
     */
    public com.google.protobuf.Empty publishEvent(spec.proto.runtime.v1.RuntimeProto.PublishEventRequest request) {
      return blockingUnaryCall(
          getChannel(), getPublishEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get file with stream
     * </pre>
     */
    public java.util.Iterator<spec.proto.runtime.v1.RuntimeProto.GetFileResponse> getFile(
        spec.proto.runtime.v1.RuntimeProto.GetFileRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all files
     * </pre>
     */
    public spec.proto.runtime.v1.RuntimeProto.ListFileResp listFile(spec.proto.runtime.v1.RuntimeProto.ListFileRequest request) {
      return blockingUnaryCall(
          getChannel(), getListFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete specific file
     * </pre>
     */
    public com.google.protobuf.Empty delFile(spec.proto.runtime.v1.RuntimeProto.DelFileRequest request) {
      return blockingUnaryCall(
          getChannel(), getDelFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get file meta data, if file not exist,return code.NotFound error
     * </pre>
     */
    public spec.proto.runtime.v1.RuntimeProto.GetFileMetaResponse getFileMeta(spec.proto.runtime.v1.RuntimeProto.GetFileMetaRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetFileMetaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Invokes binding data to specific output bindings
     * </pre>
     */
    public spec.proto.runtime.v1.RuntimeProto.InvokeBindingResponse invokeBinding(spec.proto.runtime.v1.RuntimeProto.InvokeBindingRequest request) {
      return blockingUnaryCall(
          getChannel(), getInvokeBindingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets secrets from secret stores.
     * </pre>
     */
    public spec.proto.runtime.v1.RuntimeProto.GetSecretResponse getSecret(spec.proto.runtime.v1.RuntimeProto.GetSecretRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSecretMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a bulk of secrets
     * </pre>
     */
    public spec.proto.runtime.v1.RuntimeProto.GetBulkSecretResponse getBulkSecret(spec.proto.runtime.v1.RuntimeProto.GetBulkSecretRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBulkSecretMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Runtime encapsulates variours Runtime APIs(such as Configuration API, Pub/Sub API, etc)
   * </pre>
   */
  public static final class RuntimeFutureStub extends io.grpc.stub.AbstractFutureStub<RuntimeFutureStub> {
    private RuntimeFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RuntimeFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RuntimeFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *SayHello used for test
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.RuntimeProto.SayHelloResponse> sayHello(
        spec.proto.runtime.v1.RuntimeProto.SayHelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * InvokeService do rpc calls
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.RuntimeProto.InvokeResponse> invokeService(
        spec.proto.runtime.v1.RuntimeProto.InvokeServiceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInvokeServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetConfiguration gets configuration from configuration store.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.RuntimeProto.GetConfigurationResponse> getConfiguration(
        spec.proto.runtime.v1.RuntimeProto.GetConfigurationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetConfigurationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SaveConfiguration saves configuration into configuration store.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> saveConfiguration(
        spec.proto.runtime.v1.RuntimeProto.SaveConfigurationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveConfigurationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteConfiguration deletes configuration from configuration store.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteConfiguration(
        spec.proto.runtime.v1.RuntimeProto.DeleteConfigurationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteConfigurationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Distributed Lock API
     * A non-blocking method trying to get a lock with ttl.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.RuntimeProto.TryLockResponse> tryLock(
        spec.proto.runtime.v1.RuntimeProto.TryLockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTryLockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A method trying to unlock.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.RuntimeProto.UnlockResponse> unlock(
        spec.proto.runtime.v1.RuntimeProto.UnlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sequencer API
     * Get next unique id with some auto-increment guarantee
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.RuntimeProto.GetNextIdResponse> getNextId(
        spec.proto.runtime.v1.RuntimeProto.GetNextIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNextIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the state for a specific key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.RuntimeProto.GetStateResponse> getState(
        spec.proto.runtime.v1.RuntimeProto.GetStateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a bulk of state items for a list of keys
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.RuntimeProto.GetBulkStateResponse> getBulkState(
        spec.proto.runtime.v1.RuntimeProto.GetBulkStateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBulkStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Saves an array of state objects
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> saveState(
        spec.proto.runtime.v1.RuntimeProto.SaveStateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the state for a specific key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteState(
        spec.proto.runtime.v1.RuntimeProto.DeleteStateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a bulk of state items for a list of keys
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteBulkState(
        spec.proto.runtime.v1.RuntimeProto.DeleteBulkStateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteBulkStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Executes transactions for a specified store
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> executeStateTransaction(
        spec.proto.runtime.v1.RuntimeProto.ExecuteStateTransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExecuteStateTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Publishes events to the specific topic
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> publishEvent(
        spec.proto.runtime.v1.RuntimeProto.PublishEventRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPublishEventMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all files
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.RuntimeProto.ListFileResp> listFile(
        spec.proto.runtime.v1.RuntimeProto.ListFileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListFileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete specific file
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> delFile(
        spec.proto.runtime.v1.RuntimeProto.DelFileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDelFileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get file meta data, if file not exist,return code.NotFound error
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.RuntimeProto.GetFileMetaResponse> getFileMeta(
        spec.proto.runtime.v1.RuntimeProto.GetFileMetaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFileMetaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Invokes binding data to specific output bindings
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.RuntimeProto.InvokeBindingResponse> invokeBinding(
        spec.proto.runtime.v1.RuntimeProto.InvokeBindingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInvokeBindingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets secrets from secret stores.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.RuntimeProto.GetSecretResponse> getSecret(
        spec.proto.runtime.v1.RuntimeProto.GetSecretRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSecretMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a bulk of secrets
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.RuntimeProto.GetBulkSecretResponse> getBulkSecret(
        spec.proto.runtime.v1.RuntimeProto.GetBulkSecretRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBulkSecretMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_INVOKE_SERVICE = 1;
  private static final int METHODID_GET_CONFIGURATION = 2;
  private static final int METHODID_SAVE_CONFIGURATION = 3;
  private static final int METHODID_DELETE_CONFIGURATION = 4;
  private static final int METHODID_TRY_LOCK = 5;
  private static final int METHODID_UNLOCK = 6;
  private static final int METHODID_GET_NEXT_ID = 7;
  private static final int METHODID_GET_STATE = 8;
  private static final int METHODID_GET_BULK_STATE = 9;
  private static final int METHODID_SAVE_STATE = 10;
  private static final int METHODID_DELETE_STATE = 11;
  private static final int METHODID_DELETE_BULK_STATE = 12;
  private static final int METHODID_EXECUTE_STATE_TRANSACTION = 13;
  private static final int METHODID_PUBLISH_EVENT = 14;
  private static final int METHODID_GET_FILE = 15;
  private static final int METHODID_LIST_FILE = 16;
  private static final int METHODID_DEL_FILE = 17;
  private static final int METHODID_GET_FILE_META = 18;
  private static final int METHODID_INVOKE_BINDING = 19;
  private static final int METHODID_GET_SECRET = 20;
  private static final int METHODID_GET_BULK_SECRET = 21;
  private static final int METHODID_SUBSCRIBE_CONFIGURATION = 22;
  private static final int METHODID_PUT_FILE = 23;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RuntimeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RuntimeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((spec.proto.runtime.v1.RuntimeProto.SayHelloRequest) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.SayHelloResponse>) responseObserver);
          break;
        case METHODID_INVOKE_SERVICE:
          serviceImpl.invokeService((spec.proto.runtime.v1.RuntimeProto.InvokeServiceRequest) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.InvokeResponse>) responseObserver);
          break;
        case METHODID_GET_CONFIGURATION:
          serviceImpl.getConfiguration((spec.proto.runtime.v1.RuntimeProto.GetConfigurationRequest) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.GetConfigurationResponse>) responseObserver);
          break;
        case METHODID_SAVE_CONFIGURATION:
          serviceImpl.saveConfiguration((spec.proto.runtime.v1.RuntimeProto.SaveConfigurationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_CONFIGURATION:
          serviceImpl.deleteConfiguration((spec.proto.runtime.v1.RuntimeProto.DeleteConfigurationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_TRY_LOCK:
          serviceImpl.tryLock((spec.proto.runtime.v1.RuntimeProto.TryLockRequest) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.TryLockResponse>) responseObserver);
          break;
        case METHODID_UNLOCK:
          serviceImpl.unlock((spec.proto.runtime.v1.RuntimeProto.UnlockRequest) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.UnlockResponse>) responseObserver);
          break;
        case METHODID_GET_NEXT_ID:
          serviceImpl.getNextId((spec.proto.runtime.v1.RuntimeProto.GetNextIdRequest) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.GetNextIdResponse>) responseObserver);
          break;
        case METHODID_GET_STATE:
          serviceImpl.getState((spec.proto.runtime.v1.RuntimeProto.GetStateRequest) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.GetStateResponse>) responseObserver);
          break;
        case METHODID_GET_BULK_STATE:
          serviceImpl.getBulkState((spec.proto.runtime.v1.RuntimeProto.GetBulkStateRequest) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.GetBulkStateResponse>) responseObserver);
          break;
        case METHODID_SAVE_STATE:
          serviceImpl.saveState((spec.proto.runtime.v1.RuntimeProto.SaveStateRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_STATE:
          serviceImpl.deleteState((spec.proto.runtime.v1.RuntimeProto.DeleteStateRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_BULK_STATE:
          serviceImpl.deleteBulkState((spec.proto.runtime.v1.RuntimeProto.DeleteBulkStateRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_EXECUTE_STATE_TRANSACTION:
          serviceImpl.executeStateTransaction((spec.proto.runtime.v1.RuntimeProto.ExecuteStateTransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_PUBLISH_EVENT:
          serviceImpl.publishEvent((spec.proto.runtime.v1.RuntimeProto.PublishEventRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_FILE:
          serviceImpl.getFile((spec.proto.runtime.v1.RuntimeProto.GetFileRequest) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.GetFileResponse>) responseObserver);
          break;
        case METHODID_LIST_FILE:
          serviceImpl.listFile((spec.proto.runtime.v1.RuntimeProto.ListFileRequest) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.ListFileResp>) responseObserver);
          break;
        case METHODID_DEL_FILE:
          serviceImpl.delFile((spec.proto.runtime.v1.RuntimeProto.DelFileRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_FILE_META:
          serviceImpl.getFileMeta((spec.proto.runtime.v1.RuntimeProto.GetFileMetaRequest) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.GetFileMetaResponse>) responseObserver);
          break;
        case METHODID_INVOKE_BINDING:
          serviceImpl.invokeBinding((spec.proto.runtime.v1.RuntimeProto.InvokeBindingRequest) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.InvokeBindingResponse>) responseObserver);
          break;
        case METHODID_GET_SECRET:
          serviceImpl.getSecret((spec.proto.runtime.v1.RuntimeProto.GetSecretRequest) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.GetSecretResponse>) responseObserver);
          break;
        case METHODID_GET_BULK_SECRET:
          serviceImpl.getBulkSecret((spec.proto.runtime.v1.RuntimeProto.GetBulkSecretRequest) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.GetBulkSecretResponse>) responseObserver);
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
        case METHODID_SUBSCRIBE_CONFIGURATION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.subscribeConfiguration(
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.RuntimeProto.SubscribeConfigurationResponse>) responseObserver);
        case METHODID_PUT_FILE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.putFile(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RuntimeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RuntimeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return spec.proto.runtime.v1.RuntimeProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Runtime");
    }
  }

  private static final class RuntimeFileDescriptorSupplier
      extends RuntimeBaseDescriptorSupplier {
    RuntimeFileDescriptorSupplier() {}
  }

  private static final class RuntimeMethodDescriptorSupplier
      extends RuntimeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RuntimeMethodDescriptorSupplier(String methodName) {
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
      synchronized (RuntimeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RuntimeFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getInvokeServiceMethod())
              .addMethod(getGetConfigurationMethod())
              .addMethod(getSaveConfigurationMethod())
              .addMethod(getDeleteConfigurationMethod())
              .addMethod(getSubscribeConfigurationMethod())
              .addMethod(getTryLockMethod())
              .addMethod(getUnlockMethod())
              .addMethod(getGetNextIdMethod())
              .addMethod(getGetStateMethod())
              .addMethod(getGetBulkStateMethod())
              .addMethod(getSaveStateMethod())
              .addMethod(getDeleteStateMethod())
              .addMethod(getDeleteBulkStateMethod())
              .addMethod(getExecuteStateTransactionMethod())
              .addMethod(getPublishEventMethod())
              .addMethod(getGetFileMethod())
              .addMethod(getPutFileMethod())
              .addMethod(getListFileMethod())
              .addMethod(getDelFileMethod())
              .addMethod(getGetFileMetaMethod())
              .addMethod(getInvokeBindingMethod())
              .addMethod(getGetSecretMethod())
              .addMethod(getGetBulkSecretMethod())
              .build();
        }
      }
    }
    return result;
  }
}
