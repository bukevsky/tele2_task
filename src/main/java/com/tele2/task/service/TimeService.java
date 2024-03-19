package com.tele2.task.service;

import com.tele2.task.dto.TimeDto;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

@Service
public class TimeService {
    public TimeDto getCurrentTime(){
        return TimeDto.builder()
                .timezone(ZoneId.systemDefault())
                .localTime(LocalTime.now().truncatedTo(ChronoUnit.SECONDS))
                .build();
    }
}
