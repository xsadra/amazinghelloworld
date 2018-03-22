package de.sadrab.amazinghelloworld.hello;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class HelloWorldTest {
    @Autowired
    private HelloWorld helloWorld;
    @Test
    void sayHelloWorld() {
        String helloWorld = this.helloWorld.sayHelloWorld();
//        assertEquals("hello world", helloWorld);
        assertAll(
                ()-> assertEquals("hello world",helloWorld)
        );
    }
}