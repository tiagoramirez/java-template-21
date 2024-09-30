package com.tiagoramirez.template.health.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.tiagoramirez.template.health.dtos.response.BaseResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping
    public ResponseEntity<BaseResponse> getHealthCheck() {
        BaseResponse response = new BaseResponse("I'm alive!");
        return ResponseEntity.ok(response);
    }

}
