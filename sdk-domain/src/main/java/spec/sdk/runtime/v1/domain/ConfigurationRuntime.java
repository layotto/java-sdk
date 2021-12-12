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

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;
import spec.sdk.runtime.v1.domain.configuration.ConfigurationItem;
import spec.sdk.runtime.v1.domain.configuration.ConfigurationRequestItem;
import spec.sdk.runtime.v1.domain.configuration.SaveConfigurationRequest;
import spec.sdk.runtime.v1.domain.configuration.SubConfigurationResp;

import java.util.List;

public interface ConfigurationRuntime {

    /**
     * Gets configuration from configuration store
     *
     * @param configurationRequestItem Request object.
     */
    List<ConfigurationItem> getConfiguration(ConfigurationRequestItem configurationRequestItem);

    /**
     * Saves configuration into configuration store.
     *ø
     * @param saveConfigurationRequest Request object.
     */
    void saveConfiguration(SaveConfigurationRequest saveConfigurationRequest);

    /**
     * Deletes configuration from configuration store.
     *
     * @param configurationRequestItem Request object.
     */
    void deleteConfiguration(ConfigurationRequestItem configurationRequestItem);

    /**
     * Gets configuration from configuration store and subscribe the updates.
     *
     * @param configurationRequestItem Request object.
     */
    void subscribeConfiguration(ConfigurationRequestItem configurationRequestItem, Subscriber subscriber);

    interface Subscriber {

        /**
         * Data notification sent by the {@link Publisher} in response to requests to {@link Subscription#request(long)}.
         *
         * @param t the element signaled
         */
        void onNext(SubConfigurationResp t);

        /**
         * Failed terminal state.
         *
         * @param t the throwable signaled
         */
        void onError(Throwable t);

        /**
         * Successful terminal state.
         */
        void onComplete();
    }
}
