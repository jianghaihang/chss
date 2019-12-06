package com.neusoft.CHSS.service;

import com.neusoft.CHSS.entity.User;

/**
 * 用户注册服务层接口
 */
public interface RegisterService {

    // 添加用户
    Integer addUser(User user, String username);

    // 通过用户名获取用户数据
    User getUserByUsername(String username);

}























