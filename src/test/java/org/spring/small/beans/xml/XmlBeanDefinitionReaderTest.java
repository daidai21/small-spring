package org.spring.small.beans.xml;

import org.junit.Assert;
import org.junit.Test;
import org.spring.small.beans.BeanDefinition;
import org.spring.small.beans.io.ResourceLoader;
import org.spring.small.beans.xml.XmlBeanDefinitionReader;

import java.util.Map;

public class XmlBeanDefinitionReaderTest {
    @Test
    public void test() throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("small-ioc.xml");
        Map<String, BeanDefinition> registry = xmlBeanDefinitionReader.getRegistry();
        Assert.assertTrue(registry.size() > 0);
    }
}
