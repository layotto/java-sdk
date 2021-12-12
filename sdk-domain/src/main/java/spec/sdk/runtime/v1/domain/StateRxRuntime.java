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

import reactor.core.publisher.Mono;
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

public interface StateRxRuntime extends StateRuntime {

    /**
     * Retrieve a State based on their key.
     *
     * @param storeName The name of the state store.
     * @param key       The key of the State to be retrieved.
     * @param clazz     The type of State needed as return.
     * @param <T>       The type of the return.
     */
    @Override
    default <T> State<T> getState(String storeName, String key, Class<T> clazz) {
        return getStateAsync(storeName, key, clazz).block();
    }

    <T> Mono<State<T>> getStateAsync(String storeName, String key, Class<T> clazz);

    /**
     * Retrieve a State based on their key.
     *
     * @param storeName The name of the state store.
     * @param key       The key of the State to be retrieved.
     * @param options   Optional settings for retrieve operation.
     * @param clazz     The Type of State needed as return.
     * @param <T>       The Type of the return.
     */
    @Override
    default <T> State<T> getState(String storeName, String key, StateOptions options, Class<T> clazz) {
        return getStateAsync(storeName, key, options, clazz).block();
    }

    <T> Mono<State<T>> getStateAsync(String storeName, String key, StateOptions options, Class<T> clazz);

    /**
     * Retrieve a State based on their key.
     *
     * @param request The request to get state.
     * @param clazz   The Class of State needed as return.
     * @param <T>     The Type of the return.
     * @return The requested State.
     */
    @Override
    default <T> State<T> getState(GetStateRequest request, Class<T> clazz) {
        return getStateAsync(request, clazz).block();
    }

    <T> Mono<State<T>> getStateAsync(GetStateRequest request, Class<T> clazz);

    /**
     * Retrieve a State based on their key.
     *
     * @param request   The request to get state.
     * @param clazz     The Class of State needed as return.
     * @param timeoutMs timeout in milliseconds
     * @param <T>       The Type of the return.
     * @return the requested State.
     */
    @Override
    default <T> State<T> getState(GetStateRequest request, Class<T> clazz, int timeoutMs) {
        return getStateAsync(request, clazz, timeoutMs).block();
    }

    <T> Mono<State<T>> getStateAsync(GetStateRequest request, Class<T> clazz, int timeoutMs);

    /**
     * Retrieve bulk States based on their keys.
     *
     * @param storeName The name of the state store.
     * @param keys      The keys of the State to be retrieved.
     * @param clazz     The type of State needed as return.
     * @param <T>       The type of the return.
     */
    @Override
    default <T> List<State<T>> getBulkState(String storeName, List<String> keys, Class<T> clazz) {
        return getBulkStateAsync(storeName, keys, clazz).block();
    }

    <T> Mono<List<State<T>>> getBulkStateAsync(String storeName, List<String> keys, Class<T> clazz);

    /**
     * Retrieve bulk States based on their keys.
     *
     * @param request The request to get state.
     * @param clazz   The Class of State needed as return.
     * @param <T>     The Type of the return.
     * @return The requested State.
     */
    @Override
    default <T> List<State<T>> getBulkState(GetBulkStateRequest request, Class<T> clazz) {
        return getBulkStateAsync(request, clazz).block();
    }

    <T> Mono<List<State<T>>> getBulkStateAsync(GetBulkStateRequest request, Class<T> clazz);

    /**
     * Retrieve bulk States based on their keys.
     *
     * @param request   The request to get state.
     * @param clazz     The Class of State needed as return.
     * @param <T>       The Type of the return.
     * @param timeoutMs The time limit(millisecond) of this call.
     * @return The requested State.
     */
    @Override
    default <T> List<State<T>> getBulkState(GetBulkStateRequest request, Class<T> clazz, int timeoutMs) {
        return getBulkStateAsync(request, clazz, timeoutMs).block();
    }

    <T> Mono<List<State<T>>> getBulkStateAsync(GetBulkStateRequest request, Class<T> clazz, int timeoutMs);

