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
package io.mosn.layotto.v1.reactor.client;

import io.mosn.layotto.v1.infrastructure.serializer.ObjectSerializer;
import reactor.core.publisher.Mono;
import spec.sdk.runtime.reactor.v1.client.ReactorRuntimeClient;
import spec.sdk.runtime.v1.domain.invocation.InvokeResponse;
import spec.sdk.runtime.v1.domain.pubsub.PublishEventRequest;
import spec.sdk.runtime.v1.domain.state.DeleteStateRequest;
import spec.sdk.runtime.v1.domain.state.ExecuteStateTransactionRequest;
import spec.sdk.runtime.v1.domain.state.GetBulkStateRequest;
import spec.sdk.runtime.v1.domain.state.GetStateRequest;
import spec.sdk.runtime.v1.domain.state.SaveStateRequest;
import spec.sdk.runtime.v1.domain.state.State;
import spec.sdk.runtime.v1.domain.state.StateOptions;
import spec.sdk.runtime.v1.domain.state.TransactionalStateOperation;

import java.util.List;
import java.util.Map;

abstract class AbstractLayottoReactorClient implements ReactorRuntimeClient {

    /**
     * A utility class for serialize and deserialize the transient objects.
     */
    protected ObjectSerializer objectSerializer;

    /**
     * A utility class for serialize and deserialize state objects.
     */
    protected ObjectSerializer stateSerializer;

    /**
     * Common constructor for implementations of this class.
     *
     * @param objectSerializer Serializer for transient request/response objects.
     * @param stateSerializer  Serializer for state objects.
     */
    AbstractLayottoReactorClient(ObjectSerializer objectSerializer,
                                 ObjectSerializer stateSerializer) {
        this.objectSerializer = objectSerializer;
        this.stateSerializer = stateSerializer;
    }

    @Override
    public Mono<String> sayHelloAsync(String name) {
        return sayHelloAsync(name, getTimeoutMs());
    }

    @Override
    public Mono<InvokeResponse<byte[]>> invokeMethodAsync(String appId, String methodName, byte[] data,
                                                          Map<String, String> header) {
        return invokeMethodAsync(appId, methodName, data, header, getTimeoutMs());
    }

    @Override
    public Mono<Void> publishEventAsync(String pubsubName, String topicName, byte[] data) {
        PublishEventRequest publishEventRequest = new PublishEventRequest();
        publishEventRequest.setPubsubName(pubsubName);
        publishEventRequest.setTopic(topicName);
        publishEventRequest.setData(data);
        return publishEventAsync(publishEventRequest);
    }

    @Override
    public Mono<Void> publishEventAsync(String pubsubName, String topicName, byte[] data, Map<String, String> metadata) {
        PublishEventRequest publishEventRequest = new PublishEventRequest();
        publishEventRequest.setPubsubName(pubsubName);
        publishEventRequest.setTopic(topicName);
        publishEventRequest.setData(data);
        publishEventRequest.setMetadata(metadata);
        return publishEventAsync(publishEventRequest);
    }

    @Override
    public Mono<Void> publishEventAsync(String pubsubName, String topicName, byte[] data, String contentType,
                                        Map<String, String> metadata) {
        PublishEventRequest publishEventRequest = new PublishEventRequest();
        publishEventRequest.setPubsubName(pubsubName);
        publishEventRequest.setTopic(topicName);
        publishEventRequest.setData(data);
        publishEventRequest.setContentType(contentType);
        publishEventRequest.setMetadata(metadata);
        return publishEventAsync(publishEventRequest);
    }

    @Override
    public <T> Mono<State<T>> getStateAsync(String storeName, String key, Class<T> clazz) {
        GetStateRequest getStateRequest = new GetStateRequest(storeName, key);
        return getStateAsync(getStateRequest, clazz, getTimeoutMs());
    }

    @Override
    public <T> Mono<State<T>> getStateAsync(String storeName, String key, StateOptions options, Class<T> clazz) {
        GetStateRequest getStateRequest = new GetStateRequest(storeName, key);
        getStateRequest.setStateOptions(options);
        return getStateAsync(getStateRequest, clazz, getTimeoutMs());
    }

    @Override
    public <T> Mono<State<T>> getStateAsync(GetStateRequest request, Class<T> clazz) {
        return getStateAsync(request, clazz, getTimeoutMs());
    }

    @Override
    public <T> Mono<List<State<T>>> getBulkStateAsync(String storeName, List<String> keys, Class<T> clazz) {
        GetBulkStateRequest getBulkStateRequest = new GetBulkStateRequest(storeName, keys);
        return getBulkStateAsync(getBulkStateRequest, clazz, getTimeoutMs());
    }

    @Override
    public <T> Mono<List<State<T>>> getBulkStateAsync(GetBulkStateRequest request, Class<T> clazz) {
        return getBulkStateAsync(request, clazz, getTimeoutMs());
    }

    @Override
    public Mono<Void> executeStateTransactionAsync(String storeName, List<TransactionalStateOperation<?>> operations) {
        ExecuteStateTransactionRequest executeStateTransactionRequest = new ExecuteStateTransactionRequest(storeName);
        executeStateTransactionRequest.setOperations(operations);
        return executeStateTransactionAsync(executeStateTransactionRequest);
    }

    @Override
    public Mono<Void> saveBulkStateAsync(String storeName, List<State<?>> states) {
        SaveStateRequest saveStateRequest = new SaveStateRequest(storeName);
        saveStateRequest.setStates(states);
        return saveBulkStateAsync(saveStateRequest);
    }

    @Override
    public Mono<Void> saveBulkStateAsync(SaveStateRequest request) {
        return saveBulkStateAsync(request, getTimeoutMs());
    }

    @Override
    public Mono<Void> saveStateAsync(String storeName, String key, Object value) {
        return saveStateAsync(storeName, key, null, value, null, null);
    }

    @Override
    public Mono<Void> saveStateAsync(String storeName, String key, String etag, Object value, StateOptions options,
                                     Map<String, String> metadata) {
        return null;
    }

    @Override
    public Mono<Void> deleteStateAsync(String storeName, String key) {
        return null;
    }

    @Override
    public Mono<Void> deleteStateAsync(String storeName, String key, String etag, StateOptions options) {
        return null;
    }

    @Override
    public Mono<Void> deleteStateAsync(DeleteStateRequest request) {
        return null;
    }

    @Override
    public Mono<Void> deleteStateAsync(DeleteStateRequest request, int timeoutMs) {
        return null;
    }

    @Override
    public Mono<Void> waitForSidecar(int timeoutInMilliseconds) {
        return null;
    }

    @Override
    public Mono<Void> shutdown() {
        return null;
    }

    /**
     * Getter method for property <tt>timeoutMs</tt>.
     *
     * @return property value of timeoutMs
     */
    public int getTimeoutMs() {
        return 0;
    }
}
