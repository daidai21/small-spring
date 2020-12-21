package org.spring.small;

import org.junit.Test;

public class BeanFactoryTest {
    @Test
    public void test() {
        // 1.初始化beanfactory
        BeanFactory beanFactory = new BeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(new HelloWorldService());
        // 2.注入bean
        beanFactory.registerBeanDefinition("HelloWorldService", beanDefinition);
        // 3.获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("HelloWorldService");
        helloWorldService.sayHello();
    }

    class HelloWorldService {
        public String sayHello() {
            System.out.println("HelloWorld");
            return "HelloWorld";
        }
    }
}
