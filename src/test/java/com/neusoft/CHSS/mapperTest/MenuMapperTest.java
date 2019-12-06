package com.neusoft.CHSS.mapperTest;

import com.neusoft.CHSS.entity.Menu;
import com.neusoft.CHSS.mapper.MenuMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 菜单测试
 * @time 2019/11/26 0:56
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MenuMapperTest {

    @Autowired
    private MenuMapper menuMapper;

    @Test
    public void menuHandler(){

        String param = "1";

        Integer menuPid = 0;

        if (param != null || param != ""){

            menuPid = Integer.parseInt(param);
        }

        List<Menu> menus = menuMapper.findMenuByMenuType(1,menuPid);

        for (Menu menu : menus) {

            System.err.println(menu);
        }
    }
}


































