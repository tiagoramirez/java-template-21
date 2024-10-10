package com.tiagoramirez.template.global.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentService {

    @Autowired
    private Environment env;

    public String get(String key) {
        return env.getProperty(key);
    }

    public String getSecretKey1() {
        return env.getProperty("SECRET_KEY_1");
    }

}
