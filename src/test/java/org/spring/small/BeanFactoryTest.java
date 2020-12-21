package org.spring.small;

import org.junit.Test;
import org.spring.small.factory.AutowireCapableBeanFactory;
import org.spring.small.factory.BeanFactory;

public class BeanFactoryTest {
    @Test
    public void test() throws InstantiationException, IllegalAccessException, NoSuchFieldException {
        // 1.初始化beanfactory
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        // 2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("org.spring.small.HelloWorldService");

        // 3.设置属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("text", "Hello World!"));
        beanDefinition.setPropertyValues(propertyValues);

        // 4.生成bean
        beanFactory.registerBeanDefinition("HelloWorldService", beanDefinition);

        // 5.获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("HelloWorldService");
        helloWorldService.helloWorld();
    }
}
