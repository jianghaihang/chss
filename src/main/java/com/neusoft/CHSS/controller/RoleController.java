package com.neusoft.CHSS.controller;

import com.neusoft.CHSS.entity.Role;
import com.neusoft.CHSS.service.RoleService;
import com.neusoft.CHSS.utils.ReturnJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 用户角色处理控制器
 * @time 2019/11/30 1:36
 */

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("/role")
    public String roleHandle(){

        List<Role> roleAll = roleService.getRoleAll();

        String roles = new ReturnJson().getRoleAll(roleAll);

        return roles;
    }

}
