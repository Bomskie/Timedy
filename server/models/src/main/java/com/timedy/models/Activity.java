package com.timedy.models;

import com.timedy.enums.Priority;
import lombok.Getter;

import java.sql.Date;

@Getter
public class Activity {
    private String name;
    private Date startDate;
    private Date endDate;
    private Priority priority;

}
