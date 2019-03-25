package com.timedy.models;

import lombok.Getter;

import java.sql.Date;

@Getter
public class Project {
    private String name;
    private Date startDate;
    private Date endDate;
}
