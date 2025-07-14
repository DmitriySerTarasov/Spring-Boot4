package com.example.Spring_Boot3.config;

import com.example.Spring_Boot3.profile.DevProfile;
import com.example.Spring_Boot3.profile.ProductionProfile;
import com.example.Spring_Boot3.profile.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "true", matchIfMissing = false)
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(value = "netology.profile.prod", havingValue = "true", matchIfMissing = false)
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
