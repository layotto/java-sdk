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

import io.mosn.layotto.v1.RuntimeServerGrpc;
import io.mosn.layotto.v1.callback.component.pubsub.DefaultSubscriber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.Map;

/**
 * start RuntimeServerGrpc after spring's initialization completed
 */
public class LayottoSubscriberStarter {
    private static final Logger logger = LoggerFactory.getLogger(LayottoSubscriberStarter.class.getName());
    RuntimeServerGrpc           layottoRuntime;

    @Autowired
    LayottoProperties           layottoConfig;

    @PostConstruct
    public void startLayottoRuntime() throws BeansException {

        layottoRuntime = new RuntimeServerGrpc(layottoConfig.getSubscriberPort());
        for (Map.Entry<String, DefaultSubscriber> kv : LayottoBeanPostProcessor.subscriberMap.entrySet()) {
            logger.debug("register pubsub:{}", kv.getKey());
            layottoRuntime.registerPubSubCallback(kv.getKey(), kv.getValue());
        }
        try {
            layottoRuntime.start();
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
    }
}