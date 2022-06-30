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
package io.mosn.layotto.examples.pubsub.publisher;

import io.mosn.layotto.v1.RuntimeClientBuilder;
import io.mosn.layotto.v1.config.RuntimeProperties;
import spec.sdk.runtime.v1.client.RuntimeClient;

public class Publisher {
    static String storeName = "pub_subs_demo";

    public static void main(String[] args) {
        RuntimeClient client = new RuntimeClientBuilder()
                .withPort(RuntimeProperties.DEFAULT_PORT)
                .build();

        client.publishEvent(storeName, "hello", "world".getBytes());
        System.out.println("Published a new event.Topic: hello ,Data: world");

        client.publishEvent(storeName, "topic1", "value1".getBytes());
        System.out.println("Published a new event.Topic: topic1 ,Data: value1");
    }
}
