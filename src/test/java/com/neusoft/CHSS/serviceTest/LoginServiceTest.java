package com.neusoft.CHSS.serviceTest;

import com.neusoft.CHSS.entity.User;
import com.neusoft.CHSS.service.LoginService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 登录测试
 * @time 2019/11/25 9:26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class LoginServiceTest {

    @Autowired
    private LoginService loginService;

    @Test
    public void login(){

        String account = "lvbu";
        String password = "123456";

        User user = loginService.login(account, password);

        System.out.println("恭喜你: " + user.getUserName() + " ！ 登录成功！");

    }
}


































