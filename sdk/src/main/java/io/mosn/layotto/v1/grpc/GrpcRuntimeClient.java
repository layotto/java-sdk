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
package io.mosn.layotto.v1.grpc;

import io.mosn.layotto.v1.grpc.stub.StubManager;
import spec.proto.runtime.v1.RuntimeGrpc;
import spec.proto.runtime.v1.s3.ObjectStorageServiceGrpc;
import spec.sdk.runtime.v1.client.RuntimeClient;

public interface GrpcRuntimeClient extends RuntimeClient {

    /**
     * Getter method for property <tt>stubManager</tt>.
     *
     * Do not use it !
     * This method is deprecated and might be refactored in the future.
     * We want this client to expose grpc Channels instead of grpc stubs.
     *
     * @return property value of stubManager
     */
    @Deprecated
    StubManager<RuntimeGrpc.RuntimeStub, RuntimeGrpc.RuntimeBlockingStub> getStubManager();
}