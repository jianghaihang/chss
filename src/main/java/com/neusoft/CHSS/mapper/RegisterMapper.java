package com.neusoft.CHSS.mapper;

import com.neusoft.CHSS.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 添加用户接口映射
 */
public interface RegisterMapper {

    // 添加用户
    Integer addNewUser(User user);

    // 通过用户名获取用户数据
    User findUserByUsername(@Param("userName") String username);
}
