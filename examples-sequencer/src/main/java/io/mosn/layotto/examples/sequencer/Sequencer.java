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

        // send request
        System.out.println("Try to get next id.Key: " + key);
        GetNextIdResponse nextId = client.getNextId(getNextIdRequest);

        // assert
        System.out.println("Next id: " + nextId.getNextId());
        Assert.assertTrue(nextId.getNextId() > 0L);

        // send request again
        GetNextIdResponse nextId2 = client.getNextId(getNextIdRequest);

        // assert
        System.out.println("Next id: " + nextId2.getNextId());
        Assert.assertTrue(nextId2.getNextId() > nextId.getNextId());

        // send request again
        GetNextIdResponse nextId3 = client.getNextId(getNextIdRequest);

        // assert
        System.out.println("Next id: " + nextId3.getNextId());
        Assert.assertTrue(nextId3.getNextId() > nextId2.getNextId());
    }

}
