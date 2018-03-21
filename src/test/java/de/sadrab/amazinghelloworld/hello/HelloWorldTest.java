package de.sadrab.amazinghelloworld.hello;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class HelloWorldTest {
    @Autowired
    private HelloWorld helloWorld;
    @Test
    void sayHelloWorld() {
        String helloWorld = this.helloWorld.sayHelloWorld();
        assertThat(helloWorld, is(equalTo("hello world")));
    }
}