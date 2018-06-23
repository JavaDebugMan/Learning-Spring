package com.javaman.annotation;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pengzhe
 * @date 2018/6/10 14:22
 * @description
 */

public class TestSpringBean {

    public static void main(String[] args) {
        BeanFactory beanFactory = new AnnotationConfigApplicationContext(JavaAnnotationBean.class);
        SpringBean springBean = (SpringBean) beanFactory.getBean("springBean");
        System.out.println(springBean.getName());
    }
}
