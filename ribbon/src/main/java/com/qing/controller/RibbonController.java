package com.qing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zhching
 * @Date: 2019/6/27 9:26
 * @Version 1.0
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getAll")
    public String getAll(){
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://producer-server/user",String.class);
        return responseEntity.getBody();
    }

    @GetMapping("/getPort")
    public String getPort(){
        return restTemplate.getForEntity("http://producer-server/getPort",String.class).getBody();
    }

}
