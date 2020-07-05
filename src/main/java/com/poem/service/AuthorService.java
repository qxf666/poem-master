package com.poem.service;

import com.github.pagehelper.PageInfo;
import com.poem.entity.Author;

import java.util.List;

public interface AuthorService {
    public PageInfo<Author> SelectAuthorByName(String author, Integer pageNum, Integer pageSize);
    public List<Author> selectAllAuthor();
}
