package org.spring.small.io;

import org.junit.Assert;
import org.junit.Test;

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
