package com.poem.repository;

import com.poem.entity.User;
import com.poem.pojo.User_Advice_back;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Advice_back {
    public int Add_Advice_backByUid(Advice_back advice_back);
    public int Delete_Advice_backByUid(int uid);
    public List<User_Advice_back> Select_Advice_backByUid(User user);
    public List<User_Advice_back> SelectAll_Advice_backByUid(User user);
}
