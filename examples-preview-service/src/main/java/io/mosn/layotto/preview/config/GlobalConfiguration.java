package io.mosn.layotto.preview.config;

import io.mosn.layotto.v1.RuntimeClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spec.sdk.runtime.v1.client.RuntimeClient;

@Configuration
@EnableConfigurationProperties({LayottoConfiguration.class, StateConfiguration.class, FileConfiguration.class})
public class GlobalConfiguration {
    @Autowired
    private LayottoConfiguration layottoConfiguration;

    @Bean
    public RuntimeClient runtimeClient() {
        RuntimeClient client = new RuntimeClientBuilder()
                .withPort(layottoConfiguration.getPort())
                .withIp(layottoConfiguration.getIp())
                .build();

        return client;
    }
}
