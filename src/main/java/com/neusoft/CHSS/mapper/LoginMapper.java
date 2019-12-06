package com.neusoft.CHSS.mapper;

import com.neusoft.CHSS.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户持久层映射接口
 */
public interface LoginMapper {

    // 查找所有用户
    List<User> findAllUser();

    /**
     * 根据用户名查找用户
     * @param account 用户账号
     * @return 用户信息
     */
    User findUserByAccount(@Param("account") String account);
}
