package com.poem.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultPoem {
    public String name;
    public String context;
    public String author;
    public String dyname;
}
