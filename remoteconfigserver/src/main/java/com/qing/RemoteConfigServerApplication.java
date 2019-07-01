package com.qing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: zhching
 * @Date: 2019/6/29 14:32
 * @Version 1.0
 */
@SpringBootApplication
@EnableConfigServer
public class RemoteConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RemoteConfigServerApplication.class,args);
    }
}
