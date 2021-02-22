package org.spring.small.beans;

public interface BeanDefinitionReader {
    void loadBeanDefinitions(String location) throws Exception;
}
