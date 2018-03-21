package de.sadrab.amazinghelloworld.hello;

import org.springframework.stereotype.Component;

@Component
public class Hello {
    private String hello = "hello";

    public String sayHello(){
        return hello;
    }
}
