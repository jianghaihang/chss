package com.neusoft.CHSS.serviceTest;

import com.neusoft.CHSS.entity.User;
import com.neusoft.CHSS.service.RegisterService;
import com.neusoft.CHSS.service.exception.UserCodeUniqueException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 服务层注册测试
 * @time 2019/11/24 19:00
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ResgisterServiceTest {

    @Autowired
    private RegisterService registerService;

    @Test
    public void reg(){

        User user = new User();

        user.setUserName("关晓彤");
        user.setUserAccount("gxt001");
        user.setUserPassword("123456");
        user.setUserPhone("1234567");
        user.setUserAddress("杭州市西湖区");
        user.setRoleId(1);
        user.setIsDelete(0);
        user.setUserInfo("系统投资者");
        user.setIsManager(0);
        user.setUserCode("000001");
        user.setIdNum("342224199710050020");
        user.setLandLine("886-9898966");
        user.setPinyin("GuanXiaoTong");
        user.setPerType("全科医生");
        user.setSubDept("门诊全科");
        user.setDocTitle("主任医生");
        user.setPubHealth("公卫管理");
        user.setDocCode("123456789012345");
        user.setCreateUser("小舵");
        user.setModifiedUser("小舵");
        user.setUserSalt("JKFJK23432S3K4J3241");
        user.setPwdBak("123456");

        try {

            // 用户注册
            Integer rows = registerService.addUser(user,"xiaoduo");

            System.out.println("注册成功！共： " + rows + " 行！");

        }catch (UserCodeUniqueException e){

            throw new UserCodeUniqueException("您尝试添加的用户编码【 " + user.getUserCode() + " 】已存在！");

        }


//        user.setUserName("array");
//        user.setUserPassword(pwd);
//        user.setUserAge(12);
//        user.setUserGender(0);
//        user.setUserPhone("12312341234");
//        user.setUserAddress("浙江杭州市图书馆");
//        user.setRoleId(1);
//        user.setIsDelete(0);
//        user.setPwdBak(pwd);
//        user.setUserSalt("");
    }
}

























