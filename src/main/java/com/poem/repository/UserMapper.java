package com.poem.repository;

import com.poem.entity.User;

public interface UserMapper {
    int addUser(User user);
    User selectUserByName(String username);
}
