package com.qing.feign.impl;

import com.qing.entity.User;
import com.qing.feign.FeignProducerClient;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: zhching
 * @Date: 2019/6/27 14:48
 * @Version 1.0
 */

/**
 * 处理熔断
 */
@Component
public class FeignError implements FeignProducerClient {
    @Override
    public List<User> getUser() {
        return null;
    }

    @Override
    public String getPort() {
        return "服务器出错，请稍后访问。。。。。";
    }
}
