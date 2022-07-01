package io.mosn.layotto.preview.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("layotto")
public class LayottoConfiguration {
    private Integer post;
    private String ip;

    public Integer getPost() {
        return post;
    }

    public void setPost(Integer post) {
        this.post = post;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
