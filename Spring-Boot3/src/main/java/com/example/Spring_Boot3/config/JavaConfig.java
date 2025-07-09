package com.example.Spring_Boot3.config;


import com.example.Spring_Boot3.profile.DevProfile;
import com.example.Spring_Boot3.profile.ProductionProfile;
import com.example.Spring_Boot3.profile.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@ConditionalOnProperty
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