package io.mosn.layotto.preview.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("state")
public class StateConfiguration {
    private String storeName;

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
}
