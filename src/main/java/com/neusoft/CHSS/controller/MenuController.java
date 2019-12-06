package com.neusoft.CHSS.controller;

import com.neusoft.CHSS.entity.Menu;
import com.neusoft.CHSS.service.MenuService;
import com.neusoft.CHSS.utils.ResponseResult;
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
 * @description: 描述 菜单列表控制器类
 * @time 2019/11/26 2:15
 */

@RestController
@RequestMapping("menus")
public class MenuController extends BaseController{

    @Autowired
    private MenuService menuService;

    @RequestMapping("menu_sys")
    public String menuHandler(
            HttpServletRequest request
    ){

        Integer menuType = Integer.valueOf(request.getParameter("menu_type"));

        String menuId = request.getParameter("id");

        List<Menu> menus = menuService.getMenuByMenuType(menuType, menuId);

        String menuTypes = new ReturnJson().getMenuByMenuType(menus);

//        System.out.println("menuTypes: " + menuTypes);

        return menuTypes;
    }

}

































