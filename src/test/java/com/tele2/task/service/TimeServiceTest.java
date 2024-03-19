package com.tele2.task.service;

import com.tele2.task.dto.TimeDto;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeServiceTest {

    private final TimeService timeService = new TimeService();

    @Test
    void testTimeServiceReturnCorrectTime() {
        TimeDto expectedTime = TimeDto.builder()
                .timezone(ZoneId.systemDefault())
                .localTime(LocalTime.now().truncatedTo(ChronoUnit.SECONDS))
                .build();
        TimeDto actualTime = timeService.getCurrentTime();

        assertEquals(expectedTime, actualTime);
    }
}
