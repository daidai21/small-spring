package org.spring.small;

public class BeanDefinition {
    private Object bean;

    /**
     * @param bean
     */
    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    /**
     * @return
     */
    public Object getBean() {
        return this.bean;
    }
}
