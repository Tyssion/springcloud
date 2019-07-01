package com.qing.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhching
 * @Date: 2019/7/1 10:41
 * @Version 1.0
 */
@RestController
@RequestMapping("/zipkinclient")
public class ZipkinClientController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/getPort")
    public String getPort(){
        return "当前端口："+this.port;
    }
}
