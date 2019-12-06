package com.neusoft.CHSS.service.impl;

import com.neusoft.CHSS.entity.User;
import com.neusoft.CHSS.mapper.AccountMapper;
import com.neusoft.CHSS.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 查询用户列表的实现类逻辑处理
 * @time 2019/11/27 15:05
 */

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<User> getUserByUnameAndAccAndRole(String username, String account, Integer roleId, String page, String rows) {

        Integer pageNo = 1;

        Integer pageSize = 10;

        if (page != null && page.toString() != ""){
            if (rows != null && rows.toString() != ""){

                pageSize = Integer.parseInt(rows);
                pageNo = (Integer.parseInt(page) - 1) * pageSize;
            }
        }

        if (username == ""){

            username = null;
        }

        if (account == ""){

            account = null;
        }

        System.err.println("impl username: " + username + ", account: " + account + ", roleId: " + roleId + ", pageNo: " + pageNo + ", pageSize: " + pageSize);

        List<User> users = accountMapper.findUserByUnameAndAccAndRole(username, account, roleId, pageNo, pageSize);

        return users;
    }


    /**
     * 获取到通过用户名，用户账号，用户角色为条件筛查出的总数
     * @param username 用户名
     * @param account 用户账号
     * @param roleId 角色ID
     * @return
     */
    @Override
    public Integer getUserTotal(String username, String account, Integer roleId){

        if (username == ""){

            username = null;
        }

        if (account == ""){

            account = null;
        }

        return accountMapper.findUserTotals(username, account, roleId);
    }

}

































