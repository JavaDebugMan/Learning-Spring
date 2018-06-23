package com.javaman.custom.handler;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author pengzhe
 * @date 2018/6/23 23:52
 * @description
 */

public class MyNamespaceHandler extends NamespaceHandlerSupport {
    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinationParser());
    }
}
