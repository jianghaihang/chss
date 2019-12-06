package com.neusoft.CHSS.mapper;

import com.neusoft.CHSS.entity.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 菜单持久层映射接口
 */
public interface MenuMapper {

    /**
     * 通过menuType查找不同类别的菜单
     * @param menuType
     * @return
     */
    List<Menu> findMenuByMenuType(
            @Param("menuType") Integer menuType,
            @Param("menuId") Integer menuId);
}






































