package org.spring.small.beans.io;

import org.junit.Assert;
import org.junit.Test;
import org.spring.small.beans.io.Resource;
import org.spring.small.beans.io.ResourceLoader;

import java.io.IOException;
import java.io.InputStream;

public class ResourceLoaderTest {
    @Test
    public void test() throws IOException {
        ResourceLoader resourceLoader = new ResourceLoader();
        Resource resource = resourceLoader.getResource("small-ioc.xml");
        InputStream inputStream = resource.getInputStream();
        Assert.assertNotNull(inputStream);
    }
}
