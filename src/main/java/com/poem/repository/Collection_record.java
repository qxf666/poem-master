package com.poem.repository;

import com.poem.entity.Poem;
import com.poem.entity.User;
import com.poem.pojo.UserCollection_record;

import java.util.List;

//用户收藏古诗词记录
public interface Collection_record {
    public int AddCollection(UserCollection_record userCollection_record);
    public int DelCollection(UserCollection_record userCollection_record);
    public List<Poem> SelectCollection(User user);
}
