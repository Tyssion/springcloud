package com.qing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zhching
 * @Date: 2019/6/25 14:27
 * @Version 1.0
 */
@RestController
public class RestTemplateController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/rest")
    public String restTemplate(){
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://localhost:8700/user",String.class);
        return responseEntity.getBody();
    }
}
