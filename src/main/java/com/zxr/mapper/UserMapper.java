package com.zxr.mapper;

import com.zxr.pojo.User;

import java.util.List;

/**
 * @author zhaoxiangrui
 * @date 2020/11/16 1:25
 */
public interface UserMapper {

    List<User> findAll();

    Integer deleteById(User user);

    Integer insert(User user);

    Integer updateById(User user);
}
