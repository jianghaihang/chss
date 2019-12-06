package com.neusoft.CHSS.mapper;

import com.neusoft.CHSS.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 查找用户列表持久层映射接口
 */
public interface AccountMapper {

    /**
     * 通过用户名
     * @param username
     * @param account
     * @param roleId
     * @return
     */
    List<User> findUserByUnameAndAccAndRole(
            @Param("userName") String username,
            @Param("account") String account,
            @Param("roleId") Integer roleId,
            @Param("page") Integer page,
            @Param("rows") Integer rows

    );

    Integer findUserTotals(
            @Param("userName") String username,
            @Param("account") String account,
            @Param("roleId") Integer roleId
    );
}



































