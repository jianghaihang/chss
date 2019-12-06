package com.neusoft.CHSS.controller;

import com.neusoft.CHSS.entity.BaseEntity;
import com.neusoft.CHSS.entity.User;
import com.neusoft.CHSS.service.LoginService;
import com.neusoft.CHSS.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 用户登录控制层
 * @time 2019/11/25 10:22
 */

@RestController
@RequestMapping("users")
public class LoginController extends BaseController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public ResponseResult<User> login(
            @RequestParam("account") String account,
            @RequestParam("password") String password,
            HttpSession session
    ){

        User user = loginService.login(account, password);

        session.setAttribute("userId", user.getUserId());
        session.setAttribute("username", user.getUserName());
        session.setAttribute("perType", user.getPerType());

        return new ResponseResult<>(SUCCESS,user);
    }
}





































