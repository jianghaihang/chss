package com.neusoft.CHSS.mapperTest;

import com.neusoft.CHSS.entity.Area;
import com.neusoft.CHSS.entity.Menu;
import com.neusoft.CHSS.mapper.AreaMapper;
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
 * @time 2019/11/26 15:22
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AreaMapperTest {

    @Autowired
    private AreaMapper areaMapper;

    @Test
    public void area(){

        List<Area> areas = areaMapper.findArea("4", "4");

        for (Area area: areas) {

            System.err.println(area);
        }

    }
}































