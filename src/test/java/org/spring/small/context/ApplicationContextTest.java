package org.spring.small.context;

import org.junit.Test;
import org.spring.small.HelloWorldService;

public class ApplicationContextTest {
    @Test
    public void test() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("small-ioc.xml");
        HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("HelloWorldService");
        helloWorldService.helloWorld();
    }
}