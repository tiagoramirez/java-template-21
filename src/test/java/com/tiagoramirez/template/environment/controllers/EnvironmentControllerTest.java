package com.tiagoramirez.template.environment.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.tiagoramirez.template.environment.services.EnvironmentService;

@SpringBootTest
public class EnvironmentControllerTest {

    @Mock
    private EnvironmentService environmentService;

    @InjectMocks
    private EnvironmentController environmentController;

    @Test
    void testGetCurrentProfile() {
        String profile = "production";

        when(environmentService.getProfile()).thenReturn(profile);

        assertEquals(profile, environmentController.getCurrentProfile().getBody().getMessage());
    }

    @Test
    void testGetSecretKey1() {
        String secretKey1 = "secret";

        when(environmentService.getSecretKey1()).thenReturn(secretKey1);

        assertEquals(secretKey1, environmentController.getSecretKey1().getBody().getMessage());
    }

    @Test
    void testGetSecretKey2() {
        String secretKey2 = "secret";

        when(environmentService.getSecretKey2()).thenReturn(secretKey2);

        assertEquals(secretKey2, environmentController.getSecretKey2().getBody().getMessage());
    }
}
