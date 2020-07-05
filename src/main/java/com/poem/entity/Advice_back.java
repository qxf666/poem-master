package com.poem.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Advice_back {
    private int id;
    private int user_id;
    private String text;
    private Timestamp date;
}
