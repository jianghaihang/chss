package com.neusoft.CHSS.serviceTest;

import com.neusoft.CHSS.entity.Area;
import com.neusoft.CHSS.service.AreaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 行政区划测试
 * @time 2019/11/26 15:46
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AreaServiceTest {

    @Autowired
    private AreaService areaService;

    @Test
    public void area(){

        List<Area> areas = areaService.getArea("4", null);

        for (Area area : areas) {

            System.err.println(area);

        }
    }
}
