package io.mosn.layotto.preview.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("file")
public class FileConfiguration {
    private String fileName;
    private String storeName;

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
