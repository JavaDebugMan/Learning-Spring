package com.javaman.bean;

import com.javaman.aop.TestBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author pengzhe
 * @date 2018/6/23 22:34
 * @description
 */

public class TestXmlBean {
    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("application.xml"));
        TestBean test = (TestBean) factory.getBean("test");
        System.out.println(test.getTestStr());

    }
}
