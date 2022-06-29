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
package io.mosn.layotto.examples.pubsub.subscriber;

import com.alibaba.fastjson.JSON;
import io.mosn.layotto.v1.RuntimeServerGrpc;
import io.mosn.layotto.v1.callback.component.pubsub.DefaultSubscriber;

import java.util.concurrent.Semaphore;

public class Subscriber {
    static String storeName = "pub_subs_demo";

    /**
     * This is the entry point for this example app, which subscribes to a topic.
     *
     * @throws Exception An Exception on startup.
     */
    public static void main(String[] args) throws Exception {
        RuntimeServerGrpc srv = new RuntimeServerGrpc(9999);
        DefaultSubscriber pubsub = new DefaultSubscriber(storeName);
        // subscribe
        pubsub.subscribe("hello", request -> {
            String value = new String(request.getData());
            assertEquals(value, "world");
            System.out.println(JSON.toJSONString(request));
        });
        pubsub.subscribe("topic1", request -> {
            String value = new String(request.getData());
            assertEquals(value, "message1");
            System.out.println(JSON.toJSONString(request));
        });
        srv.registerPubSubCallback(pubsub.getComponentName(), pubsub);

        // start server
        srv.start();

        // hang
        Semaphore sm = new Semaphore(0);
        sm.acquire();
    }

    private static void assertEquals(Object actualResult, Object expected) {
        if (actualResult == expected || actualResult.equals(expected)) {
            return;
        }
        String msg = "Unexpected result:" + actualResult;
        throw new RuntimeException(msg);
    }
}