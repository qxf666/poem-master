package com.poem.service;

import com.poem.entity.User;


import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User findUser(User user);
    public int addUser(User user);
}
