package org.spring.small;

import org.junit.Test;
import org.spring.small.factory.AutowireCapableBeanFactory;
import org.spring.small.factory.BeanFactory;

public class BeanFactoryTest {
    @Test
    public void test() {
        // 1.初始化beanfactory
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        // 2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("org.spring.small.HelloWorldService");
        beanFactory.registerBeanDefinition("HelloWorldService", beanDefinition);

        // 3.获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("HelloWorldService");
        helloWorldService.sayHello();
    }
}
