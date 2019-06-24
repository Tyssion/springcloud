package com.qing.service.impl;

import com.qing.dao.UserDao;
import com.qing.entity.User;
import com.qing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhching
 * @Date: 2019/6/24 16:56
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getUser() {
        return userDao.getUser();
    }

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
}
