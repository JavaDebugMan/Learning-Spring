package com.javaman.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author pengzhe
 * @date 2018/6/10 14:19
 * @description
 */
@Configuration
public class JavaAnnotationBean {

    @Bean
    public SpringBean springBean() {
        return new SpringBean();
    }

}
