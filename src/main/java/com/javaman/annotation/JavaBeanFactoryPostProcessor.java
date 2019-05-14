/*
package com.javaman.annotation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class JavaBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    */
/**
     * Modify the application context's internal bean factory after its standard
     * initialization. All bean definitions will have been loaded, but no beans
     * will have been instantiated yet. This allows for overriding or adding
     * properties even to eager-initializing beans.
     *
     * @param beanFactory the bean factory used by the application context
     * @throws BeansException in case of errors
     *//*

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition javaBean = beanFactory.getBeanDefinition("javaBean");
        System.out.println("调用JavaBeanFactoryPostProcessor.postProcessBeanFactory");
        javaBean.getPropertyValues().addPropertyValue("name", "javaBean config by postProcessBeanFactory ");

    }
}
*/
