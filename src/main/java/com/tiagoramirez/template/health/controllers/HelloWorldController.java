package com.tiagoramirez.template.health.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.tiagoramirez.template.health.dtos.response.BaseResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController()
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping
    public ResponseEntity<BaseResponse> getHelloWorld() {
        BaseResponse response = new BaseResponse("Hello World!");
        return ResponseEntity.ok(response);
    }

}
