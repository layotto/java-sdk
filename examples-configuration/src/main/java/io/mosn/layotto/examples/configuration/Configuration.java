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
package io.mosn.layotto.examples.configuration;

import io.mosn.layotto.v1.RuntimeClientBuilder;
import io.mosn.layotto.v1.config.RuntimeProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spec.sdk.runtime.v1.client.RuntimeClient;
import spec.sdk.runtime.v1.domain.configuration.*;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Configuration {

    private static final Logger logger    = LoggerFactory.getLogger(Configuration.class.getName());
    private String              dataClass;
    static String               storeName = "config_demo";
    static String               appId     = "testApplication_yang";
    static String               group     = "application";

    public static void main(String[] args) throws Exception {

        RuntimeClient client = new RuntimeClientBuilder()
            .withPort(RuntimeProperties.DEFAULT_PORT)
            .build();
        // Belows are CRUD examples
        // 1. set
        set(client);

        // 2. get after set
        // Since configuration data might be cached and eventual-consistent,we need to sleep a while before querying new data
        TimeUnit.SECONDS.sleep(2);
        get(client);

        // 3. delete
        delete(client);

        // 4. get after delete
        //sleep a while before querying deleted data
        TimeUnit.SECONDS.sleep(2);
        get(client);

        // 5. show how to use subscribe API
        // with sdk
        subscribe(client);
    }

    public static void set(RuntimeClient client) throws Exception {

        ConfigurationItem item1 = new ConfigurationItem();
        item1.setGroup(group);
        item1.setLabel("prod");
        item1.setKey("key1");
        item1.setContent("value1");
        Map<String, String> tags1 = new HashMap<>();
        tags1.put("release", "1.0.0");
        tags1.put("feature", "print");
        item1.setTags(tags1);

        ConfigurationItem item2 = new ConfigurationItem();
        item2.setGroup(group);
        item2.setLabel("prod");
        item2.setKey("haha");
        item2.setContent("heihei");
        Map<String, String> tags2 = new HashMap<>();
        tags2.put("release", "1.0.0");
        tags2.put("feature", "haha");
        item2.setTags(tags1);
        SaveConfigurationRequest request = new SaveConfigurationRequest();
        request.setStoreName(storeName);
        request.setAppId(appId);
        request.setItems(Arrays.asList(item1, item2));

        client.saveConfiguration(request);

        logger.info("save key success");
    }

    public static void get(RuntimeClient client) throws Exception {

        GetConfigurationRequest request = new GetConfigurationRequest();
        request.setStoreName(storeName);
        request.setAppId(appId);
        request.setGroup(group);

        request.setLabel("prod");
        request.setKeys(new String[] { "key1", "haha", "heihei@$prod" });

        GetConfigurationResponse resp = client.getConfiguration(request);

        List<ConfigurationItem> items = resp.getItems();
        for (ConfigurationItem item : items) {
            logger.info("get configuration {} = {}", item.getKey(), item.getContent());
        }
    }

    public static void delete(RuntimeClient client) throws Exception {
        DeleteConfigurationRequest request = new DeleteConfigurationRequest();
        request.setStoreName(storeName);
        request.setAppId(appId);
        request.setGroup(group);
        request.setLabel("prod");
        request.setKeys(new String[] { "key", "haha" });

        client.deleteConfiguration(request);
        logger.info("delete keys success");

    }

    public static void subscribe(RuntimeClient client) throws Exception {

        SubscribeConfigurationRequest request = new SubscribeConfigurationRequest();
        request.setStoreName(storeName);
        request.setAppId(appId);
        request.setGroup(group);
        request.setLabel("prod");
        request.setKeys(new String[] { "haha", "heihei" });

        client.subscribeConfiguration(request, new SimpleConfigurationSubscriber());

        Thread t = new Thread(() -> {
            for (int i = 0;; i++) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    ConfigurationItem item = new ConfigurationItem();
                    item.setGroup(group);
                    item.setLabel("prod");
                    item.setKey("heihei");
                    item.setContent("heihei" + i);
                    SaveConfigurationRequest saveRequest = new SaveConfigurationRequest();
                    saveRequest.setStoreName(storeName);
                    saveRequest.setAppId(appId);
                    saveRequest.setItems(Collections.singletonList(item));
                    client.saveConfiguration(saveRequest);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
    }

    public static class SimpleConfigurationSubscriber implements ConfigurationSubscriber {
        @Override
        public void onChange(SubscribeConfigurationResponse response) {
            List<ConfigurationItem> items = response.getItems();
            for (ConfigurationItem item : items) {
                logger.info("receive subscribe {} = {}", item.getKey(), item.getContent());
            }
        }

        @Override
        public void onError(Throwable t) {
            logger.error("subscribe error ", t);
        }

        @Override
        public void onCompleted() {
            logger.info("subscribe channel has been closed");
        }
    }
}
