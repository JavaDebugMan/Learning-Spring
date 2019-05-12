package com.javaman.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {

    @Bean(initMethod = "init")
    public SpringBean springBean() {
        return new SpringBean();
    }

}
