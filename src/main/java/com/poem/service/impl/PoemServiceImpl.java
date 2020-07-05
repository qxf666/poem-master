package com.poem.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.poem.pojo.PoemCollection;
import com.poem.pojo.ResultPoem;
import com.poem.repository.Poem;
import com.poem.repository.PoemMapper;
import com.poem.service.PoemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PoemServiceImpl implements PoemService {
    @Autowired
    private PoemMapper poemMapper;
    @Autowired
    private Poem poem ;
    public PageInfo<ResultPoem> selectByPoemName(String poemName, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<>(poemMapper.selectByPoemName(poemName));
    }

    @Override
    public PageInfo<PoemCollection> SelectPoem(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<>(poem.SelectAllPoem());
    }
}
