package com.poem.repository;

import com.poem.pojo.Dynasty;

import java.util.List;

public interface DynastyMapper {
    public List<Dynasty> SelectDynasty(String DynastyName);
}