    /**
     * Execute a transaction.
     *
     * @param storeName  The name of the state store.
     * @param operations The operations to be performed.
     */
    @Override
    default void executeStateTransaction(String storeName, List<TransactionalStateOperation<?>> operations) {
        executeStateTransactionAsync(storeName, operations).block();
    }

    Mono<Void> executeStateTransactionAsync(String storeName, List<TransactionalStateOperation<?>> operations);

    /**
     * Execute a transaction.
     *
     * @param request Request to execute transaction.
     */
    @Override
    default void executeStateTransaction(ExecuteStateTransactionRequest request) {
        executeStateTransactionAsync(request).block();
    }

    Mono<Void> executeStateTransactionAsync(ExecuteStateTransactionRequest request);

    /**
     * Save/Update a list of states.
     *
     * @param storeName The name of the state store.
     * @param states    The States to be saved.
     */
    @Override
    default void saveBulkState(String storeName, List<State<?>> states) {
        saveBulkStateAsync(storeName, states).block();
    }

    Mono<Void> saveBulkStateAsync(String storeName, List<State<?>> states);

    /**
     * Save/Update a list of states.
     *
     * @param request Request to save states.
     */
    @Override
    default void saveBulkState(SaveStateRequest request) {
        saveBulkStateAsync(request).block();
    }

    Mono<Void> saveBulkStateAsync(SaveStateRequest request);

    /**
     * Save/Update a list of states.
     *
     * @param request   Request to save bulk states.
     * @param timeoutMs timeout in milliseconds
     */
    @Override
    default void saveBulkState(SaveStateRequest request, int timeoutMs) {
        saveBulkStateAsync(request, timeoutMs).block();
    }

    Mono<Void> saveBulkStateAsync(SaveStateRequest request, int timeoutMs);

    /**
     * Save/Update a state.
     *
     * @param storeName The name of the state store.
     * @param key       The key of the state.
     * @param value     The value of the state.
     */
    @Override
    default void saveState(String storeName, String key, Object value) {
        saveStateAsync(storeName, key, value).block();
    }

    Mono<Void> saveStateAsync(String storeName, String key, Object value);

    /**
     * Save/Update a state.
     *
     * @param storeName The name of the state store.
     * @param key       The key of the state.
     * @param etag      The etag to be used.
     * @param value     The value of the state.
     * @param options   The Options to use for each state.
     */
    @Override
    default void saveState(String storeName, String key, String etag, Object value, StateOptions options, Map<String, String> metadata) {
        saveStateAsync(storeName, key, etag, value, options, metadata).block();
    }

    Mono<Void> saveStateAsync(String storeName, String key, String etag, Object value, StateOptions options, Map<String, String> metadata);

    /**
     * Delete a state.
     *
     * @param storeName The name of the state store.
     * @param key       The key of the State to be removed.
     */
    @Override
    default void deleteState(String storeName, String key) {
        deleteStateAsync(storeName, key).block();
    }

    Mono<Void> deleteStateAsync(String storeName, String key);

    /**
     * Delete a state.
     *
     * @param storeName The name of the state store.
     * @param key       The key of the State to be removed.
     * @param etag      Optional etag for conditional delete.
     * @param options   Optional settings for state operation.
     */
    @Override
    default void deleteState(String storeName, String key, String etag, StateOptions options) {
        deleteStateAsync(storeName, key, etag, options).block();
    }

    Mono<Void> deleteStateAsync(String storeName, String key, String etag, StateOptions options);

    /**
     * Delete a state.
     *
     * @param request Request to delete a state.
     */
    @Override
    default void deleteState(DeleteStateRequest request) {
        deleteStateAsync(request).block();
    }

    Mono<Void> deleteStateAsync(DeleteStateRequest request);

    /**
     * Delete a state.
     *
     * @param request   Request to delete a state.
     * @param timeoutMs timeout in milliseconds
     */
    @Override
    default void deleteState(DeleteStateRequest request, int timeoutMs) {
        deleteStateAsync(request, timeoutMs).block();
    }

    Mono<Void> deleteStateAsync(DeleteStateRequest request, int timeoutMs);
}
