package io.mosn.layotto.examples.pubsub.springboot;

import io.mosn.layotto.v1.Sequencer;
import org.springframework.stereotype.Component;
import spec.sdk.runtime.v1.domain.sequencer.GetNextIdRequest;
@Component
public class SequencerMethod {
        @Sequencer(store_name="sequencer_demo", key = "examples", options ="STRONG" )
        public void method1(GetNextIdRequest request) {
            System.out.println(new String(request.getStoreName()));
        }

        @Sequencer(store_name="sequencer_demo", key = "examples", options ="WEAK" )
        public void method2(GetNextIdRequest request) {
        System.out.println(new String(request.getStoreName()));
    }

}
