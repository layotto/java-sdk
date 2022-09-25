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

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * to save spring properties
 */
@ConfigurationProperties(prefix = "layotto")
public class LayottoProperties {

    public static final int DEFAULT_SUBSCRIBER_PORT = 9999;

    public static final int DEFAULT_PORT = 34904;

    public static final String DEFAULT_IP = "127.0.0.1";


    public Integer          subscriberPort;

    public Integer          Port;

    public String         Ip;

    public String getIp() { return Ip == null ? DEFAULT_IP : this.Ip;}

    public void setIp(String ip) { Ip = ip; }


    public Integer getPort() { return Port == null ? DEFAULT_PORT : this.Port; }

    public void setPort(Integer port) { this.Port = port; }


    public void setSubscriberPort(Integer subscriberPort) {
        this.subscriberPort = subscriberPort;
    }

    public int getSubscriberPort() {
        return subscriberPort == null ? DEFAULT_SUBSCRIBER_PORT : this.subscriberPort;
    }
}
