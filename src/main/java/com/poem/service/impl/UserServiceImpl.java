package com.poem.service.impl;


import com.poem.entity.User;
import com.poem.repository.UserRepository;

import com.poem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findUser(User user) {
        User user2 = userRepository.findUser(user);
        return user2;
    }

    @Override
    public int addUser(User user) {
        return userRepository.addUser(user);
    }

}