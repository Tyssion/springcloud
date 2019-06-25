package com.qing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zhching
 * @Date: 2019/6/24 15:34
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class,args);
    }


    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
