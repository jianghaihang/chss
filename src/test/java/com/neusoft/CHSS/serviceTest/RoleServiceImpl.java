package com.neusoft.CHSS.serviceTest;

import com.neusoft.CHSS.entity.Role;
import com.neusoft.CHSS.service.RoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 用户角色处理
 * @time 2019/11/30 1:28
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RoleServiceImpl {

    @Autowired
    private RoleService roleService;

    @Test
    public void roleHandle(){

        List<Role> roleAll = roleService.getRoleAll();

        for (Role role: roleAll) {

            System.out.println(role);
        }

    }
}




























