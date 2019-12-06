package com.neusoft.CHSS.mapper;

import com.neusoft.CHSS.entity.Area;
import com.neusoft.CHSS.entity.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 菜单持久层映射接口
 */
public interface AreaMapper {

    /**
     * 通过areaType查找不同类别的行政区
     * @param
     * @return
     */
    List<Area> findArea(
            @Param("areaType") String areaType,
            @Param("areaId") String areaId);
}






































