package com.neusoft.CHSS.controller;

import com.neusoft.CHSS.entity.User;
import com.neusoft.CHSS.service.RegisterService;
import com.neusoft.CHSS.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 用户注册控制器
 * @time 2019/12/1 16:39
 */
@RestController
@RequestMapping("users")
public class UserController extends BaseController{

    @Autowired
    private RegisterService registerService;

    @RequestMapping(value = "reg",method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult regHandle(
            @RequestBody List<Map<String,String>> prams,
            HttpSession session
    ){

        System.err.println("----------01------------");

        List<User> uList = new ArrayList<>();

        User user = new User();

        for (Map<String, String> maps : prams){

            user.setUserName(maps.get("name_info"));
            user.setUserPassword(maps.get("user_pwd"));
            user.setUserAccount(maps.get("user_account"));
            user.setUserInfo(maps.get("user_info"));
            user.setUserAddress(maps.get("sub_org"));

            if (maps.get("business_role") != ""){

                user.setRoleId(Integer.parseInt(maps.get("business_role")));
            }

            if (maps.get("manager") != ""){

                user.setIsManager(Integer.parseInt(maps.get("manager")));
            }

            user.setUserCode(maps.get("staff_code"));
            user.setIdNum(maps.get("id_number"));
            user.setUserPhone(maps.get("phone"));
            user.setPinyin(maps.get("alpha_bre_code"));
            user.setPerType(maps.get("person_type"));
            user.setSubDept(maps.get("sub_departments"));
            user.setDocTitle(maps.get("doctor_title"));
            user.setPubHealth(maps.get("health_auth"));
            user.setDocCode(maps.get("doctor_code"));
            user.setLandLine(maps.get("land_line"));

            uList.add(user);
        }

        String username = (String) session.getAttribute("username");

        registerService.addUser(user, username);

        return new ResponseResult(SUCCESS);
    }
}



































