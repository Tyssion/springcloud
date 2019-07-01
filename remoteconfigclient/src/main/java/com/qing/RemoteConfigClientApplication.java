package com.qing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: zhching
 * @Date: 2019/6/29 14:41
 * @Version 1.0
 */
@SpringBootApplication
public class RemoteConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(RemoteConfigClientApplication.class,args);
    }
}
