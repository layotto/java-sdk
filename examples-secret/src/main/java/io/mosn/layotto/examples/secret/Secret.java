package io.mosn.layotto.examples.secret;
import io.mosn.layotto.v1.RuntimeClientBuilder;
import io.mosn.layotto.v1.config.RuntimeProperties;

import spec.sdk.runtime.v1.client.RuntimeClient;
import spec.sdk.runtime.v1.domain.secret.GetSecretRequest;
import spec.sdk.runtime.v1.domain.secret.GetSecretResponse;
import spec.sdk.runtime.v1.domain.secret.GetBulkSecretRequest;
import spec.sdk.runtime.v1.domain.secret.GetBulkSecretResponse;

import java.util.HashMap;
import java.util.Map;

public class Secret {






        static String               storeName = "secret_demo";
        public static void main(String args[]){
            RuntimeClient client = new RuntimeClientBuilder()
                    .withPort(RuntimeProperties.DEFAULT_PORT)
                    .build();


            /*GetSecret*/
            Map<String, String> meta = new HashMap<>();
            GetSecretRequest secretreq = new GetSecretRequest();
            secretreq.setStoreName(storeName);
            secretreq.setKey("db-user-pass:password");
            secretreq.setMetaData(meta);
            System.out.println(client.getSecret(secretreq).getData());

            /*GetBulkSecret*/
            Map<String, String> meta2 = new HashMap<>();
            GetBulkSecretRequest bulksecretreq = new GetBulkSecretRequest();
            bulksecretreq.setStoreName(storeName);
            bulksecretreq.setMetaData(meta2);
            System.out.println(client.getBulkSecret(bulksecretreq).getData());




        }}
