package com.qing.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhching
 * @Date: 2019/6/29 14:43
 * @Version 1.0
 */
@RestController
@RequestMapping("/remoteConfig")
public class RemoteConfigClientController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/getPort")
    public String getPort(){
        return "当前端口号：" + this.port;

    }
}
