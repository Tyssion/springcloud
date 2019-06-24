package com.qing.service;

import com.qing.entity.User;

import java.util.List;

/**
 * @Author: zhching
 * @Date: 2019/6/24 16:55
 * @Version 1.0
 */
public interface UserService {
    List<User> getUser();

    User getUserById(int id);
}
