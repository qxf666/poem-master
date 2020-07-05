package com.poem.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.poem.pojo.Dynasty;
import com.poem.repository.DynastyMapper;
import com.poem.service.DynastyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DynastyServiceImpl implements DynastyService {
    @Autowired
    private DynastyMapper dynastyMapper;
    public PageInfo<Dynasty> SelectDynastyByName(String dynastyName, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<>(dynastyMapper.SelectDynasty(dynastyName));
    }
}
