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
package io.mosn.layotto.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * to save spring properties
 */
@Component
public class LayottoConfig {


    public static final int DEFAULT_SUBSCRIBER_PORT = 9999;

    @Value("${layotto.subscriber.port}")
    static public Integer port;

    static public int getPort() {
        return port == null ? DEFAULT_SUBSCRIBER_PORT : port;
    }
}
