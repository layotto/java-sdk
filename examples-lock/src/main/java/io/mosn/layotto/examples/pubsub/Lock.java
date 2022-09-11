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
package io.mosn.layotto.examples.pubsub;

import io.mosn.layotto.v1.RuntimeClientBuilder;
import io.mosn.layotto.v1.config.RuntimeProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spec.sdk.runtime.v1.client.RuntimeClient;
import spec.sdk.runtime.v1.domain.lock.*;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Lock {

    private final static Logger logger    = LoggerFactory.getLogger(Lock.class);
    static String               storeName = "lock_demo";
    static String               key1      = "key1";
    static String               key2      = "key2";
    static String               key3      = "key3";
    static String               owner1    = UUID.randomUUID().toString();
    static String               owner2    = UUID.randomUUID().toString();
    static String               owner3    = UUID.randomUUID().toString();

    public static void main(String[] args) throws InterruptedException {
        // build RuntimeClient
        RuntimeClient client = new RuntimeClientBuilder()
            .withPort(RuntimeProperties.DEFAULT_PORT)
            .build();

        TryLockRequest tryLockRequest = new TryLockRequest(storeName, key1, owner1, 10);
        TryLockResponse tryLockResponse = client.tryLock(tryLockRequest);
        assertTrue(tryLockResponse.isSuccess());
        logger.info(tryLockResponse.toString());

        TryLockRequest tryLockRequest1 = new TryLockRequest(storeName, key2, owner2, 10);
        TryLockResponse tryLockResponse1 = client.tryLock(tryLockRequest1);
        assertTrue(tryLockResponse1.isSuccess());
        logger.info(tryLockResponse1.toString());

        TryLockRequest tryLockRequest2 = new TryLockRequest(storeName, key3, owner3, 10);
        TryLockResponse tryLockResponse2 = client.tryLock(tryLockRequest2);
        assertTrue(tryLockResponse2.isSuccess());
        logger.info(tryLockResponse2.toString());

        UnlockRequest unlockRequest = new UnlockRequest(storeName, key1, owner1);
        UnlockResponse unlockResponse = client.unlock(unlockRequest);
        assertEquals(unlockResponse.getStatus(), UnlockResponseStatus.SUCCESS);
        logger.info(unlockResponse.toString());

        UnlockRequest unlockRequest1 = new UnlockRequest(storeName, key2, owner2);
        UnlockResponse unlockResponse1 = client.unlock(unlockRequest1);
        assertEquals(unlockResponse1.getStatus(), UnlockResponseStatus.SUCCESS);
        logger.info(tryLockResponse1.toString());

        TimeUnit.SECONDS.sleep(10);
        UnlockRequest unlockRequest3 = new UnlockRequest(storeName, key3, owner3);
        UnlockResponse unlockResponse3 = client.unlock(unlockRequest3);
        assertEquals(unlockResponse3.getStatus(), UnlockResponseStatus.LOCK_UNEXIST);
        logger.info(unlockResponse3.toString());

    }

    private static void assertEquals(Object actualResult, Object expected) {
        if (actualResult == expected || actualResult.equals(expected)) {
            return;
        }
        String msg = "[Error] Unexpected result:" + actualResult;
        System.out.println(msg);
        throw new RuntimeException(msg);
    }

    private static void assertTrue(boolean condition) {
        if (condition) {
            return;
        }
        throw new AssertionError();
    }
}
