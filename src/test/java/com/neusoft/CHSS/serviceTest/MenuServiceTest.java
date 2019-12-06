package com.neusoft.CHSS.serviceTest;

import com.neusoft.CHSS.entity.Menu;
import com.neusoft.CHSS.service.MenuService;
import com.neusoft.CHSS.utils.ReturnJson;
import jdk.nashorn.internal.ir.ReturnNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 菜单服务层测试
 * @time 2019/11/26 1:13
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MenuServiceTest {

    @Autowired
    private MenuService menuService;

    @Test
    public void menuHandle(){

        String param = null;

        String menuPid = "0";

        if (param != null && param != ""){

            menuPid = param;
        }


        List<Menu> menus = menuService.getMenuByMenuType(1, menuPid);

        ReturnJson returnJson = new ReturnJson();

        String data = returnJson.getMenuByMenuType(menus);

        System.err.println(data);

        for (Menu menu : menus) {

            System.err.println(menu.getMenuName());
        }
    }
}
































