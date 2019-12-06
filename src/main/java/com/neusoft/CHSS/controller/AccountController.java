package com.neusoft.CHSS.controller;

import com.neusoft.CHSS.entity.User;
import com.neusoft.CHSS.mapper.AccountMapper;
import com.neusoft.CHSS.service.AccountService;
import com.neusoft.CHSS.utils.ReturnJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 用户账号管理控制器
 * @time 2019/11/27 13:57
 */

@RestController
@RequestMapping("accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("user_account")
    public String accountHandle(
            @RequestParam("username") String username,
            @RequestParam("role") Integer roleId,
            @RequestParam("account") String account,
            HttpServletRequest request


    ){

        String page = request.getParameter("page");
        String rows = request.getParameter("rows");

        System.err.println("controller username: " + username + ", roleId: " + roleId + ", account: " + account);

        List<User> users = accountService.getUserByUnameAndAccAndRole(username, account, roleId, page, rows);

        Integer userTotal = accountService.getUserTotal(username, account, roleId);

        String userList = new ReturnJson().getUserList(users, userTotal);

        return userList;
    }
}
