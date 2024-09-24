package com.tiagoramirez.template.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloWorldControllerTest {
    
    @Test
    public void testHelloWorld() {
        HelloWorldController helloWorldController = new HelloWorldController();
        assertEquals(helloWorldController.getHelloWorld().getBody(), "Hello World!");
    }
}
