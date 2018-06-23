package com.javaman.custom.handler;

import com.javaman.custom.pojo.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSimpleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @author pengzhe
 * @date 2018/6/23 23:45
 * @description
 */

public class UserBeanDefinationParser extends AbstractSimpleBeanDefinitionParser {

    /**
     * element对应的类
     *
     * @param element
     * @return
     */
    @Override
    protected Class<?> getBeanClass(Element element) {
        return User.class;
    }

    /**
     * 从element中解析并提取对应的元素
     *
     * @param element
     * @param parserContext
     * @param builder
     */
    @Override
    protected void doParse(Element element, ParserContext parserContext, BeanDefinitionBuilder builder) {
        String username = element.getAttribute("username");
        String email = element.getAttribute("email");
        //将提取的数据放入到BeanDefinitionBuilder中,待到完成所有bean的解析后统一注册到beanFactory中
        if (StringUtils.hasText(username)) {
            builder.addPropertyValue("username", username);
        }
        if (StringUtils.hasText(email)) {
            builder.addPropertyValue("email", email);

        }
    }
}
