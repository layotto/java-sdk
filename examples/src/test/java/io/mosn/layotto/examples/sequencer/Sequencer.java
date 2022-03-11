package io.mosn.layotto.examples.sequencer;

import io.mosn.layotto.examples.file.File;
import io.mosn.layotto.v1.RuntimeClientBuilder;
import io.mosn.layotto.v1.config.RuntimeProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spec.sdk.runtime.v1.client.RuntimeClient;
import spec.sdk.runtime.v1.domain.sequencer.GetNextIdRequest;
import spec.sdk.runtime.v1.domain.sequencer.GetNextIdResponse;
import spec.sdk.runtime.v1.domain.sequencer.SequencerOptions;

public class Sequencer {

    private static final Logger logger    = LoggerFactory.getLogger(Sequencer.class.getName());

    static String               storeName = "redis";
    static String               key  = "examples";
    static SequencerOptions     options = new SequencerOptions();

    public static void main(String[] args) {
        options.setOption(SequencerOptions.AutoIncrement.WEAK);

        RuntimeClient client = new RuntimeClientBuilder()
                .withPort(RuntimeProperties.DEFAULT_PORT)
                .build();

        GetNextIdRequest getNextIdRequest = new GetNextIdRequest();
        getNextIdRequest.setStoreName(storeName);
        getNextIdRequest.setKey(key);
        getNextIdRequest.setOptions(options);

        GetNextIdResponse nextId = client.getNextId(getNextIdRequest);

        System.out.println("id :"+nextId.getNextId());
    }

}
