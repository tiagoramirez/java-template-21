package com.tiagoramirez.template.global.config;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.tiagoramirez.template.global.services.EnvironmentService;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@SpringBootTest
class SwaggerConfigTest {

    @Mock
    private EnvironmentService environmentService;

    @InjectMocks
    private SwaggerConfig swaggerConfig;

    @Test
    void testCustomOpenAPI() {
        String expectedTitle = "Test API";
        String expectedDescription = "Test Description";
        when(environmentService.get("swagger.title")).thenReturn(expectedTitle);
        when(environmentService.get("swagger.description")).thenReturn(expectedDescription);

        OpenAPI result = swaggerConfig.customOpenAPI();

        Info info = result.getInfo();
        assertNotNull(info);
        assertEquals(expectedTitle, info.getTitle());
        assertEquals(expectedDescription, info.getDescription());
    }

}
