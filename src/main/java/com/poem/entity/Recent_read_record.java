package com.poem.entity;

import lombok.Data;

import java.sql.Timestamp;
@Data
public class Recent_read_record {
    private int id;
    private int poem_id;
    private int user_id;
    private Timestamp read_time;

}
