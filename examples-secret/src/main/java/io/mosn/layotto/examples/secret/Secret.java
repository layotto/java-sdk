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
    static String              value     = "S!S*d$zDsb=";
    static String[]            keys      = new String[] { "redisPassword", "db-user-pass:password",
            "db-user-pass:username"     };
    static Map<String, String> values    = new HashMap<String, String>() {
                                             {
                                                 put("redisPassword", "redis123");
                                                 put("db-user-pass:password", "S!S*d$zDsb=");
                                                 put("db-user-pass:username", "devuser");
                                             }
                                         };

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
            assertMap(response.getData(),key,value);

            /*GetBulkSecret*/
            Map<String, String> meta2 = new HashMap<>();
            GetBulkSecretRequest bulksecretreq = new GetBulkSecretRequest();
            bulksecretreq.setStoreName(storeName);
            bulksecretreq.setMetaData(meta2);
            GetBulkSecretResponse bulkrespone = client.getBulkSecret(bulksecretreq);
            System.out.println(bulkrespone.getData());
            assertBulkMap(bulkrespone.getData(), keys,values);
        }

    private static void assertMap(Map<String, String> secret, String key, String value) {
        if (secret.get(key).equals(value)) {
            return;
        }
        throw new AssertionError();
    }

    private static void assertBulkMap(Map<String, Map<String, String>> bulksecret, String keys[], Map<String, String> values ) {
        Map<String, String> temp = new HashMap<>();
        for (String key : keys) {
            temp = bulksecret.get(key);
            if(!(temp.get(key).equals(values.get(key))))
                throw new AssertionError();
        }
        return;
    }

}
