package com.neusoft.CHSS.service.impl;

import com.neusoft.CHSS.entity.Area;
import com.neusoft.CHSS.entity.Menu;
import com.neusoft.CHSS.mapper.AreaMapper;
import com.neusoft.CHSS.mapper.MenuMapper;
import com.neusoft.CHSS.service.AreaService;
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
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper areaMapper;

    @Override
    public List<Area> getArea(String areaType, String areaPraId) {

//        System.err.println("areaType: " + areaType + ", areaId: " + areaPraId);

        String areaId = "0";

        if (areaPraId != null && areaPraId != "" ){

            areaId = areaPraId;

//            System.err.println("pan: " + areaId);
        }

        List<Area> areas = areaMapper.findArea(areaType, areaId);

        if (areas == null) {

            throw new MenuNoFoundException("你请求的菜单类别: " + areaType + " 列表未找到！");
        } else {

            return areas;
        }
    }
}





































