package com.qing.feign;

import com.qing.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Author: zhching
 * @Date: 2019/6/27 14:04
 * @Version 1.0
 */
@FeignClient(value = "producer-server")
public interface FeignProducerClient {
    @GetMapping("/user")
    List<User> getUser();

    @GetMapping("/getPort")
    String getPort();
}
