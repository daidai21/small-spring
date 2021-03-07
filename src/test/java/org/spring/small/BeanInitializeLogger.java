package org.spring.small;

import org.spring.small.beans.BeanPostProcessor;

public class BeanInitializeLogger implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws Exception {
        System.out.println("Initialization bean " + beanName + " start!");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws Exception {
        System.out.println("Initialization bean " + beanName + " end!");
        return bean;
    }
}
