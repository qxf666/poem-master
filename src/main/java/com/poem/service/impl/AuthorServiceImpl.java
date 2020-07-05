package com.poem.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.poem.entity.Author;
import com.poem.repository.PoemAuthorsMapper;
import com.poem.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private PoemAuthorsMapper poemAuthorsMapper;
    public PageInfo<Author> SelectAuthorByName(String author, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<>(poemAuthorsMapper.SelectAuthor(author));
    }

    @Override
    public List<Author> selectAllAuthor() {
        return poemAuthorsMapper.selectAllAuthor();
    }
}
