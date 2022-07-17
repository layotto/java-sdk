package io.mosn.layotto.preview.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("layotto")
public class LayottoConfiguration {
    private Integer port;
    private String ip;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer post) {
        this.port = post;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
