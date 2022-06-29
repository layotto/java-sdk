package io.mosn.layotto.examples.sequencer;

import io.mosn.layotto.v1.RuntimeClientBuilder;
import io.mosn.layotto.v1.config.RuntimeProperties;
import org.junit.Assert;
import spec.sdk.runtime.v1.client.RuntimeClient;
import spec.sdk.runtime.v1.domain.sequencer.GetNextIdRequest;
import spec.sdk.runtime.v1.domain.sequencer.GetNextIdResponse;
import spec.sdk.runtime.v1.domain.sequencer.SequencerOptions;

public class Sequencer {

    static String storeName = "sequencer_demo";
    static String key       = "examples";

    public static void main(String[] args) {
        // construct client
        RuntimeClient client = new RuntimeClientBuilder()
                .withPort(RuntimeProperties.DEFAULT_PORT)
                .build();

        // prepare request
        GetNextIdRequest getNextIdRequest = new GetNextIdRequest();
        getNextIdRequest.setStoreName(storeName);
        getNextIdRequest.setKey(key);
        // set SequencerOptions
        SequencerOptions options = new SequencerOptions();
        options.setOption(SequencerOptions.AutoIncrement.STRONG);
        getNextIdRequest.setOptions(options);

        long prev = 0L;
        for (int i = 0; i < 10; i++) {
            // send request
            System.out.println("Try to get next id.Key: " + key);
            GetNextIdResponse nextIdResponse = client.getNextId(getNextIdRequest);

            // assert
            long nextId = nextIdResponse.getNextId();
            System.out.println("Next id: " + nextId);
            Assert.assertTrue(nextId > prev);

            prev = nextId;
        }
    }

}
