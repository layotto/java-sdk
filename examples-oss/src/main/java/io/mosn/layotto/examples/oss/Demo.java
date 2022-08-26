package io.mosn.layotto.examples.oss;

import io.mosn.layotto.v1.RuntimeClientBuilder;
import io.mosn.layotto.v1.config.RuntimeProperties;
import org.junit.Assert;
import spec.sdk.runtime.v1.client.RuntimeClient;

public class Demo {

    static String storeName = "oss_demo";

    public static void main(String[] args) {
        // construct client
        RuntimeClient client = new RuntimeClientBuilder()
                .withPort(RuntimeProperties.DEFAULT_PORT)
                .build();

        Demo.TestPutObject(client);
        //Demo.TestGetObjectInput(client);
        //Demo.TestDeleteObject(client);
        //Demo.TestDeleteObjects(client);
    }

    private static void TestPutObject(RuntimeClient client) {

    }
}
