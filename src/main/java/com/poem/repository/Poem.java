package com.poem.repository;

import com.poem.pojo.PoemCollection;

import java.util.List;

public interface Poem {
    public List<PoemCollection> SelectAllPoem();
}
