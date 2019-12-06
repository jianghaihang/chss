package com.neusoft.CHSS.entity;

import java.io.Serializable;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 菜单
 * @time 2019/11/24 10:23
 */

public class Menu extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -4858398038473755248L;

    private Integer menuId;
    private String menuName;
    private String menuState;
    private Integer menuPid;
    private String iconCls;
    private String url;
    private Integer menuType;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuState() {
        return menuState;
    }

    public void setMenuState(String menuState) {
        this.menuState = menuState;
    }

    public Integer getMenuPid() {
        return menuPid;
    }

    public void setMenuPid(Integer menuPID) {
        this.menuPid = menuPID;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getMenuType() {
        return menuType;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", menuState='" + menuState + '\'' +
                ", menuPid=" + menuPid +
                ", iconCls='" + iconCls + '\'' +
                ", url='" + url + '\'' +
                ", menuType=" + menuType +
                '}';
    }
}







































