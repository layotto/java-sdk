package io.mosn.layotto.examples.lock;

import io.mosn.layotto.v1.RuntimeClientBuilder;
import io.mosn.layotto.v1.config.RuntimeProperties;
import spec.sdk.runtime.v1.client.RuntimeClient;
import spec.sdk.runtime.v1.domain.lock.*;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EtcdLock {
    static String storeName = "lock_demo";
    static String key1      = "key1";
    static String key2      = "key2";
    static String key3      = "key3";
    static String owner1   = UUID.randomUUID().toString();
    static String owner2   = UUID.randomUUID().toString();
    static String owner3   = UUID.randomUUID().toString();
    public static void main(String[] args) throws InterruptedException {
        // build RuntimeClient
        RuntimeClient client = new RuntimeClientBuilder()
                .withPort(RuntimeProperties.DEFAULT_PORT)
                .build();

        TryLockRequest tryLockRequest = new TryLockRequest(storeName, key1, owner1, 10);
        TryLockResponse tryLockResponse = client.tryLock(tryLockRequest);
        assertTrue(tryLockResponse.isSuccess());

        TryLockRequest tryLockRequest1 = new TryLockRequest(storeName, key2, owner2, 10);
        TryLockResponse tryLockResponse1 = client.tryLock(tryLockRequest1);
        assertTrue(tryLockResponse1.isSuccess());

        TryLockRequest tryLockRequest2 = new TryLockRequest(storeName, key3, owner3, 120);
        TryLockResponse tryLockResponse2 = client.tryLock(tryLockRequest2);
        assertTrue(tryLockResponse2.isSuccess());

        UnlockRequest unlockRequest = new UnlockRequest(storeName,key1, owner1);
        UnlockResponse unlockResponse = client.unlock(unlockRequest);
        assertEquals(unlockResponse.getStatus(), UnlockResponseStatus.SUCCESS);


        UnlockRequest unlockRequest1 = new UnlockRequest(storeName,key2, owner2);
        UnlockResponse unlockResponse1 = client.unlock(unlockRequest1);
        assertEquals(unlockResponse1.getStatus(), UnlockResponseStatus.SUCCESS);



        TimeUnit.SECONDS.sleep(10);
        UnlockRequest unlockRequest3 = new UnlockRequest(storeName,key3, owner3);
        UnlockResponse unlockResponse3 = client.unlock(unlockRequest3);
        assertEquals(unlockResponse3.getStatus(), UnlockResponseStatus.LOCK_NOT_EXISTS);


    }
}
