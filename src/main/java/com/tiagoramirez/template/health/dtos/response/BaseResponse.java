package com.tiagoramirez.template.health.dtos.response;

import java.time.LocalDateTime;

public class BaseResponse {
    private String message;
    private String dateTime;

    public BaseResponse(String message) {
        this.message = message;
        this.dateTime = LocalDateTime.now().toString();
    }

    public String getMessage() {
        return message;
    }

    public String getDateTime() {
        return dateTime;
    }

}
