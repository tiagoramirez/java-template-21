package com.tiagoramirez.template.health.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.tiagoramirez.template.health.dtos.response.BaseResponse;

public class HealthControllerTest {
    
    @Test
    public void testHealthCheck() {
        HealthController helloWorldController = new HealthController();

        BaseResponse response = helloWorldController.getHealthCheck().getBody();

        assertEquals(response.getMessage(), "I'm alive!");
        assertNotNull(response.getDateTime());
    }
}
