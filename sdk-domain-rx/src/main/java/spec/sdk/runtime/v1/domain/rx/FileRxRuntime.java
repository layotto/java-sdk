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
package spec.sdk.runtime.v1.domain.rx;

import reactor.core.publisher.Mono;
import spec.sdk.runtime.v1.domain.FileRuntime;
import spec.sdk.runtime.v1.domain.file.DelFileRequest;
import spec.sdk.runtime.v1.domain.file.DelFileResponse;
import spec.sdk.runtime.v1.domain.file.GetFileRequest;
import spec.sdk.runtime.v1.domain.file.GetFileResponse;
import spec.sdk.runtime.v1.domain.file.GetMetaRequest;
import spec.sdk.runtime.v1.domain.file.GetMeteResponse;
import spec.sdk.runtime.v1.domain.file.ListFileRequest;
import spec.sdk.runtime.v1.domain.file.ListFileResponse;
import spec.sdk.runtime.v1.domain.file.PutFileRequest;
import spec.sdk.runtime.v1.domain.file.PutFileResponse;

public interface FileRxRuntime extends FileRuntime {

    /**
     * save or update file
     *
     * @param request   the put request
     * @param timeoutMs If the time is less than or equal to zero, the method will not wait at all.
     * @throws Exception Instance of RuntimeClientException Or StatusRuntimeException
     */
    @Override
    default PutFileResponse putFile(PutFileRequest request, int timeoutMs) throws Exception {
        return putFileAsync(request, timeoutMs).block();
    }

    Mono<PutFileResponse> putFileAsync(PutFileRequest request, int timeoutMs) throws Exception;

    /**
     * @param request   the get request
     * @param timeoutMs If the time is less than or equal to zero, the method will not wait at all.
     * @throws Exception Instance of RuntimeClientException Or StatusRuntimeException
     */
    @Override
    default GetFileResponse getFile(GetFileRequest request, int timeoutMs) throws Exception {
        return getFileAsync(request, timeoutMs).block();
    }

    Mono<GetFileResponse> getFileAsync(GetFileRequest request, int timeoutMs) throws Exception;

    /**
     * @param request   the list requset
     * @param timeoutMs If the time is less than or equal to zero, the method will not wait at all.
     * @throws Exception Instance of RuntimeClientException Or StatusRuntimeException
     */
    @Override
    default ListFileResponse listFile(ListFileRequest request, int timeoutMs) throws Exception {
        return listFileAsync(request, timeoutMs).block();
    }

    Mono<ListFileResponse> listFileAsync(ListFileRequest request, int timeoutMs) throws Exception;

    /**
     * @param request   the del request
     * @param timeoutMs If the time is less than or equal to zero, the method will not wait at all.
     * @throws Exception Instance of RuntimeClientException Or StatusRuntimeException
     */
    @Override
    default DelFileResponse delFile(DelFileRequest request, int timeoutMs) throws Exception {
        return delFileAsync(request, timeoutMs).block();
    }

    Mono<DelFileResponse> delFileAsync(DelFileRequest request, int timeoutMs) throws Exception;

    /**
     * @param request   the get meta request
     * @param timeoutMs If the time is less than or equal to zero, the method will not wait at all.
     * @throws Exception Instance of RuntimeClientException Or StatusRuntimeException
     */
    @Override
    default GetMeteResponse getFileMeta(GetMetaRequest request, int timeoutMs) throws Exception {
        return getFileMetaAsync(request, timeoutMs).block();
    }

    Mono<GetMeteResponse> getFileMetaAsync(GetMetaRequest request, int timeoutMs) throws Exception;
}
