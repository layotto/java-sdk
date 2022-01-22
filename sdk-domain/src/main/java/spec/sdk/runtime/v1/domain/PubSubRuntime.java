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
package spec.sdk.runtime.v1.domain;

import spec.sdk.runtime.v1.domain.pubsub.PublishEventRequest;

import java.util.Map;

public interface PubSubRuntime {

    /**
     * Publish an event.
     *
     * @param pubsubName the pubsub name we will publish the event to
     * @param topicName  the topicName where the event will be published.
     * @param data       the event's data to be published, use byte[] for skipping serialization.
     */
    //void publishEvent(String pubsubName, String topicName, Object data);

    /**
     * Publish an event.
     *
     * @param pubsubName the pubsub name we will publish the event to
     * @param topicName  the topicName where the event will be published.
     * @param data       the event's data to be published, use byte[] for skipping serialization.
     * @param metadata   The metadata for the published event.
     */
    //void publishEvent(String pubsubName, String topicName, Object data, Map<String, String> metadata);

    /**
     * Publish an event.
     *
     * @param pubsubName the pubsub name we will publish the event to
     * @param topicName  the topicName where the event will be published.
     * @param data       the event's data to be published, use byte[] for skipping serialization.
     */
    void publishEvent(String pubsubName, String topicName, byte[] data);

    void publishEvent(String pubsubName, String topicName, byte[] data, Map<String, String> metadata);

    void publishEvent(String pubsubName, String topicName, byte[] data, String contentType, Map<String, String> metadata);

    /**
     * Publish an event.
     *
     * @param request the request for the publish event.
     */
    // void publishEvent(PublishEventRequest request);
}
