package com.javaman.dynamic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author pengzhe
 * @date 2019-03-12 22:43
 * @description
 */

public class TestDynamic {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("custom.xml");
        UserDao testBean = (UserDao) applicationContext.getBean("userDao");
        System.out.println(testBean);
    }
}
