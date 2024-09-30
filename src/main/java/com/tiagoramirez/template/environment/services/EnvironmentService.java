package com.tiagoramirez.template.environment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentService {

    @Autowired
    private Environment env;

    public String getSecretKey1() {
        return env.getProperty("SECRET_KEY_1");
    }

    public String getSecretKey2() {
        return env.getProperty("SECRET_KEY_2");
    }
}
