package com.tele2.task.controller;

import com.tele2.task.dto.TimeDto;
import com.tele2.task.service.TimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TimeController {

    private final TimeService timeService;

    @GetMapping("/time")
    public TimeDto getCurrentTime() {
        return timeService.getCurrentTime();
    }
}
