package io.mosn.layotto.examples.pubsub.springboot;

import io.mosn.layotto.v1.Topic;
import org.springframework.stereotype.Component;
import spec.sdk.runtime.v1.domain.pubsub.TopicEventRequest;


@Component
public class SubscribeMethod {
    @Topic(name = "hello", pubsubName = "redis")
    public void method1(TopicEventRequest request) {
        System.out.println(new String(request.getData()));
    }

    @Topic(name = "topic1", pubsubName = "redis")
    public void method2(TopicEventRequest request) {
        System.out.println(new String(request.getData()));
    }
}
