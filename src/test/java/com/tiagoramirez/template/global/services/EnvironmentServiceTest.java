package com.tiagoramirez.template.global.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class EnvironmentServiceTest {

    @Autowired
    private EnvironmentService environmentService;

    @Test
    void testGet() {
        System.setProperty("ULTRA_SECRET_KEY", "random");

        assertEquals("random", environmentService.get("ULTRA_SECRET_KEY"));
    }

    @Test
    void testGetSecretKey1() {
        System.setProperty("SECRET_KEY_1", "something");

        assertEquals("something", environmentService.getSecretKey1());
    }

}
