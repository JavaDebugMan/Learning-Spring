package com.javaman.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pengzhe
 * @date 2018/6/10 14:22
 * @description
 */

public class TestSpringBean {

    public static void main(String[] args) {
        //单例Bean已全部实例化
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.javaman.annotation");
      //  SpringBean springBean = (SpringBean) applicationContext.getBean("springBean");
       // ComponentClass componentClass = (ComponentClass) applicationContext.getBean("componentClass");
        System.out.println("123");
        JavaBean javaBean = (JavaBean) applicationContext.getBean("javaBean");

        System.out.println(javaBean.getName());
/*
        System.out.println(componentClass.getName());
        System.out.println(springBean.getName());
    */
    }
}
