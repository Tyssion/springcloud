package com.qing.dao;

import com.qing.entity.User;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * @Author: zhching
 * @Date: 2019/6/24 16:53
 * @Version 1.0
 */
@MapperScan
public interface UserDao {
    @Select("select id,name,age from t_user")
    List<User> getUser();

    @Select("select id,name,age from t_user where id = #{id}")
    User getUserById(int id);
}
