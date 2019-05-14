package com.javaman.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author pengzhe
 * @date 2018/6/10 14:22
 * @description
 */
public class TestSpringBean {
    public static void main(String[] args) {
        //单例Bean已全部实例化
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.javaman.annotation");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.asList(beanDefinitionNames).forEach(System.out::println);
    }

}
