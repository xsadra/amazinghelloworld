package de.sadrab.amazinghelloworld.hello;

import org.springframework.stereotype.Component;

@Component
public class World {
    private String world = "world";

    public String sayWorld(){
        return world;
    }
}
