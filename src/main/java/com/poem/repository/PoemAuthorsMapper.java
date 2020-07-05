package com.poem.repository;

import com.poem.entity.Author;

import java.util.List;

public interface PoemAuthorsMapper {
    List<Author> SelectAuthor(String author);
    List<Author> selectAllAuthor();
}
