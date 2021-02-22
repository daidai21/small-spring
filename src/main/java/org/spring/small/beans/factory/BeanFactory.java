package org.spring.small.beans.factory;

import org.spring.small.beans.BeanDefinition;

public interface BeanFactory {
    public Object getBean(String name) throws Exception;
}
