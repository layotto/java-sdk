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

import io.mosn.layotto.v1.Topic;
import io.mosn.layotto.v1.callback.component.pubsub.DefaultSubscriber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.EmbeddedValueResolver;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * LayottoBeanPostProcessor to record @Topic method
 */
@Component
public class LayottoBeanPostProcessor implements BeanPostProcessor {

    private static final Logger logger = LoggerFactory.getLogger(LayottoBeanPostProcessor.class.getName());

    private final EmbeddedValueResolver embeddedValueResolver;

    static Map<String, DefaultSubscriber> subscriberMap = new ConcurrentHashMap<>();

    LayottoBeanPostProcessor(ConfigurableBeanFactory beanFactory) {
        embeddedValueResolver = new EmbeddedValueResolver(beanFactory);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean == null) {
            return null;
        }
        subscribeToTopics(bean.getClass(), bean, embeddedValueResolver);

        return bean;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        return bean;
    }


    private static void subscribeToTopics(Class clazz, Object bean, EmbeddedValueResolver embeddedValueResolver) {
        if (clazz == null) {
            return;
        }

        subscribeToTopics(clazz.getSuperclass(), bean, embeddedValueResolver);
        for (Method method : clazz.getDeclaredMethods()) {
            Topic topic = method.getAnnotation(Topic.class);
            if (topic == null) {
                continue;
            }
            String topicName = embeddedValueResolver.resolveStringValue(topic.name());
            String pubSubName = embeddedValueResolver.resolveStringValue(topic.pubsubName());
            if ((topicName != null) && (topicName.length() > 0) && pubSubName != null && pubSubName.length() > 0) {

                if (!subscriberMap.containsKey(pubSubName)) {
                    subscriberMap.put(pubSubName, new DefaultSubscriber(pubSubName));
                }
                subscriberMap.get(pubSubName).subscribe(topicName, new LayottoEventListener(bean, method));

            }
        }
    }

}
