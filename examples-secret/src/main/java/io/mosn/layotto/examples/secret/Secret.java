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
package io.mosn.layotto.examples.secret;

import io.mosn.layotto.v1.RuntimeClientBuilder;
import io.mosn.layotto.v1.config.RuntimeProperties;
import spec.sdk.runtime.v1.client.RuntimeClient;
import spec.sdk.runtime.v1.domain.secret.GetBulkSecretRequest;
import spec.sdk.runtime.v1.domain.secret.GetBulkSecretResponse;
import spec.sdk.runtime.v1.domain.secret.GetSecretRequest;
import spec.sdk.runtime.v1.domain.secret.GetSecretResponse;

import java.util.HashMap;
import java.util.Map;

public class Secret {

    static String              storeName = "secret_demo";
    static String              key       = "db-user-pass:password";

    public static void main(String args[]){
            RuntimeClient client = new RuntimeClientBuilder()
                    .withPort(RuntimeProperties.DEFAULT_PORT)
                    .build();

            /*GetSecret*/
            Map<String, String> meta = new HashMap<>();
            GetSecretRequest secretreq = new GetSecretRequest();
            secretreq.setStoreName(storeName);
            secretreq.setKey(key);
            secretreq.setMetaData(meta);
            GetSecretResponse response = client.getSecret(secretreq);
            System.out.println(response.getData());
            assertMap(response.getData());

            /*GetBulkSecret*/
            Map<String, String> meta2 = new HashMap<>();
            GetBulkSecretRequest bulksecretreq = new GetBulkSecretRequest();
            bulksecretreq.setStoreName(storeName);
            bulksecretreq.setMetaData(meta2);
            GetBulkSecretResponse bulkrespone = client.getBulkSecret(bulksecretreq);
            System.out.println(bulkrespone.getData());
            assertBulkMap(bulkrespone.getData());
        }

    private static void assertMap(Map<String, String> secret) {
        if (secret.isEmpty()) {
            throw new AssertionError();
        }
        return;
    }

    private static void assertBulkMap(Map<String, Map<String, String>> bulksecret) {
        if (bulksecret.isEmpty()) {
            throw new AssertionError();
        }
        return;
    }

}
