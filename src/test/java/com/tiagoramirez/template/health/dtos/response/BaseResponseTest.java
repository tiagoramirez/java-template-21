package com.tiagoramirez.template.health.dtos.response;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

public class BaseResponseTest {
    
    @Test
    void testBaseResponse() {
        LocalDateTime dateTimeNow = LocalDateTime.now();
        BaseResponse baseResponse = new BaseResponse("Hello World!");
        LocalDateTime dateTimeResponse = LocalDateTime.parse(baseResponse.getDateTime());

        assertEquals(baseResponse.getMessage(), "Hello World!");
        assertNotNull(baseResponse.getDateTime());
        assertEquals(dateTimeNow.getYear(), dateTimeResponse.getYear());
        assertEquals(dateTimeNow.getMonth(), dateTimeResponse.getMonth());
        assertEquals(dateTimeNow.getDayOfMonth(), dateTimeResponse.getDayOfMonth());
        assertEquals(dateTimeNow.getHour(), dateTimeResponse.getHour());
        assertEquals(dateTimeNow.getMinute(), dateTimeResponse.getMinute());
        assertEquals(dateTimeNow.getSecond(), dateTimeResponse.getSecond());
    }
}
