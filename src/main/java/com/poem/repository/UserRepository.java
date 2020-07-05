package com.poem.repository;

import com.poem.entity.User;

import javax.annotation.Resource;
import java.util.List;
public interface UserRepository {

    public List<User> findAll();
    public User findUser(User user);
    public int addUser(User user);
}
