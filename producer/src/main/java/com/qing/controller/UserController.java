package com.qing.controller;

import com.qing.entity.User;
import com.qing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zhching
 * @Date: 2019/6/24 17:00
 * @Version 1.0
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/getPort")
    public String getPort(){
        return "当前端口号：" + this.port;
    }

    @GetMapping("/user")
    public List<User> getUser(){
       return userService.getUser();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") int id){
        return userService.getUserById(id);
    }


}
