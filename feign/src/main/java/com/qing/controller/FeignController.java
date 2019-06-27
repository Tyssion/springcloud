package com.qing.controller;

import com.qing.entity.User;
import com.qing.feign.FeignProducerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zhching
 * @Date: 2019/6/27 14:09
 * @Version 1.0
 */
@RestController
@RequestMapping("/feign")
public class FeignController {
    @Autowired
    private FeignProducerClient feignProducerClient;

    @GetMapping("/getUser")
    public List<User> getAll(){
        return feignProducerClient.getUser();
    }

    @GetMapping("/getPort")
    public String getPort(){
        return feignProducerClient.getPort();
    }
}
