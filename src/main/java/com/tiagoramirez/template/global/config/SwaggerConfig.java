package com.tiagoramirez.template.global.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tiagoramirez.template.global.services.EnvironmentService;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Autowired
    private EnvironmentService environmentService;

    @Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title(environmentService.get("swagger.title"))
                        .description(environmentService.get("swagger.description")));
    }
}
