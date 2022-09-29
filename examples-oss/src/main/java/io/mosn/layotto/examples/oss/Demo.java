/*
 * Copyright 2021 Layotto Authors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mosn.layotto.examples.oss;

import io.grpc.stub.StreamObserver;
import io.mosn.layotto.v1.RuntimeClientBuilder;
import io.mosn.layotto.v1.config.RuntimeProperties;
import spec.proto.extension.v1.s3.ObjectStorageProto;
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
        StreamObserver<ObjectStorageProto.PutObjectInput> putObjectInputStreamObserver = client.getOssAsyncStub()
            .putObject(new StreamObserver<ObjectStorageProto.PutObjectOutput>() {
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
        ObjectStorageProto.PutObjectInput input = ObjectStorageProto.PutObjectInput.newBuilder()
            .setStoreName(storeName).setKey("key1").build();
        putObjectInputStreamObserver.onNext(input);
        // Mark the end of requests
        putObjectInputStreamObserver.onCompleted();
    }

    private static void TestGetObjectInput(RuntimeClient client) {
        ObjectStorageProto.GetObjectInput input = ObjectStorageProto.GetObjectInput.newBuilder()
            .setStoreName(storeName).setKey("key1").build();
        Iterator<ObjectStorageProto.GetObjectOutput> object = client.getOssBlockingStub().getObject(input);
        while (object.hasNext()) {
            ObjectStorageProto.GetObjectOutput next = object.next();
            System.out.println(next.getBody());
        }
    }

    private static void TestDeleteObject(RuntimeClient client) {
        ObjectStorageProto.DeleteObjectInput input = ObjectStorageProto.DeleteObjectInput.newBuilder()
            .setStoreName(storeName).setKey("key1").build();
        client.getOssBlockingStub().deleteObject(input);
    }

    private static void TestDeleteObjects(RuntimeClient client) {
        ObjectStorageProto.ObjectIdentifier identifier1 = ObjectStorageProto.ObjectIdentifier.newBuilder().setKey("key1").build();
        ObjectStorageProto.ObjectIdentifier identifier2 = ObjectStorageProto.ObjectIdentifier.newBuilder().setKey("key2").build();
        List<ObjectStorageProto.ObjectIdentifier>  identifiers = new ArrayList<>();
        identifiers.add(identifier1);
        identifiers.add(identifier2);

        ObjectStorageProto.Delete delete = ObjectStorageProto.Delete.newBuilder().addAllObjects(identifiers).build();

        ObjectStorageProto.DeleteObjectsInput input = ObjectStorageProto.DeleteObjectsInput.newBuilder().setStoreName(storeName).setDelete(delete).build();

        client.getOssBlockingStub().deleteObjects(input);
    }
}
