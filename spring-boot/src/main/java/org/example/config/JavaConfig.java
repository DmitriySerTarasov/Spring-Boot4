package org.example.config;

import org.example.profile.DevProfile;
import org.example.profile.ProductionProfile;
import org.example.profile.SystemProfile;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public SystemProfile DevProfile() {
        return new DevProfile();
    }

    @Bean
    public SystemProfile ProdProfile() {
        return new ProductionProfile();
    }
}
