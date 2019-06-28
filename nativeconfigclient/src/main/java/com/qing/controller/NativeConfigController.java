package com.qing.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhching
 * @Date: 2019/6/28 14:56
 * @Version 1.0
 */
@RestController
@RequestMapping("/native")
public class NativeConfigController {
    @Value("${server.port}")
    private String port;

    @Value("${foo}")
    private String foo;

    @GetMapping("/getConfig")
    public String getConfig(){
        return this.port +"------" +this.foo;
    }
}
