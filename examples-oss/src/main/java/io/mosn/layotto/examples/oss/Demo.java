package io.mosn.layotto.examples.oss;

import io.grpc.stub.StreamObserver;
import io.mosn.layotto.v1.RuntimeClientBuilder;
import io.mosn.layotto.v1.config.RuntimeProperties;
import spec.proto.runtime.v1.s3.ObjectStorageProto;
import spec.sdk.runtime.v1.client.RuntimeClient;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

    static String storeName = "oss_demo";

    public static void main(String[] args) {
        // construct client
        RuntimeClient client = new RuntimeClientBuilder()
                .withPort(RuntimeProperties.DEFAULT_PORT)
                .build();

        Demo.TestPutObject(client);
        Demo.TestGetObjectInput(client);
        Demo.TestDeleteObject(client);
        Demo.TestDeleteObjects(client);
    }

    private static void TestPutObject(RuntimeClient client) {
        StreamObserver<ObjectStorageProto.PutObjectInput> putObjectInputStreamObserver = client.getOssManager().getAsyncStub().putObject(new StreamObserver<ObjectStorageProto.PutObjectOutput>() {
            @Override
            public void onNext(ObjectStorageProto.PutObjectOutput putObjectOutput) {
                //receive response
                System.out.println(putObjectOutput.getBucketKeyEnabled());
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        });

        //send request
        ObjectStorageProto.PutObjectInput input = ObjectStorageProto.PutObjectInput.newBuilder().setStoreName(storeName).setKey("key1").build();
        putObjectInputStreamObserver.onNext(input);
    }

    private static void TestGetObjectInput(RuntimeClient client) {
        ObjectStorageProto.GetObjectInput input = ObjectStorageProto.GetObjectInput.newBuilder().setStoreName(storeName).setKey("key1").build();
        Iterator<ObjectStorageProto.GetObjectOutput> object = client.getOssManager().getBlockingStub().getObject(input);
        while (object.hasNext()) {
            ObjectStorageProto.GetObjectOutput next = object.next();
            System.out.println(next.getBody());
        }
    }

    private static void TestDeleteObject(RuntimeClient client) {
        ObjectStorageProto.DeleteObjectInput input = ObjectStorageProto.DeleteObjectInput.newBuilder().setStoreName(storeName).setKey("key1").build();
        client.getOssManager().getBlockingStub().deleteObject(input);
    }

    private static void TestDeleteObjects(RuntimeClient client) {
        ObjectStorageProto.ObjectIdentifier identifier1 = ObjectStorageProto.ObjectIdentifier.newBuilder().setKey("key1").build();
        ObjectStorageProto.ObjectIdentifier identifier2 = ObjectStorageProto.ObjectIdentifier.newBuilder().setKey("key2").build();
        List<ObjectStorageProto.ObjectIdentifier>  identifiers = new ArrayList<>();
        identifiers.add(identifier1);
        identifiers.add(identifier2);

        ObjectStorageProto.Delete delete = ObjectStorageProto.Delete.newBuilder().addAllObjects(identifiers).build();

        ObjectStorageProto.DeleteObjectsInput input = ObjectStorageProto.DeleteObjectsInput.newBuilder().setStoreName(storeName).setDelete(delete).build();

        client.getOssManager().getBlockingStub().deleteObjects(input);
    }
}
