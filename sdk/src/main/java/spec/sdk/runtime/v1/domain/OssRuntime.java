package spec.sdk.runtime.v1.domain;

import spec.proto.runtime.v1.s3.ObjectStorageServiceGrpc;

/**
 * @author Marco
 * Created on 2022/9/1 4:41 下午
 */
public interface OssRuntime {

    ObjectStorageServiceGrpc.ObjectStorageServiceStub getOssAsyncStub();

    ObjectStorageServiceGrpc.ObjectStorageServiceBlockingStub getOssBlockingStub();

}
