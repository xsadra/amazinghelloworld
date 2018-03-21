package de.sadrab.amazinghelloworld.starter;

import de.sadrab.amazinghelloworld.hello.HelloWorld;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StarterConfig {
    @Bean
    public ApplicationRunner startHelloWorld(HelloWorld helloWorld){
        return args -> {
            String text = helloWorld.sayHelloWorld();
            System.out.println(text);
        };
    }
}
