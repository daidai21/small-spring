package org.spring.small;

import lombok.Setter;
import org.junit.Assert;

public class OutputService {

    @Setter
    private HelloWorldService helloWorldService;

    public void output(String text) {
        Assert.assertNotNull(helloWorldService);
        System.out.println(text);
    }
}
