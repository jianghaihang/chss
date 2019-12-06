package com.neusoft.CHSS.service.impl;

import com.neusoft.CHSS.entity.Role;
import com.neusoft.CHSS.mapper.RoleMapper;
import com.neusoft.CHSS.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 用户角色处理逻辑处理实现类
 * @time 2019/11/30 1:26
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> getRoleAll() {

        return roleMapper.findRoleAll();
    }
}
