package com.javaman.applicationcontext;

import com.javaman.aop.TestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author pengzhe
 * @date 2018/6/24 11:30
 * @description
 */

public class ApplicationTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("application.xml");
        TestBean test = (TestBean) applicationContext.getBean("test");
        System.out.println(test);
    }
}
