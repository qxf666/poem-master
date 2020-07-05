package com.poem.controller;
import com.alibaba.fastjson.JSONObject;
import com.poem.dto.base.ResultBean;
import com.poem.dto.base.ResultConst;
import com.poem.entity.User;
import com.poem.service.UserService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
    @RestController
    @RequestMapping("/user")
    public class UserController {
        @Autowired
        private UserService1 userService1;
        @PostMapping(value = "/register" )
    public ResponseEntity register(@RequestBody User user){
            System.out.println(user);
            userService1.addUser(user);
            return new ResponseEntity<>(ResultBean.ok(ResultConst.GET_MANAGERS_SUCC), HttpStatus.OK);
    }
        @PostMapping(value = "/login" )
        public ResponseEntity login(@RequestBody User user){
            System.out.println(user);
            String jwt =  userService1.login(user.getUsername(),user.getPassword());
            return new ResponseEntity<>(ResultBean.ok(ResultConst.LOGIN_SUCC, new JSONObject().fluentPut("token", jwt)),
                    HttpStatus.OK);
        }
}
