package com.neusoft.CHSS.serviceTest;

import com.neusoft.CHSS.entity.User;
import com.neusoft.CHSS.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 获取用户列表测试类
 * @time 2019/11/27 15:08
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void account(){

        String userName = "array";
        String account = null;
        Integer roleId = null;
        String page = null;
        String rows = null;

        List<User> users = accountService.getUserByUnameAndAccAndRole(userName, account, roleId, page, rows);

        for (User user : users) {

            System.err.println(user);
        }

    }
}

































