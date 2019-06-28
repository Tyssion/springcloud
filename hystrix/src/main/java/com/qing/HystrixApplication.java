package com.qing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: zhching
 * @Date: 2019/6/28 9:16
 * @Version 1.0
 */
@SpringBootApplication
@EnableFeignClients //声明启用feign客户端
@EnableCircuitBreaker //声明启用数据监控
@EnableHystrixDashboard //声明启用可视化数据监控

public class HystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class,args);
    }
}
