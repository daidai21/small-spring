package org.spring.small;

public interface BeanDefinitionReader {
    void loadBeanDefinitions(String location) throws Exception;
}
