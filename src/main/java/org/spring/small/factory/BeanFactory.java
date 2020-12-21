package org.spring.small.factory;

import org.spring.small.BeanDefinition;

public interface BeanFactory {
    public Object getBean(String name);

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws InstantiationException, IllegalAccessException, NoSuchFieldException;
}
