package org.spring.small;

import lombok.Setter;

public class HelloWorldService {

    @Setter
    private String text;

    @Setter
    private OutputService outputService;

    public void helloWorld() {
        outputService.output(text);
    }
}
