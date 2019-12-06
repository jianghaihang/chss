package com.neusoft.CHSS.service;

import com.neusoft.CHSS.entity.Area;
import com.neusoft.CHSS.entity.Menu;

import java.util.List;

/**
 * 菜单列表的服务层接口
 */
public interface AreaService {

    /**
     * 通过菜单类别获取菜单列表
     * @param
     * @return
     */
    List<Area> getArea(String areaType, String areaId);
}
