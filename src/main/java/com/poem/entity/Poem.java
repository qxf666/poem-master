package com.poem.entity;

import lombok.Data;

@Data
public class Poem {
    private int id;
    private int poemsort_id;
    private String poem_name;
    private String writer;
    private String poem_context;
    private String dynasty;
}
