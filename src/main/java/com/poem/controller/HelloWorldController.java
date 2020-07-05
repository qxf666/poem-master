package com.poem.controller;

import com.poem.entity.User2;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Scope("prototype")
@RequestMapping(value="/test")
public class HelloWorldController {
    @RequestMapping(value="/users/{userName}", method= RequestMethod.GET)
    public @ResponseBody
    User2 findUser(@PathVariable("userName") String userName) {
        User2 user = new User2();
        user.setUserName(userName);
        user.setSex("男");
        return user;
    }

    @RequestMapping(value="/users/add", method=RequestMethod.POST)
    public @ResponseBody Long createUser(@RequestBody User2 user) {
        user.setId(System.currentTimeMillis());
        return user.getId();
    }
}