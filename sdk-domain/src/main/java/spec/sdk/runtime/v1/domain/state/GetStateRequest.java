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
package spec.sdk.runtime.v1.domain.state;

import java.util.HashMap;
import java.util.Map;

/**
 * A request to get a state by key.
 */
public class GetStateRequest {

    private final String storeName;

    private final String key;

    private Map<String, String> metadata = new HashMap<>();

    private StateOptions stateOptions;

    public GetStateRequest(String storeName, String key) {
        this.storeName = storeName;
        this.key = key;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getKey() {
        return key;
    }

    /**
     * Getter method for property <tt>metadata</tt>.
     *
     * @return property value of metadata
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Setter method for property <tt>metadata</tt>.
     *
     * @param metadata value to be assigned to property metadata
     */
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public void putMetadata(String key, String value) {
        if (key == null) {
            throw new java.lang.NullPointerException();
        }
        if (value == null) {
            throw new java.lang.NullPointerException();
        }
        if (metadata == null) {
            metadata = new HashMap<>();
        }
        metadata.put(key, value);
    }

    /**
     * Getter method for property <tt>stateOptions</tt>.
     *
     * @return property value of stateOptions
     */
    public StateOptions getStateOptions() {
        return stateOptions;
    }

    /**
     * Setter method for property <tt>stateOptions</tt>.
     *
     * @param stateOptions value to be assigned to property stateOptions
     */
    public void setStateOptions(StateOptions stateOptions) {
        this.stateOptions = stateOptions;
    }

    @Override
    public String toString() {
        return "GetStateRequest{" +
                "storeName='" + storeName + '\'' +
                ", key='" + key + '\'' +
                ", metadata=" + metadata +
                ", stateOptions=" + stateOptions +
                '}';
    }
}
