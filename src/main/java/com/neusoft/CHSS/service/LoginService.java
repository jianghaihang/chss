package com.neusoft.CHSS.service;

import com.neusoft.CHSS.entity.User;

import java.util.List;

/**
 * 用户登录业务层接口
 */
public interface LoginService {

    // 通过用户名获取用户数据
    User login(String account, String password);

}
