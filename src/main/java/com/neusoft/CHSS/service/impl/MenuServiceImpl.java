package com.neusoft.CHSS.service.impl;

import com.neusoft.CHSS.entity.Menu;
import com.neusoft.CHSS.mapper.MenuMapper;
import com.neusoft.CHSS.service.MenuService;
import com.neusoft.CHSS.service.exception.MenuNoFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 菜单列表实现类
 * @time 2019/11/26 1:07
 */

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> getMenuByMenuType(Integer menuType, String menuParId) {

        Integer menuId = 0;

        // 判断树菜单传的id是否为null 或 “” ，如果是，则设置为0，或该菜单下的总目录的pid
        if (menuParId != null && menuParId != ""){

            menuId = Integer.parseInt(menuParId);
        }

        System.err.println("menuType: " + menuType + ", menuId: " + menuParId);

        List<Menu> menus = menuMapper.findMenuByMenuType(menuType, menuId);

        if(menus == null){

            throw new MenuNoFoundException("你请求的菜单类别: "+ menuType + " 列表未找到！");
        }else {

            return menus;
        }
    }
}





































