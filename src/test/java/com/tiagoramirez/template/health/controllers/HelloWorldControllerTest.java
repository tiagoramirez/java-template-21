package com.tiagoramirez.template.health.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.tiagoramirez.template.health.dtos.response.BaseResponse;

public class HelloWorldControllerTest {
    
    @Test
    public void testHelloWorld() {
        HelloWorldController helloWorldController = new HelloWorldController();

        BaseResponse response = helloWorldController.getHelloWorld().getBody();

        assertEquals(response.getMessage(), "Hello World!");
        assertNotNull(response.getDateTime());
    }
}
