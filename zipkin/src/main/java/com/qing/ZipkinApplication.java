package com.qing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * @Author: zhching
 * @Date: 2019/7/1 10:30
 * @Version 1.0
 */
@SpringBootApplication
@EnableZipkinServer //开启服务跟踪

public class ZipkinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class,args);
    }
}
