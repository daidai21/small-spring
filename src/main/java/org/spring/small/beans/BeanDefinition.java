package org.spring.small.beans;

import lombok.Getter;
import lombok.Setter;

public class BeanDefinition {

    @Setter
    @Getter
    private Object bean;

    @Getter
    @Setter
    private Class beanClass;

    @Getter
    private String beanClassName;

    @Setter
    @Getter
    private PropertyValues propertyValues;

    public BeanDefinition() {
        this.propertyValues = new PropertyValues();
    }


    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName;
        try {
            this.beanClass = Class.forName(beanClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
