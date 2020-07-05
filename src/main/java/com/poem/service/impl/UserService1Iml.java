package com.poem.service.impl;

import com.poem.dto.base.ResultConst;
import com.poem.entity.User;
import com.poem.exception.BussinessException;
import com.poem.repository.UserMapper;
import com.poem.service.UserService1;
import com.poem.util.JwtUtil;
import com.poem.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService1Iml implements UserService1 {
    @Autowired
    UserMapper userMapper;
    public int addUser(User user) {
        User user1=new User();
        user1.setUsername(user.getUsername());
        user1.setPassword(MD5.MD5(user.getPassword()));
        System.out.println(user1);
       return userMapper.addUser(user1);
    }

    @Override
    public String login(String username ,String password) {
        try {
            User user= userMapper.selectUserByName(username);
            if(user == null){
                throw new BussinessException(403, ResultConst.USER_NAME_NotEXIST);
            }
            String realpassword=user.getPassword();
            String passwordByMd5=MD5.MD5(password);
            System.out.println("数据库查询的密码"+realpassword);
            System.out.println("用户输入的密码"+passwordByMd5);
            if(!MD5.chkpwd(realpassword,passwordByMd5)){
                throw new BussinessException(403, ResultConst.INVALID_PASSWORD);
            }
            //生成jwt令牌
            return JwtUtil.createJWT(UUID.randomUUID().toString(), username,null);
        } catch (Exception e) {
            throw new BussinessException(403, ResultConst.GET_MANAGER_SUCC);
        }
    }
}
