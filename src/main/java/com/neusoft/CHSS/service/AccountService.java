package com.neusoft.CHSS.service;

import com.neusoft.CHSS.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountService {

    /**
     * 通过用户名
     * @param username
     * @param account
     * @param roleId
     * @return
     */
    List<User> getUserByUnameAndAccAndRole(
            String username,
            String account,
            Integer roleId,
            String page,
            String rows
    );

    /**
     * 获取到通过用户名，用户账号，用户角色为条件筛查出的总数
     * @param username 用户名
     * @param account 用户账号
     * @param roleId 角色ID
     * @return
     */
    Integer getUserTotal(
            String username,
            String account,
            Integer roleId
    );

}


































