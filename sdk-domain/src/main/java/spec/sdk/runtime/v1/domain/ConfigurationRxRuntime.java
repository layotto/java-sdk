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

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import spec.sdk.runtime.v1.domain.configuration.ConfigurationItem;
import spec.sdk.runtime.v1.domain.configuration.ConfigurationRequestItem;
import spec.sdk.runtime.v1.domain.configuration.SaveConfigurationRequest;
import spec.sdk.runtime.v1.domain.configuration.SubConfigurationResp;

import java.util.List;

public interface ConfigurationRxRuntime extends ConfigurationRuntime {

    /**
     * Gets configuration from configuration store
     *
     * @param configurationRequestItem Request object.
     */
    @Override
    default List<ConfigurationItem> getConfiguration(ConfigurationRequestItem configurationRequestItem) {
        return getConfigurationAsync(configurationRequestItem).block();
    }

    Mono<List<ConfigurationItem>> getConfigurationAsync(ConfigurationRequestItem configurationRequestItem);

    /**
     * Saves configuration into configuration store.
     * ø
     *
     * @param saveConfigurationRequest Request object.
     */
    @Override
    default void saveConfiguration(SaveConfigurationRequest saveConfigurationRequest) {
        saveConfigurationAsync(saveConfigurationRequest).block();
    }

    Mono<Void> saveConfigurationAsync(SaveConfigurationRequest saveConfigurationRequest);

    /**
     * Deletes configuration from configuration store.
     *
     * @param configurationRequestItem Request object.
     */
    @Override
    default void deleteConfiguration(ConfigurationRequestItem configurationRequestItem) {
        deleteConfigurationAsync(configurationRequestItem).block();
    }

    Mono<Void> deleteConfigurationAsync(ConfigurationRequestItem configurationRequestItem);

    /**
     * Gets configuration from configuration store and subscribe the updates.
     *
     * @param configurationRequestItem Request object.
     */
    @Override
    default void subscribeConfiguration(ConfigurationRequestItem configurationRequestItem, Subscriber subscriber) {
        Flux<SubConfigurationResp> subscribeConfigurationAsync = subscribeConfigurationAsync(configurationRequestItem);
        subscribeConfigurationAsync.subscribe(
                subscriber::onNext,
                subscriber::onError,
                subscriber::onComplete);
    }

    Flux<SubConfigurationResp> subscribeConfigurationAsync(ConfigurationRequestItem configurationRequestItem);
}
