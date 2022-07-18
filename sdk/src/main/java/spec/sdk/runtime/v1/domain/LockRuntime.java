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

import spec.sdk.runtime.v1.domain.lock.TryLockRequest;
import spec.sdk.runtime.v1.domain.lock.TryLockResponse;
import spec.sdk.runtime.v1.domain.lock.UnlockRequest;
import spec.sdk.runtime.v1.domain.lock.UnlockResponse;

public interface LockRuntime {

    /**
     * try to obtain a lock. {@link TryLockRequest#setStoreName(String)} setting the storage type
     * @param request Get the lock
     * @return Get the result of lock, If success is true, otherwise false.
     */
    TryLockResponse tryLock(TryLockRequest request);

    UnlockResponse unlock(UnlockRequest request);
}
