package com.tiagoramirez.template.environment.services;

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
    void testGetSecretKey1() {
        System.setProperty("SECRET_KEY_1", "something");

        assertEquals("something", environmentService.getSecretKey1());
    }

    @Test
    void testGetSecretKey2() {
        System.setProperty("SECRET_KEY_2", "another thing");

        assertEquals("another thing", environmentService.getSecretKey2());
    }

}
