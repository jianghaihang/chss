package com.neusoft.CHSS.utils;

import com.neusoft.CHSS.entity.Area;
import com.neusoft.CHSS.entity.Menu;
import com.neusoft.CHSS.entity.Role;
import com.neusoft.CHSS.entity.User;

import java.util.List;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 返回json格式的字符串
 * @time 2019/11/26 1:17
 */

public class ReturnJson {


    /**
     * 返回菜单列表数据
     * @param menus 数据库中查询到的菜单列表
     * @return
     */
    public String getMenuByMenuType(List<Menu> menus){

        String data = "";

        for (Menu menu : menus){

            String ids = "\"id\":";
            String texts = "\"text\":";
            String states = "\"state\":";
            String iconClss = "\"iconCls\":";
            String urls = "\"url\":";
            String pids = "\"pid\":";

            String id = "\""+ menu.getMenuId() + "\",";
            String text = "\"" + menu.getMenuName() + "\",";
            String state = "\"" + menu.getMenuState() + "\",";
            String iconCls = "\"" + menu.getIconCls() + "\",";
            String url = "\"" + menu.getUrl() + "\",";
            String pid = "\"" + menu.getMenuPid() + "\"";

            String json = "{" + ids + id + texts + text + states + state + iconClss + iconCls + urls + url + pids + pid + "},";

            data = data + json;

//            System.out.println("Servlet list data = " + data);
        }

//        System.err.println("Servlet getMenuList data = " + data);

        data = data.substring(0,data.length()-1);

        data = "[" + data + "]";

        return data;
    }

    /**
     * 返回菜单列表数据
     * @param areas 数据库中查询到的菜单列表
     * @return
     */
    public String getArea(List<Area> areas){

        String data = "";

        for (Area area : areas){

            String ids = "\"id\":";
            String texts = "\"text\":";
            String states = "\"state\":";
            String iconClss = "\"iconCls\":";
            String urls = "\"url\":";
            String pids = "\"pid\":";

            String id = "\""+ area.getAreaId() + "\",";
            String text = "\"" + area.getAreaName() + "\",";
            String state = "\"" + area.getAreaState() + "\",";
            String iconCls = "\"" + area.getAreaIcon() + "\",";
            String url = "\"" + area.getAreaUrl() + "\",";
            String pid = "\"" + area.getAreaPid() + "\"";

            String json = "{" + ids + id + texts + text + states + state + iconClss + iconCls + urls + url + pids + pid + "},";

            data = data + json;

//            System.out.println("Servlet list data = " + data);
        }

//        System.err.println("Servlet getMenuList data = " + data);

        data = data.substring(0,data.length()-1);

        data = "[" + data + "]";

        return data;
    }

    /**
     * 返回用户列表数据
     * @param users
     * @return
     */
    public String getUserList(List<User> users, Integer userTotal){

        String data = "";
        String rows = "\"rows\":";

        String ids = "\"userId\":";
        String userNames = "\"userName\":";
        String accounts = "\"account\":";
        String docTitles = "\"doc_title\":";
        String subDepts = "\"sub_dept\":";
        String addresss = "\"address\":";
        String roles = "\"role\":";
        String isDeletes = "\"isDelete\":";
        String modifiedNames = "\"modifiedName\":";
        String totals = "\"total\":";
        String total = "\"" + userTotal + "\",";

        for (User user : users){

            String id = "\""+ user.getUserId() + "\",";
            String userName = "\"" + user.getUserName() + "\",";
            String account = "\"" + user.getUserAccount()+ "\",";
            String docTitle = "\"" + user.getDocTitle() + "\",";
            String subDept = "\"" + user.getSubDept() + "\",";
            String address = "\"" + user.getUserAddress() + "\",";
            String role = "\"" + user.getRoleId() + "\",";
            String isDelete = user.getIsDelete() + "";
            String modifiedName = "\"" + user.getModifiedUser() + "\"";

            if (isDelete.equals("0")){

                isDelete = "\"正常\",";
            }else {

                isDelete = "\"冻结\",";
            }

            System.err.println("json-> total: " + total + ", userName: " + userName);

            String json = "{" + ids + id + userNames + userName + accounts + account + docTitles + docTitle +
                    subDepts + subDept + addresss + address + roles + role + isDeletes + isDelete +
                    modifiedNames + modifiedName + "},";

            data = data + json;

        }

        System.err.println("json data: " + data.length() + ", total: " + total);

        data = data.substring(0,data.length()-1);

        data = "{" + totals + total + rows + "[" + data + "]}";

        return data;
    }

    /**
     * 返回用户角色列表数据
     * @param roles
     * @return
     */
    public String getRoleAll(List<Role> roles){

        String data = "";
        String states = "\"state\":";
        String state = "";
        String rows = "\"rows\":";

        String ids = "\"roleId\":";
        String roleNames = "\"roleName\":";
        String menuIds = "\"menuId\":";

        for (Role role : roles){

            String id = "\""+ role.getRoleId() + "\",";
            String roleName = "\"" + role.getRoleName() + "\",";
            String menuId = "\"" + role.getMenuId()+ "\"";

//            System.err.println("json-> id: " + id + ", roleName: " + roleName);

            String json = "{" + ids + id + roleNames + roleName + menuIds + menuId + "},";

            data = data + json;

        }

//        System.err.println("json --> data: " + data.length());

        data = data.substring(0,data.length()-1);

//        System.err.println("----------- rj -> 01 -------------");

        if (roles != null && roles.toString() != ""){

//            System.err.println("----------- rj -> 02 -------------");

            state = "\"200\",";
        }else {

//            System.err.println("----------- rj -> 03 -------------");

            state = "\"404\",";
        }

//        data = "{" + states + state + rows + "[" + data + "]}";
        data = "[" + data + "]";

        return data;
    }
}




































