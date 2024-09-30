package com.tiagoramirez.template.environment.integration;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.tiagoramirez.template.environment.controllers.EnvironmentController;
import com.tiagoramirez.template.environment.services.EnvironmentService;

@WebMvcTest(EnvironmentController.class)
public class EnvironmentTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EnvironmentService environmentService;

    @Test
    public void testGetSecretKey1() throws Exception {
        String expectedSecretKey = "testSecretKey1";
        when(environmentService.getSecretKey1()).thenReturn(expectedSecretKey);

        mockMvc.perform(get("/environment/secret-key-1") // Make sure this matches your actual endpoint
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value(expectedSecretKey))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    public void testGetSecretKey2() throws Exception {
        String expectedSecretKey = "testSecretKey2";
        when(environmentService.getSecretKey2()).thenReturn(expectedSecretKey);

        mockMvc.perform(get("/environment/secret-key-2") // Make sure this matches your actual endpoint
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value(expectedSecretKey))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }
}