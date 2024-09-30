package com.tiagoramirez.template.environment.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiagoramirez.template.environment.dtos.response.BaseResponse;
import com.tiagoramirez.template.environment.services.EnvironmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/environment")
public class EnvironmentController {

    @Autowired
    private EnvironmentService environmentService;

    @GetMapping("/secret-key-1")
    public ResponseEntity<BaseResponse> getSecretKey1() {
        String secretKey1 = environmentService.getSecretKey1();
        BaseResponse response = new BaseResponse(secretKey1);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/secret-key-2")
    public ResponseEntity<BaseResponse> getSecretKey2() {
        String secretKey2 = environmentService.getSecretKey2();
        BaseResponse response = new BaseResponse(secretKey2);
        return ResponseEntity.ok(response);
    }

}
