package org.spring.small;

import lombok.Setter;

public class HelloWorldServiceImpl implements HelloWorldService {

    @Setter
    private String text;

    @Setter
    private OutputService outputService;

    @Override
    public void helloWorld() {
        outputService.output(text);
    }
}
