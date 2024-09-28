package com.tiagoramirez.template.global.config;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;

@SpringBootTest
public class JacksonConfigTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testObjectMapper() {
        assertEquals(objectMapper.getPropertyNamingStrategy(), PropertyNamingStrategies.SNAKE_CASE);
    }
}