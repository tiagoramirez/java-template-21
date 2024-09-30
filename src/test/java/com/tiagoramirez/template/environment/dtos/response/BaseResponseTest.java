package com.tiagoramirez.template.environment.dtos.response;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BaseResponseTest {

    @Test
    void testBaseResponse() {
        BaseResponse baseResponse = new BaseResponse("test");

        assertEquals("test", baseResponse.getMessage());
    }
}
