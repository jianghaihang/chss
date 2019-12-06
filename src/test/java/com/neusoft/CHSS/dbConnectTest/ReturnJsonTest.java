package com.neusoft.CHSS.dbConnectTest;

import com.neusoft.CHSS.entity.User;
import com.neusoft.CHSS.mapper.AccountMapper;
import com.neusoft.CHSS.utils.ReturnJson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 返回json字符串测试
 * @time 2019/11/27 18:15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ReturnJsonTest {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void reJson(){

        String userName = null;
        String account = null;
        Integer roleId = null;
        Integer pageNo = 0;
        Integer pageSize = 2;

        List<User> users = accountMapper.findUserByUnameAndAccAndRole(userName, account, roleId, pageNo, pageSize);

        Integer userTotals = accountMapper.findUserTotals(userName, account, roleId);

        String userList = new ReturnJson().getUserList(users, userTotals);

        System.err.println("userList: " + userList);

    }



}




























