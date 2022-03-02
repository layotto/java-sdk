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
package io.mosn.layotto.v1.serializer;

import com.alibaba.fastjson.JSONObject;
import io.mosn.layotto.v1.infrastructure.serializer.AbstractSerializer;

import java.io.IOException;

public class JSONSerializer extends AbstractSerializer {

    /**
     * {@inheritDoc}
     */
    @Override
    protected byte[] doSerialize(Object o) throws IOException {
        return JSONObject.toJSONBytes(o);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected <T> T doDeserialize(byte[] data, Class<T> clazz) throws IOException {
        return JSONObject.parseObject(data, clazz);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getContentType() {
        return "application/json";
    }
}
