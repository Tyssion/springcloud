package com.qing.feign;

import com.qing.entity.User;
import com.qing.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Author: zhching
 * @Date: 2019/6/27 14:04
 * @Version 1.0
 */
@FeignClient(value = "producer-server",fallback = FeignError.class)
public interface FeignProducerClient {
    @GetMapping("/user")
    List<User> getUser();

    @GetMapping("/getPort")
    String getPort();
}
