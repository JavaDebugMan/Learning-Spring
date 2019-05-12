package com.javaman.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBeanConfiguration {

    @Bean
    public JavaBean javaBean() {
        return new JavaBean();
    }

}
