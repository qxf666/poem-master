package com.poem.entity;

import lombok.Data;

import java.sql.Timestamp;
@Data
public class Study_time {
    private int id;
    private int user_id;
    private Timestamp lenarning_time;
    private Timestamp date;
}
