package spec.proto.runtime.v1.s3;

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
 * ObjectStorageService is an abstraction for blob storage or so called "object storage", such as alibaba cloud OSS, such as AWS S3.
 * You invoke ObjectStorageService API to do some CRUD operations on your binary file, e.g. query my file, delete my file, etc.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: oss.proto")
public final class ObjectStorageServiceGrpc {

  private ObjectStorageServiceGrpc() {}

  public static final String SERVICE_NAME = "spec.proto.extension.v1.s3.ObjectStorageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectOutput> getPutObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutObject",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectInput.class,
      responseType = spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectOutput> getPutObjectMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectInput, spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectOutput> getPutObjectMethod;
    if ((getPutObjectMethod = ObjectStorageServiceGrpc.getPutObjectMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getPutObjectMethod = ObjectStorageServiceGrpc.getPutObjectMethod) == null) {
          ObjectStorageServiceGrpc.getPutObjectMethod = getPutObjectMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectInput, spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectOutput.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("PutObject"))
              .build();
        }
      }
    }
    return getPutObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectOutput> getGetObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObject",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectInput.class,
      responseType = spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectOutput> getGetObjectMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectInput, spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectOutput> getGetObjectMethod;
    if ((getGetObjectMethod = ObjectStorageServiceGrpc.getGetObjectMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getGetObjectMethod = ObjectStorageServiceGrpc.getGetObjectMethod) == null) {
          ObjectStorageServiceGrpc.getGetObjectMethod = getGetObjectMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectInput, spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectOutput.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("GetObject"))
              .build();
        }
      }
    }
    return getGetObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectOutput> getDeleteObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteObject",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectInput.class,
      responseType = spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectOutput> getDeleteObjectMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectInput, spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectOutput> getDeleteObjectMethod;
    if ((getDeleteObjectMethod = ObjectStorageServiceGrpc.getDeleteObjectMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getDeleteObjectMethod = ObjectStorageServiceGrpc.getDeleteObjectMethod) == null) {
          ObjectStorageServiceGrpc.getDeleteObjectMethod = getDeleteObjectMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectInput, spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectOutput.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("DeleteObject"))
              .build();
        }
      }
    }
    return getDeleteObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.CopyObjectInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.CopyObjectOutput> getCopyObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CopyObject",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.CopyObjectInput.class,
      responseType = spec.proto.runtime.v1.s3.ObjectStorageProto.CopyObjectOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.CopyObjectInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.CopyObjectOutput> getCopyObjectMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.CopyObjectInput, spec.proto.runtime.v1.s3.ObjectStorageProto.CopyObjectOutput> getCopyObjectMethod;
    if ((getCopyObjectMethod = ObjectStorageServiceGrpc.getCopyObjectMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getCopyObjectMethod = ObjectStorageServiceGrpc.getCopyObjectMethod) == null) {
          ObjectStorageServiceGrpc.getCopyObjectMethod = getCopyObjectMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.CopyObjectInput, spec.proto.runtime.v1.s3.ObjectStorageProto.CopyObjectOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CopyObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.CopyObjectInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.CopyObjectOutput.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("CopyObject"))
              .build();
        }
      }
    }
    return getCopyObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectsInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectsOutput> getDeleteObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteObjects",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectsInput.class,
      responseType = spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectsOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectsInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectsOutput> getDeleteObjectsMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectsInput, spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectsOutput> getDeleteObjectsMethod;
    if ((getDeleteObjectsMethod = ObjectStorageServiceGrpc.getDeleteObjectsMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getDeleteObjectsMethod = ObjectStorageServiceGrpc.getDeleteObjectsMethod) == null) {
          ObjectStorageServiceGrpc.getDeleteObjectsMethod = getDeleteObjectsMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectsInput, spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectsOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectsInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectsOutput.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("DeleteObjects"))
              .build();
        }
      }
    }
    return getDeleteObjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectsInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectsOutput> getListObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListObjects",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectsInput.class,
      responseType = spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectsOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectsInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectsOutput> getListObjectsMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectsInput, spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectsOutput> getListObjectsMethod;
    if ((getListObjectsMethod = ObjectStorageServiceGrpc.getListObjectsMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getListObjectsMethod = ObjectStorageServiceGrpc.getListObjectsMethod) == null) {
          ObjectStorageServiceGrpc.getListObjectsMethod = getListObjectsMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectsInput, spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectsOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectsInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectsOutput.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("ListObjects"))
              .build();
        }
      }
    }
    return getListObjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.HeadObjectInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.HeadObjectOutput> getHeadObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HeadObject",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.HeadObjectInput.class,
      responseType = spec.proto.runtime.v1.s3.ObjectStorageProto.HeadObjectOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.HeadObjectInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.HeadObjectOutput> getHeadObjectMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.HeadObjectInput, spec.proto.runtime.v1.s3.ObjectStorageProto.HeadObjectOutput> getHeadObjectMethod;
    if ((getHeadObjectMethod = ObjectStorageServiceGrpc.getHeadObjectMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getHeadObjectMethod = ObjectStorageServiceGrpc.getHeadObjectMethod) == null) {
          ObjectStorageServiceGrpc.getHeadObjectMethod = getHeadObjectMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.HeadObjectInput, spec.proto.runtime.v1.s3.ObjectStorageProto.HeadObjectOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HeadObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.HeadObjectInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.HeadObjectOutput.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("HeadObject"))
              .build();
        }
      }
    }
    return getHeadObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.IsObjectExistInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.IsObjectExistOutput> getIsObjectExistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsObjectExist",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.IsObjectExistInput.class,
      responseType = spec.proto.runtime.v1.s3.ObjectStorageProto.IsObjectExistOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.IsObjectExistInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.IsObjectExistOutput> getIsObjectExistMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.IsObjectExistInput, spec.proto.runtime.v1.s3.ObjectStorageProto.IsObjectExistOutput> getIsObjectExistMethod;
    if ((getIsObjectExistMethod = ObjectStorageServiceGrpc.getIsObjectExistMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getIsObjectExistMethod = ObjectStorageServiceGrpc.getIsObjectExistMethod) == null) {
          ObjectStorageServiceGrpc.getIsObjectExistMethod = getIsObjectExistMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.IsObjectExistInput, spec.proto.runtime.v1.s3.ObjectStorageProto.IsObjectExistOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsObjectExist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.IsObjectExistInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.IsObjectExistOutput.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("IsObjectExist"))
              .build();
        }
      }
    }
    return getIsObjectExistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectTaggingInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectTaggingOutput> getPutObjectTaggingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutObjectTagging",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectTaggingInput.class,
      responseType = spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectTaggingOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectTaggingInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectTaggingOutput> getPutObjectTaggingMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectTaggingInput, spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectTaggingOutput> getPutObjectTaggingMethod;
    if ((getPutObjectTaggingMethod = ObjectStorageServiceGrpc.getPutObjectTaggingMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getPutObjectTaggingMethod = ObjectStorageServiceGrpc.getPutObjectTaggingMethod) == null) {
          ObjectStorageServiceGrpc.getPutObjectTaggingMethod = getPutObjectTaggingMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectTaggingInput, spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectTaggingOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutObjectTagging"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectTaggingInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectTaggingOutput.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("PutObjectTagging"))
              .build();
        }
      }
    }
    return getPutObjectTaggingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectTaggingInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectTaggingOutput> getDeleteObjectTaggingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteObjectTagging",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectTaggingInput.class,
      responseType = spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectTaggingOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectTaggingInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectTaggingOutput> getDeleteObjectTaggingMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectTaggingInput, spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectTaggingOutput> getDeleteObjectTaggingMethod;
    if ((getDeleteObjectTaggingMethod = ObjectStorageServiceGrpc.getDeleteObjectTaggingMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getDeleteObjectTaggingMethod = ObjectStorageServiceGrpc.getDeleteObjectTaggingMethod) == null) {
          ObjectStorageServiceGrpc.getDeleteObjectTaggingMethod = getDeleteObjectTaggingMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectTaggingInput, spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectTaggingOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteObjectTagging"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectTaggingInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectTaggingOutput.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("DeleteObjectTagging"))
              .build();
        }
      }
    }
    return getDeleteObjectTaggingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectTaggingInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectTaggingOutput> getGetObjectTaggingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectTagging",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectTaggingInput.class,
      responseType = spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectTaggingOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectTaggingInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectTaggingOutput> getGetObjectTaggingMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectTaggingInput, spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectTaggingOutput> getGetObjectTaggingMethod;
    if ((getGetObjectTaggingMethod = ObjectStorageServiceGrpc.getGetObjectTaggingMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getGetObjectTaggingMethod = ObjectStorageServiceGrpc.getGetObjectTaggingMethod) == null) {
          ObjectStorageServiceGrpc.getGetObjectTaggingMethod = getGetObjectTaggingMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectTaggingInput, spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectTaggingOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjectTagging"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectTaggingInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectTaggingOutput.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("GetObjectTagging"))
              .build();
        }
      }
    }
    return getGetObjectTaggingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectCannedAclInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectCannedAclOutput> getGetObjectCannedAclMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectCannedAcl",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectCannedAclInput.class,
      responseType = spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectCannedAclOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectCannedAclInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectCannedAclOutput> getGetObjectCannedAclMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectCannedAclInput, spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectCannedAclOutput> getGetObjectCannedAclMethod;
    if ((getGetObjectCannedAclMethod = ObjectStorageServiceGrpc.getGetObjectCannedAclMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getGetObjectCannedAclMethod = ObjectStorageServiceGrpc.getGetObjectCannedAclMethod) == null) {
          ObjectStorageServiceGrpc.getGetObjectCannedAclMethod = getGetObjectCannedAclMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectCannedAclInput, spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectCannedAclOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjectCannedAcl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectCannedAclInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectCannedAclOutput.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("GetObjectCannedAcl"))
              .build();
        }
      }
    }
    return getGetObjectCannedAclMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectCannedAclInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectCannedAclOutput> getPutObjectCannedAclMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutObjectCannedAcl",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectCannedAclInput.class,
      responseType = spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectCannedAclOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectCannedAclInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectCannedAclOutput> getPutObjectCannedAclMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectCannedAclInput, spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectCannedAclOutput> getPutObjectCannedAclMethod;
    if ((getPutObjectCannedAclMethod = ObjectStorageServiceGrpc.getPutObjectCannedAclMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getPutObjectCannedAclMethod = ObjectStorageServiceGrpc.getPutObjectCannedAclMethod) == null) {
          ObjectStorageServiceGrpc.getPutObjectCannedAclMethod = getPutObjectCannedAclMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectCannedAclInput, spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectCannedAclOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutObjectCannedAcl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectCannedAclInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectCannedAclOutput.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("PutObjectCannedAcl"))
              .build();
        }
      }
    }
    return getPutObjectCannedAclMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.CreateMultipartUploadInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.CreateMultipartUploadOutput> getCreateMultipartUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMultipartUpload",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.CreateMultipartUploadInput.class,
      responseType = spec.proto.runtime.v1.s3.ObjectStorageProto.CreateMultipartUploadOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.CreateMultipartUploadInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.CreateMultipartUploadOutput> getCreateMultipartUploadMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.CreateMultipartUploadInput, spec.proto.runtime.v1.s3.ObjectStorageProto.CreateMultipartUploadOutput> getCreateMultipartUploadMethod;
    if ((getCreateMultipartUploadMethod = ObjectStorageServiceGrpc.getCreateMultipartUploadMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getCreateMultipartUploadMethod = ObjectStorageServiceGrpc.getCreateMultipartUploadMethod) == null) {
          ObjectStorageServiceGrpc.getCreateMultipartUploadMethod = getCreateMultipartUploadMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.CreateMultipartUploadInput, spec.proto.runtime.v1.s3.ObjectStorageProto.CreateMultipartUploadOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMultipartUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.CreateMultipartUploadInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.CreateMultipartUploadOutput.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("CreateMultipartUpload"))
              .build();
        }
      }
    }
    return getCreateMultipartUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartOutput> getUploadPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadPart",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartInput.class,
      responseType = spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartOutput> getUploadPartMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartInput, spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartOutput> getUploadPartMethod;
    if ((getUploadPartMethod = ObjectStorageServiceGrpc.getUploadPartMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getUploadPartMethod = ObjectStorageServiceGrpc.getUploadPartMethod) == null) {
          ObjectStorageServiceGrpc.getUploadPartMethod = getUploadPartMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartInput, spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartOutput.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("UploadPart"))
              .build();
        }
      }
    }
    return getUploadPartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartCopyInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartCopyOutput> getUploadPartCopyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadPartCopy",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartCopyInput.class,
      responseType = spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartCopyOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartCopyInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartCopyOutput> getUploadPartCopyMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartCopyInput, spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartCopyOutput> getUploadPartCopyMethod;
    if ((getUploadPartCopyMethod = ObjectStorageServiceGrpc.getUploadPartCopyMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getUploadPartCopyMethod = ObjectStorageServiceGrpc.getUploadPartCopyMethod) == null) {
          ObjectStorageServiceGrpc.getUploadPartCopyMethod = getUploadPartCopyMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartCopyInput, spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartCopyOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadPartCopy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartCopyInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartCopyOutput.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("UploadPartCopy"))
              .build();
        }
      }
    }
    return getUploadPartCopyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.CompleteMultipartUploadInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.CompleteMultipartUploadOutput> getCompleteMultipartUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CompleteMultipartUpload",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.CompleteMultipartUploadInput.class,
      responseType = spec.proto.runtime.v1.s3.ObjectStorageProto.CompleteMultipartUploadOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.CompleteMultipartUploadInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.CompleteMultipartUploadOutput> getCompleteMultipartUploadMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.CompleteMultipartUploadInput, spec.proto.runtime.v1.s3.ObjectStorageProto.CompleteMultipartUploadOutput> getCompleteMultipartUploadMethod;
    if ((getCompleteMultipartUploadMethod = ObjectStorageServiceGrpc.getCompleteMultipartUploadMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getCompleteMultipartUploadMethod = ObjectStorageServiceGrpc.getCompleteMultipartUploadMethod) == null) {
          ObjectStorageServiceGrpc.getCompleteMultipartUploadMethod = getCompleteMultipartUploadMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.CompleteMultipartUploadInput, spec.proto.runtime.v1.s3.ObjectStorageProto.CompleteMultipartUploadOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CompleteMultipartUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.CompleteMultipartUploadInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.CompleteMultipartUploadOutput.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("CompleteMultipartUpload"))
              .build();
        }
      }
    }
    return getCompleteMultipartUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.AbortMultipartUploadInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.AbortMultipartUploadOutput> getAbortMultipartUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AbortMultipartUpload",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.AbortMultipartUploadInput.class,
      responseType = spec.proto.runtime.v1.s3.ObjectStorageProto.AbortMultipartUploadOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.AbortMultipartUploadInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.AbortMultipartUploadOutput> getAbortMultipartUploadMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.AbortMultipartUploadInput, spec.proto.runtime.v1.s3.ObjectStorageProto.AbortMultipartUploadOutput> getAbortMultipartUploadMethod;
    if ((getAbortMultipartUploadMethod = ObjectStorageServiceGrpc.getAbortMultipartUploadMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getAbortMultipartUploadMethod = ObjectStorageServiceGrpc.getAbortMultipartUploadMethod) == null) {
          ObjectStorageServiceGrpc.getAbortMultipartUploadMethod = getAbortMultipartUploadMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.AbortMultipartUploadInput, spec.proto.runtime.v1.s3.ObjectStorageProto.AbortMultipartUploadOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AbortMultipartUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.AbortMultipartUploadInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.AbortMultipartUploadOutput.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("AbortMultipartUpload"))
              .build();
        }
      }
    }
    return getAbortMultipartUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.ListMultipartUploadsInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.ListMultipartUploadsOutput> getListMultipartUploadsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMultipartUploads",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.ListMultipartUploadsInput.class,
      responseType = spec.proto.runtime.v1.s3.ObjectStorageProto.ListMultipartUploadsOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.ListMultipartUploadsInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.ListMultipartUploadsOutput> getListMultipartUploadsMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.ListMultipartUploadsInput, spec.proto.runtime.v1.s3.ObjectStorageProto.ListMultipartUploadsOutput> getListMultipartUploadsMethod;
    if ((getListMultipartUploadsMethod = ObjectStorageServiceGrpc.getListMultipartUploadsMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getListMultipartUploadsMethod = ObjectStorageServiceGrpc.getListMultipartUploadsMethod) == null) {
          ObjectStorageServiceGrpc.getListMultipartUploadsMethod = getListMultipartUploadsMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.ListMultipartUploadsInput, spec.proto.runtime.v1.s3.ObjectStorageProto.ListMultipartUploadsOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMultipartUploads"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.ListMultipartUploadsInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.ListMultipartUploadsOutput.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("ListMultipartUploads"))
              .build();
        }
      }
    }
    return getListMultipartUploadsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.ListPartsInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.ListPartsOutput> getListPartsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListParts",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.ListPartsInput.class,
      responseType = spec.proto.runtime.v1.s3.ObjectStorageProto.ListPartsOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.ListPartsInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.ListPartsOutput> getListPartsMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.ListPartsInput, spec.proto.runtime.v1.s3.ObjectStorageProto.ListPartsOutput> getListPartsMethod;
    if ((getListPartsMethod = ObjectStorageServiceGrpc.getListPartsMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getListPartsMethod = ObjectStorageServiceGrpc.getListPartsMethod) == null) {
          ObjectStorageServiceGrpc.getListPartsMethod = getListPartsMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.ListPartsInput, spec.proto.runtime.v1.s3.ObjectStorageProto.ListPartsOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListParts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.ListPartsInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.ListPartsOutput.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("ListParts"))
              .build();
        }
      }
    }
    return getListPartsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectVersionsInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectVersionsOutput> getListObjectVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListObjectVersions",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectVersionsInput.class,
      responseType = spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectVersionsOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectVersionsInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectVersionsOutput> getListObjectVersionsMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectVersionsInput, spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectVersionsOutput> getListObjectVersionsMethod;
    if ((getListObjectVersionsMethod = ObjectStorageServiceGrpc.getListObjectVersionsMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getListObjectVersionsMethod = ObjectStorageServiceGrpc.getListObjectVersionsMethod) == null) {
          ObjectStorageServiceGrpc.getListObjectVersionsMethod = getListObjectVersionsMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectVersionsInput, spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectVersionsOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListObjectVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectVersionsInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectVersionsOutput.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("ListObjectVersions"))
              .build();
        }
      }
    }
    return getListObjectVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.SignURLInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.SignURLOutput> getSignURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignURL",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.SignURLInput.class,
      responseType = spec.proto.runtime.v1.s3.ObjectStorageProto.SignURLOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.SignURLInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.SignURLOutput> getSignURLMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.SignURLInput, spec.proto.runtime.v1.s3.ObjectStorageProto.SignURLOutput> getSignURLMethod;
    if ((getSignURLMethod = ObjectStorageServiceGrpc.getSignURLMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getSignURLMethod = ObjectStorageServiceGrpc.getSignURLMethod) == null) {
          ObjectStorageServiceGrpc.getSignURLMethod = getSignURLMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.SignURLInput, spec.proto.runtime.v1.s3.ObjectStorageProto.SignURLOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.SignURLInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.SignURLOutput.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("SignURL"))
              .build();
        }
      }
    }
    return getSignURLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.UpdateBandwidthRateLimitInput,
      com.google.protobuf.Empty> getUpdateDownloadBandwidthRateLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDownloadBandwidthRateLimit",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.UpdateBandwidthRateLimitInput.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.UpdateBandwidthRateLimitInput,
      com.google.protobuf.Empty> getUpdateDownloadBandwidthRateLimitMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.UpdateBandwidthRateLimitInput, com.google.protobuf.Empty> getUpdateDownloadBandwidthRateLimitMethod;
    if ((getUpdateDownloadBandwidthRateLimitMethod = ObjectStorageServiceGrpc.getUpdateDownloadBandwidthRateLimitMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getUpdateDownloadBandwidthRateLimitMethod = ObjectStorageServiceGrpc.getUpdateDownloadBandwidthRateLimitMethod) == null) {
          ObjectStorageServiceGrpc.getUpdateDownloadBandwidthRateLimitMethod = getUpdateDownloadBandwidthRateLimitMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.UpdateBandwidthRateLimitInput, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDownloadBandwidthRateLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.UpdateBandwidthRateLimitInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("UpdateDownloadBandwidthRateLimit"))
              .build();
        }
      }
    }
    return getUpdateDownloadBandwidthRateLimitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.UpdateBandwidthRateLimitInput,
      com.google.protobuf.Empty> getUpdateUploadBandwidthRateLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUploadBandwidthRateLimit",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.UpdateBandwidthRateLimitInput.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.UpdateBandwidthRateLimitInput,
      com.google.protobuf.Empty> getUpdateUploadBandwidthRateLimitMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.UpdateBandwidthRateLimitInput, com.google.protobuf.Empty> getUpdateUploadBandwidthRateLimitMethod;
    if ((getUpdateUploadBandwidthRateLimitMethod = ObjectStorageServiceGrpc.getUpdateUploadBandwidthRateLimitMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getUpdateUploadBandwidthRateLimitMethod = ObjectStorageServiceGrpc.getUpdateUploadBandwidthRateLimitMethod) == null) {
          ObjectStorageServiceGrpc.getUpdateUploadBandwidthRateLimitMethod = getUpdateUploadBandwidthRateLimitMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.UpdateBandwidthRateLimitInput, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUploadBandwidthRateLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.UpdateBandwidthRateLimitInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("UpdateUploadBandwidthRateLimit"))
              .build();
        }
      }
    }
    return getUpdateUploadBandwidthRateLimitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.AppendObjectInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.AppendObjectOutput> getAppendObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AppendObject",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.AppendObjectInput.class,
      responseType = spec.proto.runtime.v1.s3.ObjectStorageProto.AppendObjectOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.AppendObjectInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.AppendObjectOutput> getAppendObjectMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.AppendObjectInput, spec.proto.runtime.v1.s3.ObjectStorageProto.AppendObjectOutput> getAppendObjectMethod;
    if ((getAppendObjectMethod = ObjectStorageServiceGrpc.getAppendObjectMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getAppendObjectMethod = ObjectStorageServiceGrpc.getAppendObjectMethod) == null) {
          ObjectStorageServiceGrpc.getAppendObjectMethod = getAppendObjectMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.AppendObjectInput, spec.proto.runtime.v1.s3.ObjectStorageProto.AppendObjectOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AppendObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.AppendObjectInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.AppendObjectOutput.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("AppendObject"))
              .build();
        }
      }
    }
    return getAppendObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.RestoreObjectInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.RestoreObjectOutput> getRestoreObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RestoreObject",
      requestType = spec.proto.runtime.v1.s3.ObjectStorageProto.RestoreObjectInput.class,
      responseType = spec.proto.runtime.v1.s3.ObjectStorageProto.RestoreObjectOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.RestoreObjectInput,
      spec.proto.runtime.v1.s3.ObjectStorageProto.RestoreObjectOutput> getRestoreObjectMethod() {
    io.grpc.MethodDescriptor<spec.proto.runtime.v1.s3.ObjectStorageProto.RestoreObjectInput, spec.proto.runtime.v1.s3.ObjectStorageProto.RestoreObjectOutput> getRestoreObjectMethod;
    if ((getRestoreObjectMethod = ObjectStorageServiceGrpc.getRestoreObjectMethod) == null) {
      synchronized (ObjectStorageServiceGrpc.class) {
        if ((getRestoreObjectMethod = ObjectStorageServiceGrpc.getRestoreObjectMethod) == null) {
          ObjectStorageServiceGrpc.getRestoreObjectMethod = getRestoreObjectMethod =
              io.grpc.MethodDescriptor.<spec.proto.runtime.v1.s3.ObjectStorageProto.RestoreObjectInput, spec.proto.runtime.v1.s3.ObjectStorageProto.RestoreObjectOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RestoreObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.RestoreObjectInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spec.proto.runtime.v1.s3.ObjectStorageProto.RestoreObjectOutput.getDefaultInstance()))
              .setSchemaDescriptor(new ObjectStorageServiceMethodDescriptorSupplier("RestoreObject"))
              .build();
        }
      }
    }
    return getRestoreObjectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ObjectStorageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObjectStorageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObjectStorageServiceStub>() {
        @java.lang.Override
        public ObjectStorageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObjectStorageServiceStub(channel, callOptions);
        }
      };
    return ObjectStorageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ObjectStorageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObjectStorageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObjectStorageServiceBlockingStub>() {
        @java.lang.Override
        public ObjectStorageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObjectStorageServiceBlockingStub(channel, callOptions);
        }
      };
    return ObjectStorageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ObjectStorageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObjectStorageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObjectStorageServiceFutureStub>() {
        @java.lang.Override
        public ObjectStorageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObjectStorageServiceFutureStub(channel, callOptions);
        }
      };
    return ObjectStorageServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ObjectStorageService is an abstraction for blob storage or so called "object storage", such as alibaba cloud OSS, such as AWS S3.
   * You invoke ObjectStorageService API to do some CRUD operations on your binary file, e.g. query my file, delete my file, etc.
   * </pre>
   */
  public static abstract class ObjectStorageServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Object CRUD API
     *Adds an object to a bucket.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html
     * </pre>
     */
    public io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectInput> putObject(
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectOutput> responseObserver) {
      return asyncUnimplementedStreamingCall(getPutObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     *Retrieves objects.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html
     * </pre>
     */
    public void getObject(spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectOutput> responseObserver) {
      asyncUnimplementedUnaryCall(getGetObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     *Delete objects.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html
     * </pre>
     */
    public void deleteObject(spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectOutput> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     *Creates a copy of an object that is already stored in oss server.
     *Refer https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/API/API_CopyObject.html
     * </pre>
     */
    public void copyObject(spec.proto.runtime.v1.s3.ObjectStorageProto.CopyObjectInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.CopyObjectOutput> responseObserver) {
      asyncUnimplementedUnaryCall(getCopyObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     *Delete multiple objects from a bucket.
     *Refer https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/API/API_DeleteObjects.html
     * </pre>
     */
    public void deleteObjects(spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectsInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectsOutput> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteObjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     *Returns some or all (up to 1,000) of the objects in a bucket.
     *Refer https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/API/API_ListObjects.html
     * </pre>
     */
    public void listObjects(spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectsInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectsOutput> responseObserver) {
      asyncUnimplementedUnaryCall(getListObjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     *The HEAD action retrieves metadata from an object without returning the object itself.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_HeadObject.html
     * </pre>
     */
    public void headObject(spec.proto.runtime.v1.s3.ObjectStorageProto.HeadObjectInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.HeadObjectOutput> responseObserver) {
      asyncUnimplementedUnaryCall(getHeadObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     *This action used to check if the file exists.
     * </pre>
     */
    public void isObjectExist(spec.proto.runtime.v1.s3.ObjectStorageProto.IsObjectExistInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.IsObjectExistOutput> responseObserver) {
      asyncUnimplementedUnaryCall(getIsObjectExistMethod(), responseObserver);
    }

    /**
     * <pre>
     *Object Tagging API
     *Sets the supplied tag-set to an object that already exists in a bucket.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObjectTagging.html
     * </pre>
     */
    public void putObjectTagging(spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectTaggingInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectTaggingOutput> responseObserver) {
      asyncUnimplementedUnaryCall(getPutObjectTaggingMethod(), responseObserver);
    }

    /**
     * <pre>
     *Removes the entire tag set from the specified object.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObjectTagging.html
     * </pre>
     */
    public void deleteObjectTagging(spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectTaggingInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectTaggingOutput> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteObjectTaggingMethod(), responseObserver);
    }

    /**
     * <pre>
     *Returns the tag-set of an object.
     *Refer https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/API/API_GetObjectTagging.html
     * </pre>
     */
    public void getObjectTagging(spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectTaggingInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectTaggingOutput> responseObserver) {
      asyncUnimplementedUnaryCall(getGetObjectTaggingMethod(), responseObserver);
    }

    /**
     * <pre>
     *Returns object canned acl.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#CannedACL
     * </pre>
     */
    public void getObjectCannedAcl(spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectCannedAclInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectCannedAclOutput> responseObserver) {
      asyncUnimplementedUnaryCall(getGetObjectCannedAclMethod(), responseObserver);
    }

    /**
     * <pre>
     *Set object canned acl.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#CannedACL
     * </pre>
     */
    public void putObjectCannedAcl(spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectCannedAclInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectCannedAclOutput> responseObserver) {
      asyncUnimplementedUnaryCall(getPutObjectCannedAclMethod(), responseObserver);
    }

    /**
     * <pre>
     *Object Multipart Operation API
     *Initiates a multipart upload and returns an upload ID.
     *Refer https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/API/API_CreateMultipartUpload.html
     * </pre>
     */
    public void createMultipartUpload(spec.proto.runtime.v1.s3.ObjectStorageProto.CreateMultipartUploadInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.CreateMultipartUploadOutput> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMultipartUploadMethod(), responseObserver);
    }

    /**
     * <pre>
     *Uploads a part in a multipart upload.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html
     * </pre>
     */
    public io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartInput> uploadPart(
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartOutput> responseObserver) {
      return asyncUnimplementedStreamingCall(getUploadPartMethod(), responseObserver);
    }

    /**
     * <pre>
     *Uploads a part by copying data from an existing object as data source.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPartCopy.html
     * </pre>
     */
    public void uploadPartCopy(spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartCopyInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartCopyOutput> responseObserver) {
      asyncUnimplementedUnaryCall(getUploadPartCopyMethod(), responseObserver);
    }

    /**
     * <pre>
     *Completes a multipart upload by assembling previously uploaded parts.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_CompleteMultipartUpload.html
     * </pre>
     */
    public void completeMultipartUpload(spec.proto.runtime.v1.s3.ObjectStorageProto.CompleteMultipartUploadInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.CompleteMultipartUploadOutput> responseObserver) {
      asyncUnimplementedUnaryCall(getCompleteMultipartUploadMethod(), responseObserver);
    }

    /**
     * <pre>
     *This action aborts a multipart upload.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_AbortMultipartUpload.html
     * </pre>
     */
    public void abortMultipartUpload(spec.proto.runtime.v1.s3.ObjectStorageProto.AbortMultipartUploadInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.AbortMultipartUploadOutput> responseObserver) {
      asyncUnimplementedUnaryCall(getAbortMultipartUploadMethod(), responseObserver);
    }

    /**
     * <pre>
     *This action lists in-progress multipart uploads.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListMultipartUploads.html
     * </pre>
     */
    public void listMultipartUploads(spec.proto.runtime.v1.s3.ObjectStorageProto.ListMultipartUploadsInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.ListMultipartUploadsOutput> responseObserver) {
      asyncUnimplementedUnaryCall(getListMultipartUploadsMethod(), responseObserver);
    }

    /**
     * <pre>
     *Lists the parts that have been uploaded for a specific multipart upload.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html
     * </pre>
     */
    public void listParts(spec.proto.runtime.v1.s3.ObjectStorageProto.ListPartsInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.ListPartsOutput> responseObserver) {
      asyncUnimplementedUnaryCall(getListPartsMethod(), responseObserver);
    }

    /**
     * <pre>
     *Returns metadata about all versions of the objects in a bucket.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjectVersions.html
     * </pre>
     */
    public void listObjectVersions(spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectVersionsInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectVersionsOutput> responseObserver) {
      asyncUnimplementedUnaryCall(getListObjectVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     *A presigned URL gives you access to the object identified in the URL, provided that the creator of the presigned URL has permissions to access that object.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/userguide/PresignedUrlUploadObject.html
     * </pre>
     */
    public void signURL(spec.proto.runtime.v1.s3.ObjectStorageProto.SignURLInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.SignURLOutput> responseObserver) {
      asyncUnimplementedUnaryCall(getSignURLMethod(), responseObserver);
    }

    /**
     * <pre>
     *This action used to set download bandwidth limit speed.
     *Refer https://github.com/aliyun/aliyun-oss-go-sdk/blob/master/oss/client.go#L2106
     * </pre>
     */
    public void updateDownloadBandwidthRateLimit(spec.proto.runtime.v1.s3.ObjectStorageProto.UpdateBandwidthRateLimitInput request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateDownloadBandwidthRateLimitMethod(), responseObserver);
    }

    /**
     * <pre>
     *This action used to set upload bandwidth limit speed.
     *Refer https://github.com/aliyun/aliyun-oss-go-sdk/blob/master/oss/client.go#L2096
     * </pre>
     */
    public void updateUploadBandwidthRateLimit(spec.proto.runtime.v1.s3.ObjectStorageProto.UpdateBandwidthRateLimitInput request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUploadBandwidthRateLimitMethod(), responseObserver);
    }

    /**
     * <pre>
     *This action is used to append object.
     *Refer https://help.aliyun.com/document_detail/31981.html or https://github.com/minio/minio-java/issues/980
     * </pre>
     */
    public io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.AppendObjectInput> appendObject(
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.AppendObjectOutput> responseObserver) {
      return asyncUnimplementedStreamingCall(getAppendObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     *Restores an archived copy of an object back.
     *Refer https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/API/API_RestoreObject.html
     * </pre>
     */
    public void restoreObject(spec.proto.runtime.v1.s3.ObjectStorageProto.RestoreObjectInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.RestoreObjectOutput> responseObserver) {
      asyncUnimplementedUnaryCall(getRestoreObjectMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPutObjectMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectInput,
                spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectOutput>(
                  this, METHODID_PUT_OBJECT)))
          .addMethod(
            getGetObjectMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectInput,
                spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectOutput>(
                  this, METHODID_GET_OBJECT)))
          .addMethod(
            getDeleteObjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectInput,
                spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectOutput>(
                  this, METHODID_DELETE_OBJECT)))
          .addMethod(
            getCopyObjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.CopyObjectInput,
                spec.proto.runtime.v1.s3.ObjectStorageProto.CopyObjectOutput>(
                  this, METHODID_COPY_OBJECT)))
          .addMethod(
            getDeleteObjectsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectsInput,
                spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectsOutput>(
                  this, METHODID_DELETE_OBJECTS)))
          .addMethod(
            getListObjectsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectsInput,
                spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectsOutput>(
                  this, METHODID_LIST_OBJECTS)))
          .addMethod(
            getHeadObjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.HeadObjectInput,
                spec.proto.runtime.v1.s3.ObjectStorageProto.HeadObjectOutput>(
                  this, METHODID_HEAD_OBJECT)))
          .addMethod(
            getIsObjectExistMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.IsObjectExistInput,
                spec.proto.runtime.v1.s3.ObjectStorageProto.IsObjectExistOutput>(
                  this, METHODID_IS_OBJECT_EXIST)))
          .addMethod(
            getPutObjectTaggingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectTaggingInput,
                spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectTaggingOutput>(
                  this, METHODID_PUT_OBJECT_TAGGING)))
          .addMethod(
            getDeleteObjectTaggingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectTaggingInput,
                spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectTaggingOutput>(
                  this, METHODID_DELETE_OBJECT_TAGGING)))
          .addMethod(
            getGetObjectTaggingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectTaggingInput,
                spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectTaggingOutput>(
                  this, METHODID_GET_OBJECT_TAGGING)))
          .addMethod(
            getGetObjectCannedAclMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectCannedAclInput,
                spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectCannedAclOutput>(
                  this, METHODID_GET_OBJECT_CANNED_ACL)))
          .addMethod(
            getPutObjectCannedAclMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectCannedAclInput,
                spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectCannedAclOutput>(
                  this, METHODID_PUT_OBJECT_CANNED_ACL)))
          .addMethod(
            getCreateMultipartUploadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.CreateMultipartUploadInput,
                spec.proto.runtime.v1.s3.ObjectStorageProto.CreateMultipartUploadOutput>(
                  this, METHODID_CREATE_MULTIPART_UPLOAD)))
          .addMethod(
            getUploadPartMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartInput,
                spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartOutput>(
                  this, METHODID_UPLOAD_PART)))
          .addMethod(
            getUploadPartCopyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartCopyInput,
                spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartCopyOutput>(
                  this, METHODID_UPLOAD_PART_COPY)))
          .addMethod(
            getCompleteMultipartUploadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.CompleteMultipartUploadInput,
                spec.proto.runtime.v1.s3.ObjectStorageProto.CompleteMultipartUploadOutput>(
                  this, METHODID_COMPLETE_MULTIPART_UPLOAD)))
          .addMethod(
            getAbortMultipartUploadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.AbortMultipartUploadInput,
                spec.proto.runtime.v1.s3.ObjectStorageProto.AbortMultipartUploadOutput>(
                  this, METHODID_ABORT_MULTIPART_UPLOAD)))
          .addMethod(
            getListMultipartUploadsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.ListMultipartUploadsInput,
                spec.proto.runtime.v1.s3.ObjectStorageProto.ListMultipartUploadsOutput>(
                  this, METHODID_LIST_MULTIPART_UPLOADS)))
          .addMethod(
            getListPartsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.ListPartsInput,
                spec.proto.runtime.v1.s3.ObjectStorageProto.ListPartsOutput>(
                  this, METHODID_LIST_PARTS)))
          .addMethod(
            getListObjectVersionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectVersionsInput,
                spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectVersionsOutput>(
                  this, METHODID_LIST_OBJECT_VERSIONS)))
          .addMethod(
            getSignURLMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.SignURLInput,
                spec.proto.runtime.v1.s3.ObjectStorageProto.SignURLOutput>(
                  this, METHODID_SIGN_URL)))
          .addMethod(
            getUpdateDownloadBandwidthRateLimitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.UpdateBandwidthRateLimitInput,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_DOWNLOAD_BANDWIDTH_RATE_LIMIT)))
          .addMethod(
            getUpdateUploadBandwidthRateLimitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.UpdateBandwidthRateLimitInput,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_UPLOAD_BANDWIDTH_RATE_LIMIT)))
          .addMethod(
            getAppendObjectMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.AppendObjectInput,
                spec.proto.runtime.v1.s3.ObjectStorageProto.AppendObjectOutput>(
                  this, METHODID_APPEND_OBJECT)))
          .addMethod(
            getRestoreObjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                spec.proto.runtime.v1.s3.ObjectStorageProto.RestoreObjectInput,
                spec.proto.runtime.v1.s3.ObjectStorageProto.RestoreObjectOutput>(
                  this, METHODID_RESTORE_OBJECT)))
          .build();
    }
  }

  /**
   * <pre>
   * ObjectStorageService is an abstraction for blob storage or so called "object storage", such as alibaba cloud OSS, such as AWS S3.
   * You invoke ObjectStorageService API to do some CRUD operations on your binary file, e.g. query my file, delete my file, etc.
   * </pre>
   */
  public static final class ObjectStorageServiceStub extends io.grpc.stub.AbstractAsyncStub<ObjectStorageServiceStub> {
    private ObjectStorageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectStorageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObjectStorageServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Object CRUD API
     *Adds an object to a bucket.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html
     * </pre>
     */
    public io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectInput> putObject(
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectOutput> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getPutObjectMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *Retrieves objects.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html
     * </pre>
     */
    public void getObject(spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectOutput> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Delete objects.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html
     * </pre>
     */
    public void deleteObject(spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectOutput> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Creates a copy of an object that is already stored in oss server.
     *Refer https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/API/API_CopyObject.html
     * </pre>
     */
    public void copyObject(spec.proto.runtime.v1.s3.ObjectStorageProto.CopyObjectInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.CopyObjectOutput> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCopyObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Delete multiple objects from a bucket.
     *Refer https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/API/API_DeleteObjects.html
     * </pre>
     */
    public void deleteObjects(spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectsInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectsOutput> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Returns some or all (up to 1,000) of the objects in a bucket.
     *Refer https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/API/API_ListObjects.html
     * </pre>
     */
    public void listObjects(spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectsInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectsOutput> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *The HEAD action retrieves metadata from an object without returning the object itself.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_HeadObject.html
     * </pre>
     */
    public void headObject(spec.proto.runtime.v1.s3.ObjectStorageProto.HeadObjectInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.HeadObjectOutput> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHeadObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *This action used to check if the file exists.
     * </pre>
     */
    public void isObjectExist(spec.proto.runtime.v1.s3.ObjectStorageProto.IsObjectExistInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.IsObjectExistOutput> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsObjectExistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Object Tagging API
     *Sets the supplied tag-set to an object that already exists in a bucket.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObjectTagging.html
     * </pre>
     */
    public void putObjectTagging(spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectTaggingInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectTaggingOutput> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutObjectTaggingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Removes the entire tag set from the specified object.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObjectTagging.html
     * </pre>
     */
    public void deleteObjectTagging(spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectTaggingInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectTaggingOutput> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteObjectTaggingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Returns the tag-set of an object.
     *Refer https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/API/API_GetObjectTagging.html
     * </pre>
     */
    public void getObjectTagging(spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectTaggingInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectTaggingOutput> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetObjectTaggingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Returns object canned acl.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#CannedACL
     * </pre>
     */
    public void getObjectCannedAcl(spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectCannedAclInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectCannedAclOutput> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetObjectCannedAclMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Set object canned acl.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#CannedACL
     * </pre>
     */
    public void putObjectCannedAcl(spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectCannedAclInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectCannedAclOutput> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutObjectCannedAclMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Object Multipart Operation API
     *Initiates a multipart upload and returns an upload ID.
     *Refer https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/API/API_CreateMultipartUpload.html
     * </pre>
     */
    public void createMultipartUpload(spec.proto.runtime.v1.s3.ObjectStorageProto.CreateMultipartUploadInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.CreateMultipartUploadOutput> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMultipartUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Uploads a part in a multipart upload.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html
     * </pre>
     */
    public io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartInput> uploadPart(
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartOutput> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getUploadPartMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *Uploads a part by copying data from an existing object as data source.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPartCopy.html
     * </pre>
     */
    public void uploadPartCopy(spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartCopyInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartCopyOutput> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUploadPartCopyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Completes a multipart upload by assembling previously uploaded parts.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_CompleteMultipartUpload.html
     * </pre>
     */
    public void completeMultipartUpload(spec.proto.runtime.v1.s3.ObjectStorageProto.CompleteMultipartUploadInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.CompleteMultipartUploadOutput> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCompleteMultipartUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *This action aborts a multipart upload.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_AbortMultipartUpload.html
     * </pre>
     */
    public void abortMultipartUpload(spec.proto.runtime.v1.s3.ObjectStorageProto.AbortMultipartUploadInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.AbortMultipartUploadOutput> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAbortMultipartUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *This action lists in-progress multipart uploads.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListMultipartUploads.html
     * </pre>
     */
    public void listMultipartUploads(spec.proto.runtime.v1.s3.ObjectStorageProto.ListMultipartUploadsInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.ListMultipartUploadsOutput> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMultipartUploadsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Lists the parts that have been uploaded for a specific multipart upload.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html
     * </pre>
     */
    public void listParts(spec.proto.runtime.v1.s3.ObjectStorageProto.ListPartsInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.ListPartsOutput> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPartsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Returns metadata about all versions of the objects in a bucket.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjectVersions.html
     * </pre>
     */
    public void listObjectVersions(spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectVersionsInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectVersionsOutput> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListObjectVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *A presigned URL gives you access to the object identified in the URL, provided that the creator of the presigned URL has permissions to access that object.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/userguide/PresignedUrlUploadObject.html
     * </pre>
     */
    public void signURL(spec.proto.runtime.v1.s3.ObjectStorageProto.SignURLInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.SignURLOutput> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignURLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *This action used to set download bandwidth limit speed.
     *Refer https://github.com/aliyun/aliyun-oss-go-sdk/blob/master/oss/client.go#L2106
     * </pre>
     */
    public void updateDownloadBandwidthRateLimit(spec.proto.runtime.v1.s3.ObjectStorageProto.UpdateBandwidthRateLimitInput request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateDownloadBandwidthRateLimitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *This action used to set upload bandwidth limit speed.
     *Refer https://github.com/aliyun/aliyun-oss-go-sdk/blob/master/oss/client.go#L2096
     * </pre>
     */
    public void updateUploadBandwidthRateLimit(spec.proto.runtime.v1.s3.ObjectStorageProto.UpdateBandwidthRateLimitInput request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUploadBandwidthRateLimitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *This action is used to append object.
     *Refer https://help.aliyun.com/document_detail/31981.html or https://github.com/minio/minio-java/issues/980
     * </pre>
     */
    public io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.AppendObjectInput> appendObject(
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.AppendObjectOutput> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAppendObjectMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *Restores an archived copy of an object back.
     *Refer https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/API/API_RestoreObject.html
     * </pre>
     */
    public void restoreObject(spec.proto.runtime.v1.s3.ObjectStorageProto.RestoreObjectInput request,
        io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.RestoreObjectOutput> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRestoreObjectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ObjectStorageService is an abstraction for blob storage or so called "object storage", such as alibaba cloud OSS, such as AWS S3.
   * You invoke ObjectStorageService API to do some CRUD operations on your binary file, e.g. query my file, delete my file, etc.
   * </pre>
   */
  public static final class ObjectStorageServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ObjectStorageServiceBlockingStub> {
    private ObjectStorageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectStorageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObjectStorageServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Retrieves objects.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html
     * </pre>
     */
    public java.util.Iterator<spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectOutput> getObject(
        spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectInput request) {
      return blockingServerStreamingCall(
          getChannel(), getGetObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Delete objects.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html
     * </pre>
     */
    public spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectOutput deleteObject(spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectInput request) {
      return blockingUnaryCall(
          getChannel(), getDeleteObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Creates a copy of an object that is already stored in oss server.
     *Refer https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/API/API_CopyObject.html
     * </pre>
     */
    public spec.proto.runtime.v1.s3.ObjectStorageProto.CopyObjectOutput copyObject(spec.proto.runtime.v1.s3.ObjectStorageProto.CopyObjectInput request) {
      return blockingUnaryCall(
          getChannel(), getCopyObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Delete multiple objects from a bucket.
     *Refer https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/API/API_DeleteObjects.html
     * </pre>
     */
    public spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectsOutput deleteObjects(spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectsInput request) {
      return blockingUnaryCall(
          getChannel(), getDeleteObjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Returns some or all (up to 1,000) of the objects in a bucket.
     *Refer https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/API/API_ListObjects.html
     * </pre>
     */
    public spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectsOutput listObjects(spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectsInput request) {
      return blockingUnaryCall(
          getChannel(), getListObjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *The HEAD action retrieves metadata from an object without returning the object itself.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_HeadObject.html
     * </pre>
     */
    public spec.proto.runtime.v1.s3.ObjectStorageProto.HeadObjectOutput headObject(spec.proto.runtime.v1.s3.ObjectStorageProto.HeadObjectInput request) {
      return blockingUnaryCall(
          getChannel(), getHeadObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *This action used to check if the file exists.
     * </pre>
     */
    public spec.proto.runtime.v1.s3.ObjectStorageProto.IsObjectExistOutput isObjectExist(spec.proto.runtime.v1.s3.ObjectStorageProto.IsObjectExistInput request) {
      return blockingUnaryCall(
          getChannel(), getIsObjectExistMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Object Tagging API
     *Sets the supplied tag-set to an object that already exists in a bucket.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObjectTagging.html
     * </pre>
     */
    public spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectTaggingOutput putObjectTagging(spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectTaggingInput request) {
      return blockingUnaryCall(
          getChannel(), getPutObjectTaggingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Removes the entire tag set from the specified object.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObjectTagging.html
     * </pre>
     */
    public spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectTaggingOutput deleteObjectTagging(spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectTaggingInput request) {
      return blockingUnaryCall(
          getChannel(), getDeleteObjectTaggingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Returns the tag-set of an object.
     *Refer https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/API/API_GetObjectTagging.html
     * </pre>
     */
    public spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectTaggingOutput getObjectTagging(spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectTaggingInput request) {
      return blockingUnaryCall(
          getChannel(), getGetObjectTaggingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Returns object canned acl.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#CannedACL
     * </pre>
     */
    public spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectCannedAclOutput getObjectCannedAcl(spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectCannedAclInput request) {
      return blockingUnaryCall(
          getChannel(), getGetObjectCannedAclMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Set object canned acl.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#CannedACL
     * </pre>
     */
    public spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectCannedAclOutput putObjectCannedAcl(spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectCannedAclInput request) {
      return blockingUnaryCall(
          getChannel(), getPutObjectCannedAclMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Object Multipart Operation API
     *Initiates a multipart upload and returns an upload ID.
     *Refer https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/API/API_CreateMultipartUpload.html
     * </pre>
     */
    public spec.proto.runtime.v1.s3.ObjectStorageProto.CreateMultipartUploadOutput createMultipartUpload(spec.proto.runtime.v1.s3.ObjectStorageProto.CreateMultipartUploadInput request) {
      return blockingUnaryCall(
          getChannel(), getCreateMultipartUploadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Uploads a part by copying data from an existing object as data source.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPartCopy.html
     * </pre>
     */
    public spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartCopyOutput uploadPartCopy(spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartCopyInput request) {
      return blockingUnaryCall(
          getChannel(), getUploadPartCopyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Completes a multipart upload by assembling previously uploaded parts.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_CompleteMultipartUpload.html
     * </pre>
     */
    public spec.proto.runtime.v1.s3.ObjectStorageProto.CompleteMultipartUploadOutput completeMultipartUpload(spec.proto.runtime.v1.s3.ObjectStorageProto.CompleteMultipartUploadInput request) {
      return blockingUnaryCall(
          getChannel(), getCompleteMultipartUploadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *This action aborts a multipart upload.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_AbortMultipartUpload.html
     * </pre>
     */
    public spec.proto.runtime.v1.s3.ObjectStorageProto.AbortMultipartUploadOutput abortMultipartUpload(spec.proto.runtime.v1.s3.ObjectStorageProto.AbortMultipartUploadInput request) {
      return blockingUnaryCall(
          getChannel(), getAbortMultipartUploadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *This action lists in-progress multipart uploads.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListMultipartUploads.html
     * </pre>
     */
    public spec.proto.runtime.v1.s3.ObjectStorageProto.ListMultipartUploadsOutput listMultipartUploads(spec.proto.runtime.v1.s3.ObjectStorageProto.ListMultipartUploadsInput request) {
      return blockingUnaryCall(
          getChannel(), getListMultipartUploadsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Lists the parts that have been uploaded for a specific multipart upload.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html
     * </pre>
     */
    public spec.proto.runtime.v1.s3.ObjectStorageProto.ListPartsOutput listParts(spec.proto.runtime.v1.s3.ObjectStorageProto.ListPartsInput request) {
      return blockingUnaryCall(
          getChannel(), getListPartsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Returns metadata about all versions of the objects in a bucket.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjectVersions.html
     * </pre>
     */
    public spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectVersionsOutput listObjectVersions(spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectVersionsInput request) {
      return blockingUnaryCall(
          getChannel(), getListObjectVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *A presigned URL gives you access to the object identified in the URL, provided that the creator of the presigned URL has permissions to access that object.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/userguide/PresignedUrlUploadObject.html
     * </pre>
     */
    public spec.proto.runtime.v1.s3.ObjectStorageProto.SignURLOutput signURL(spec.proto.runtime.v1.s3.ObjectStorageProto.SignURLInput request) {
      return blockingUnaryCall(
          getChannel(), getSignURLMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *This action used to set download bandwidth limit speed.
     *Refer https://github.com/aliyun/aliyun-oss-go-sdk/blob/master/oss/client.go#L2106
     * </pre>
     */
    public com.google.protobuf.Empty updateDownloadBandwidthRateLimit(spec.proto.runtime.v1.s3.ObjectStorageProto.UpdateBandwidthRateLimitInput request) {
      return blockingUnaryCall(
          getChannel(), getUpdateDownloadBandwidthRateLimitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *This action used to set upload bandwidth limit speed.
     *Refer https://github.com/aliyun/aliyun-oss-go-sdk/blob/master/oss/client.go#L2096
     * </pre>
     */
    public com.google.protobuf.Empty updateUploadBandwidthRateLimit(spec.proto.runtime.v1.s3.ObjectStorageProto.UpdateBandwidthRateLimitInput request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUploadBandwidthRateLimitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Restores an archived copy of an object back.
     *Refer https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/API/API_RestoreObject.html
     * </pre>
     */
    public spec.proto.runtime.v1.s3.ObjectStorageProto.RestoreObjectOutput restoreObject(spec.proto.runtime.v1.s3.ObjectStorageProto.RestoreObjectInput request) {
      return blockingUnaryCall(
          getChannel(), getRestoreObjectMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ObjectStorageService is an abstraction for blob storage or so called "object storage", such as alibaba cloud OSS, such as AWS S3.
   * You invoke ObjectStorageService API to do some CRUD operations on your binary file, e.g. query my file, delete my file, etc.
   * </pre>
   */
  public static final class ObjectStorageServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ObjectStorageServiceFutureStub> {
    private ObjectStorageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectStorageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObjectStorageServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Delete objects.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectOutput> deleteObject(
        spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectInput request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Creates a copy of an object that is already stored in oss server.
     *Refer https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/API/API_CopyObject.html
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.s3.ObjectStorageProto.CopyObjectOutput> copyObject(
        spec.proto.runtime.v1.s3.ObjectStorageProto.CopyObjectInput request) {
      return futureUnaryCall(
          getChannel().newCall(getCopyObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Delete multiple objects from a bucket.
     *Refer https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/API/API_DeleteObjects.html
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectsOutput> deleteObjects(
        spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectsInput request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteObjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Returns some or all (up to 1,000) of the objects in a bucket.
     *Refer https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/API/API_ListObjects.html
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectsOutput> listObjects(
        spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectsInput request) {
      return futureUnaryCall(
          getChannel().newCall(getListObjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *The HEAD action retrieves metadata from an object without returning the object itself.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_HeadObject.html
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.s3.ObjectStorageProto.HeadObjectOutput> headObject(
        spec.proto.runtime.v1.s3.ObjectStorageProto.HeadObjectInput request) {
      return futureUnaryCall(
          getChannel().newCall(getHeadObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *This action used to check if the file exists.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.s3.ObjectStorageProto.IsObjectExistOutput> isObjectExist(
        spec.proto.runtime.v1.s3.ObjectStorageProto.IsObjectExistInput request) {
      return futureUnaryCall(
          getChannel().newCall(getIsObjectExistMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Object Tagging API
     *Sets the supplied tag-set to an object that already exists in a bucket.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObjectTagging.html
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectTaggingOutput> putObjectTagging(
        spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectTaggingInput request) {
      return futureUnaryCall(
          getChannel().newCall(getPutObjectTaggingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Removes the entire tag set from the specified object.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObjectTagging.html
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectTaggingOutput> deleteObjectTagging(
        spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectTaggingInput request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteObjectTaggingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Returns the tag-set of an object.
     *Refer https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/API/API_GetObjectTagging.html
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectTaggingOutput> getObjectTagging(
        spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectTaggingInput request) {
      return futureUnaryCall(
          getChannel().newCall(getGetObjectTaggingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Returns object canned acl.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#CannedACL
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectCannedAclOutput> getObjectCannedAcl(
        spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectCannedAclInput request) {
      return futureUnaryCall(
          getChannel().newCall(getGetObjectCannedAclMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Set object canned acl.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#CannedACL
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectCannedAclOutput> putObjectCannedAcl(
        spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectCannedAclInput request) {
      return futureUnaryCall(
          getChannel().newCall(getPutObjectCannedAclMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Object Multipart Operation API
     *Initiates a multipart upload and returns an upload ID.
     *Refer https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/API/API_CreateMultipartUpload.html
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.s3.ObjectStorageProto.CreateMultipartUploadOutput> createMultipartUpload(
        spec.proto.runtime.v1.s3.ObjectStorageProto.CreateMultipartUploadInput request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMultipartUploadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Uploads a part by copying data from an existing object as data source.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPartCopy.html
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartCopyOutput> uploadPartCopy(
        spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartCopyInput request) {
      return futureUnaryCall(
          getChannel().newCall(getUploadPartCopyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Completes a multipart upload by assembling previously uploaded parts.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_CompleteMultipartUpload.html
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.s3.ObjectStorageProto.CompleteMultipartUploadOutput> completeMultipartUpload(
        spec.proto.runtime.v1.s3.ObjectStorageProto.CompleteMultipartUploadInput request) {
      return futureUnaryCall(
          getChannel().newCall(getCompleteMultipartUploadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *This action aborts a multipart upload.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_AbortMultipartUpload.html
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.s3.ObjectStorageProto.AbortMultipartUploadOutput> abortMultipartUpload(
        spec.proto.runtime.v1.s3.ObjectStorageProto.AbortMultipartUploadInput request) {
      return futureUnaryCall(
          getChannel().newCall(getAbortMultipartUploadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *This action lists in-progress multipart uploads.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListMultipartUploads.html
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.s3.ObjectStorageProto.ListMultipartUploadsOutput> listMultipartUploads(
        spec.proto.runtime.v1.s3.ObjectStorageProto.ListMultipartUploadsInput request) {
      return futureUnaryCall(
          getChannel().newCall(getListMultipartUploadsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Lists the parts that have been uploaded for a specific multipart upload.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.s3.ObjectStorageProto.ListPartsOutput> listParts(
        spec.proto.runtime.v1.s3.ObjectStorageProto.ListPartsInput request) {
      return futureUnaryCall(
          getChannel().newCall(getListPartsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Returns metadata about all versions of the objects in a bucket.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjectVersions.html
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectVersionsOutput> listObjectVersions(
        spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectVersionsInput request) {
      return futureUnaryCall(
          getChannel().newCall(getListObjectVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *A presigned URL gives you access to the object identified in the URL, provided that the creator of the presigned URL has permissions to access that object.
     *Refer https://docs.aws.amazon.com/AmazonS3/latest/userguide/PresignedUrlUploadObject.html
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.s3.ObjectStorageProto.SignURLOutput> signURL(
        spec.proto.runtime.v1.s3.ObjectStorageProto.SignURLInput request) {
      return futureUnaryCall(
          getChannel().newCall(getSignURLMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *This action used to set download bandwidth limit speed.
     *Refer https://github.com/aliyun/aliyun-oss-go-sdk/blob/master/oss/client.go#L2106
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateDownloadBandwidthRateLimit(
        spec.proto.runtime.v1.s3.ObjectStorageProto.UpdateBandwidthRateLimitInput request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateDownloadBandwidthRateLimitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *This action used to set upload bandwidth limit speed.
     *Refer https://github.com/aliyun/aliyun-oss-go-sdk/blob/master/oss/client.go#L2096
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateUploadBandwidthRateLimit(
        spec.proto.runtime.v1.s3.ObjectStorageProto.UpdateBandwidthRateLimitInput request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUploadBandwidthRateLimitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Restores an archived copy of an object back.
     *Refer https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/API/API_RestoreObject.html
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spec.proto.runtime.v1.s3.ObjectStorageProto.RestoreObjectOutput> restoreObject(
        spec.proto.runtime.v1.s3.ObjectStorageProto.RestoreObjectInput request) {
      return futureUnaryCall(
          getChannel().newCall(getRestoreObjectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_OBJECT = 0;
  private static final int METHODID_DELETE_OBJECT = 1;
  private static final int METHODID_COPY_OBJECT = 2;
  private static final int METHODID_DELETE_OBJECTS = 3;
  private static final int METHODID_LIST_OBJECTS = 4;
  private static final int METHODID_HEAD_OBJECT = 5;
  private static final int METHODID_IS_OBJECT_EXIST = 6;
  private static final int METHODID_PUT_OBJECT_TAGGING = 7;
  private static final int METHODID_DELETE_OBJECT_TAGGING = 8;
  private static final int METHODID_GET_OBJECT_TAGGING = 9;
  private static final int METHODID_GET_OBJECT_CANNED_ACL = 10;
  private static final int METHODID_PUT_OBJECT_CANNED_ACL = 11;
  private static final int METHODID_CREATE_MULTIPART_UPLOAD = 12;
  private static final int METHODID_UPLOAD_PART_COPY = 13;
  private static final int METHODID_COMPLETE_MULTIPART_UPLOAD = 14;
  private static final int METHODID_ABORT_MULTIPART_UPLOAD = 15;
  private static final int METHODID_LIST_MULTIPART_UPLOADS = 16;
  private static final int METHODID_LIST_PARTS = 17;
  private static final int METHODID_LIST_OBJECT_VERSIONS = 18;
  private static final int METHODID_SIGN_URL = 19;
  private static final int METHODID_UPDATE_DOWNLOAD_BANDWIDTH_RATE_LIMIT = 20;
  private static final int METHODID_UPDATE_UPLOAD_BANDWIDTH_RATE_LIMIT = 21;
  private static final int METHODID_RESTORE_OBJECT = 22;
  private static final int METHODID_PUT_OBJECT = 23;
  private static final int METHODID_UPLOAD_PART = 24;
  private static final int METHODID_APPEND_OBJECT = 25;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ObjectStorageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ObjectStorageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_OBJECT:
          serviceImpl.getObject((spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectInput) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectOutput>) responseObserver);
          break;
        case METHODID_DELETE_OBJECT:
          serviceImpl.deleteObject((spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectInput) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectOutput>) responseObserver);
          break;
        case METHODID_COPY_OBJECT:
          serviceImpl.copyObject((spec.proto.runtime.v1.s3.ObjectStorageProto.CopyObjectInput) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.CopyObjectOutput>) responseObserver);
          break;
        case METHODID_DELETE_OBJECTS:
          serviceImpl.deleteObjects((spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectsInput) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectsOutput>) responseObserver);
          break;
        case METHODID_LIST_OBJECTS:
          serviceImpl.listObjects((spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectsInput) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectsOutput>) responseObserver);
          break;
        case METHODID_HEAD_OBJECT:
          serviceImpl.headObject((spec.proto.runtime.v1.s3.ObjectStorageProto.HeadObjectInput) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.HeadObjectOutput>) responseObserver);
          break;
        case METHODID_IS_OBJECT_EXIST:
          serviceImpl.isObjectExist((spec.proto.runtime.v1.s3.ObjectStorageProto.IsObjectExistInput) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.IsObjectExistOutput>) responseObserver);
          break;
        case METHODID_PUT_OBJECT_TAGGING:
          serviceImpl.putObjectTagging((spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectTaggingInput) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectTaggingOutput>) responseObserver);
          break;
        case METHODID_DELETE_OBJECT_TAGGING:
          serviceImpl.deleteObjectTagging((spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectTaggingInput) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.DeleteObjectTaggingOutput>) responseObserver);
          break;
        case METHODID_GET_OBJECT_TAGGING:
          serviceImpl.getObjectTagging((spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectTaggingInput) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectTaggingOutput>) responseObserver);
          break;
        case METHODID_GET_OBJECT_CANNED_ACL:
          serviceImpl.getObjectCannedAcl((spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectCannedAclInput) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.GetObjectCannedAclOutput>) responseObserver);
          break;
        case METHODID_PUT_OBJECT_CANNED_ACL:
          serviceImpl.putObjectCannedAcl((spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectCannedAclInput) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectCannedAclOutput>) responseObserver);
          break;
        case METHODID_CREATE_MULTIPART_UPLOAD:
          serviceImpl.createMultipartUpload((spec.proto.runtime.v1.s3.ObjectStorageProto.CreateMultipartUploadInput) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.CreateMultipartUploadOutput>) responseObserver);
          break;
        case METHODID_UPLOAD_PART_COPY:
          serviceImpl.uploadPartCopy((spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartCopyInput) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartCopyOutput>) responseObserver);
          break;
        case METHODID_COMPLETE_MULTIPART_UPLOAD:
          serviceImpl.completeMultipartUpload((spec.proto.runtime.v1.s3.ObjectStorageProto.CompleteMultipartUploadInput) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.CompleteMultipartUploadOutput>) responseObserver);
          break;
        case METHODID_ABORT_MULTIPART_UPLOAD:
          serviceImpl.abortMultipartUpload((spec.proto.runtime.v1.s3.ObjectStorageProto.AbortMultipartUploadInput) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.AbortMultipartUploadOutput>) responseObserver);
          break;
        case METHODID_LIST_MULTIPART_UPLOADS:
          serviceImpl.listMultipartUploads((spec.proto.runtime.v1.s3.ObjectStorageProto.ListMultipartUploadsInput) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.ListMultipartUploadsOutput>) responseObserver);
          break;
        case METHODID_LIST_PARTS:
          serviceImpl.listParts((spec.proto.runtime.v1.s3.ObjectStorageProto.ListPartsInput) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.ListPartsOutput>) responseObserver);
          break;
        case METHODID_LIST_OBJECT_VERSIONS:
          serviceImpl.listObjectVersions((spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectVersionsInput) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.ListObjectVersionsOutput>) responseObserver);
          break;
        case METHODID_SIGN_URL:
          serviceImpl.signURL((spec.proto.runtime.v1.s3.ObjectStorageProto.SignURLInput) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.SignURLOutput>) responseObserver);
          break;
        case METHODID_UPDATE_DOWNLOAD_BANDWIDTH_RATE_LIMIT:
          serviceImpl.updateDownloadBandwidthRateLimit((spec.proto.runtime.v1.s3.ObjectStorageProto.UpdateBandwidthRateLimitInput) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_UPLOAD_BANDWIDTH_RATE_LIMIT:
          serviceImpl.updateUploadBandwidthRateLimit((spec.proto.runtime.v1.s3.ObjectStorageProto.UpdateBandwidthRateLimitInput) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_RESTORE_OBJECT:
          serviceImpl.restoreObject((spec.proto.runtime.v1.s3.ObjectStorageProto.RestoreObjectInput) request,
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.RestoreObjectOutput>) responseObserver);
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
        case METHODID_PUT_OBJECT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.putObject(
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.PutObjectOutput>) responseObserver);
        case METHODID_UPLOAD_PART:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadPart(
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.UploadPartOutput>) responseObserver);
        case METHODID_APPEND_OBJECT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.appendObject(
              (io.grpc.stub.StreamObserver<spec.proto.runtime.v1.s3.ObjectStorageProto.AppendObjectOutput>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ObjectStorageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ObjectStorageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return spec.proto.runtime.v1.s3.ObjectStorageProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ObjectStorageService");
    }
  }

  private static final class ObjectStorageServiceFileDescriptorSupplier
      extends ObjectStorageServiceBaseDescriptorSupplier {
    ObjectStorageServiceFileDescriptorSupplier() {}
  }

  private static final class ObjectStorageServiceMethodDescriptorSupplier
      extends ObjectStorageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ObjectStorageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ObjectStorageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ObjectStorageServiceFileDescriptorSupplier())
              .addMethod(getPutObjectMethod())
              .addMethod(getGetObjectMethod())
              .addMethod(getDeleteObjectMethod())
              .addMethod(getCopyObjectMethod())
              .addMethod(getDeleteObjectsMethod())
              .addMethod(getListObjectsMethod())
              .addMethod(getHeadObjectMethod())
              .addMethod(getIsObjectExistMethod())
              .addMethod(getPutObjectTaggingMethod())
              .addMethod(getDeleteObjectTaggingMethod())
              .addMethod(getGetObjectTaggingMethod())
              .addMethod(getGetObjectCannedAclMethod())
              .addMethod(getPutObjectCannedAclMethod())
              .addMethod(getCreateMultipartUploadMethod())
              .addMethod(getUploadPartMethod())
              .addMethod(getUploadPartCopyMethod())
              .addMethod(getCompleteMultipartUploadMethod())
              .addMethod(getAbortMultipartUploadMethod())
              .addMethod(getListMultipartUploadsMethod())
              .addMethod(getListPartsMethod())
              .addMethod(getListObjectVersionsMethod())
              .addMethod(getSignURLMethod())
              .addMethod(getUpdateDownloadBandwidthRateLimitMethod())
              .addMethod(getUpdateUploadBandwidthRateLimitMethod())
              .addMethod(getAppendObjectMethod())
              .addMethod(getRestoreObjectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
