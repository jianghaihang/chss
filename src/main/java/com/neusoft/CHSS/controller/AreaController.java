package com.neusoft.CHSS.controller;

import com.neusoft.CHSS.entity.Area;
import com.neusoft.CHSS.service.AreaService;
import com.neusoft.CHSS.utils.ReturnJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 行政区划控制层
 * @time 2019/11/26 15:48
 */

@RestController
@RequestMapping("areas")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @RequestMapping("area_menu")
    public String areaHandle(
            HttpServletRequest request
    ){

        String areaType = request.getParameter("areaType");
        String areaId = request.getParameter("id");

        List<Area> areas = areaService.getArea(areaType, areaId);

        String area = new ReturnJson().getArea(areas);

        return area;
    }
}































