package org.spring.small;

import org.junit.Test;
import org.spring.small.factory.AutowireCapableBeanFactory;
import org.spring.small.factory.BeanFactory;
import org.spring.small.io.ResourceLoader;
import org.spring.small.xml.XmlBeanDefinitionReader;

import java.util.Map;

public class BeanFactoryTest {
    @Test
    public void test() throws Exception {
        // 1.读取配置
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("small-ioc.xml");

        // 2.初始化BeanFactory并注册bean
        BeanFactory beanFactory = new AutowireCapableBeanFactory();
        for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }

        // 3.获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("HelloWorldService");
        helloWorldService.helloWorld();
    }
}
