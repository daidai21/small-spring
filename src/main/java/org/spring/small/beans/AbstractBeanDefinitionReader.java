package org.spring.small.beans;

import lombok.Getter;
import org.spring.small.beans.io.Resource;
import org.spring.small.beans.io.ResourceLoader;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    @Getter
    private Map<String, BeanDefinition> registry;

    @Getter
    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(ResourceLoader resourceLoader) {
        this.registry = new HashMap<>();
        this.resourceLoader = resourceLoader;
    }
}
