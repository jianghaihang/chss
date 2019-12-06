package com.neusoft.CHSS.entity;

import java.io.Serializable;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 用户角色
 * @time 2019/11/24 10:21
 */

public class Role implements Serializable {

    private static final long serialVersionUID = 6894544858322123212L;

    private Integer roleId;
    private String roleName;
    private Integer menuId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", menuId=" + menuId +
                '}';
    }
}



































