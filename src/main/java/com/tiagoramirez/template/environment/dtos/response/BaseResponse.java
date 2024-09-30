package com.tiagoramirez.template.environment.dtos.response;

public class BaseResponse {
    private String message;

    public BaseResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
