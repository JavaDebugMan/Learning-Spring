package com.javaman.custom;

import com.javaman.custom.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author pengzhe
 * @date 2018/6/24 00:01
 * @description spring提供了可扩展schema的支持, 扩展Srping自定义标签配置需要如下几个步骤(需要添加srping-core包)
 * 1:创建一个需要扩展的组件
 * 2:定义一个XSD文件描述组件内容
 * 3:创建一个文件,实现BeanDefinitionParser接口,用来解析XSD文件中的定义和组件定义
 * 4:创建一个Handler文件,扩展自NamespaceHandlerSupport,目的是将组件注册到Spring容器
 * 5:编写Spring.handlers和Spring.schemas文件
 */

public class TestCustom {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("application-user.xml");
        User testBean = (User) applicationContext.getBean("testBean");
        System.out.println(testBean);
    }
}
