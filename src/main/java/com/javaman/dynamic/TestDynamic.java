package com.javaman.dynamic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author pengzhe
 * @date 2019-03-12 22:43
 * @description 在开发产品级组件时, 为了更好的封装组件, 增强组件的易用性, 一般都将组件进行标签化定义(如Dubbo)
 * Spring中,自定义组件标签非常方便,只需经过以下几个步骤
 * 1):采用XSD描述自定义标签的元素属性
 * 2):编写Bean定义的解析器
 * 3):注册自定义标签解析器
 * 4):绑定命名空间解析器
 */

public class TestDynamic {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("custom.xml");
        UserDao testBean = (UserDao) applicationContext.getBean("userDao");
        System.out.println(testBean);
    }
}
