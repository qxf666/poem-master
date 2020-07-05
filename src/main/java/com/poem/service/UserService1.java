package com.poem.service;

import com.poem.entity.User;

public interface UserService1 {
    int addUser(User user);
    String login(String username,String password);
}
