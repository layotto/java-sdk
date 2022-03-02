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
package spec.sdk.runtime.v1.client;

import spec.sdk.runtime.v1.domain.ConfigurationRuntime;
import spec.sdk.runtime.v1.domain.FileRuntime;
import spec.sdk.runtime.v1.domain.HelloRuntime;
import spec.sdk.runtime.v1.domain.InvocationRuntime;
import spec.sdk.runtime.v1.domain.LockRuntime;
import spec.sdk.runtime.v1.domain.PubSubRuntime;
import spec.sdk.runtime.v1.domain.SequencerRuntime;
import spec.sdk.runtime.v1.domain.StateRuntime;

public interface RuntimeClient extends
                              HelloRuntime,
                              ConfigurationRuntime,
                              InvocationRuntime,
                              PubSubRuntime,
                              StateRuntime,
                              LockRuntime,
                              SequencerRuntime,
                              FileRuntime {

    /**
     * Waits for the sidecar, giving up after timeout.
     *
     * @param timeoutInMilliseconds Timeout in milliseconds to wait for sidecar.
     */
    void waitForSidecar(int timeoutInMilliseconds);

    void shutdown();
}