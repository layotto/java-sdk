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
package spec.sdk.runtime.reactor.v1.client;

import reactor.core.publisher.Mono;
import spec.sdk.runtime.v1.domain.rx.ConfigurationRxRuntime;
import spec.sdk.runtime.v1.domain.rx.FileRxRuntime;
import spec.sdk.runtime.v1.domain.rx.HelloRxRuntime;
import spec.sdk.runtime.v1.domain.rx.InvocationRxRuntime;
import spec.sdk.runtime.v1.domain.rx.LockRxRuntime;
import spec.sdk.runtime.v1.domain.rx.PubSubRxRuntime;
import spec.sdk.runtime.v1.domain.rx.SequencerRxRuntime;
import spec.sdk.runtime.v1.domain.rx.StateRxRuntime;

/**
 * Cloud Runtimes JVM Client.
 */
public interface ReactorRuntimeClient extends
        ConfigurationRxRuntime,
        FileRxRuntime,
        HelloRxRuntime,
        InvocationRxRuntime,
        LockRxRuntime,
        PubSubRxRuntime,
        SequencerRxRuntime,
        StateRxRuntime {

    /**
     * Waits for the sidecar, giving up after timeout.
     *
     * @param timeoutInMilliseconds Timeout in milliseconds to wait for sidecar.
     * @return a Mono plan of type Void.
     */
    Mono<Void> waitForSidecar(int timeoutInMilliseconds);

    /**
     * Gracefully shutdown the cloud-runtimes runtime.
     *
     * @return a Mono plan of type Void.
     */
    Mono<Void> shutdown();
}
