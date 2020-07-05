package com.poem.service;

import com.github.pagehelper.PageInfo;
import com.poem.pojo.Dynasty;

public interface DynastyService {
    public PageInfo<Dynasty> SelectDynastyByName(String author, Integer pageNum, Integer pageSize);
}
