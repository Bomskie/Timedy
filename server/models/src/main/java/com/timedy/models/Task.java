package com.timedy.models;

import com.timedy.enums.Priority;
import com.timedy.enums.Status;
import lombok.Getter;

import java.time.Period;
import java.util.Date;

@Getter
public class Task {
    private String name;
    private Date startDate;
    private Date deadline;
    private Date endDate;
    private Period expecteDuration;
    private Period actualDuration;
    private Priority priority;
    private Status status;
}
