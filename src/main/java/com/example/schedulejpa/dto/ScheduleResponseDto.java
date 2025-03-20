package com.example.schedulejpa.dto;

import lombok.Getter;

@Getter
public class ScheduleResponseDto {

    private final Long id;
    private final String task;

    public ScheduleResponseDto(Long id, String task) {
        this.id = id;
        this.task = task;
    }
}
