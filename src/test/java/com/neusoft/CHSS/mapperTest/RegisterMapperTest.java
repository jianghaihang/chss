package com.neusoft.CHSS.mapperTest;

import com.neusoft.CHSS.entity.User;
import com.neusoft.CHSS.mapper.RegisterMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 注册用户测试
 * @time 2019/11/24 17:22
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RegisterMapperTest {

    @Autowired
    private RegisterMapper registerMapper;

    @Test
    public void reg(){

        User user = new User();

        user.setUserName("小舵");
        user.setUserAccount("xiaoduo");
        user.setUserPassword("123456");
        user.setUserPhone("123456");
        user.setUserAddress("杭州市江干区");
        user.setRoleId(1);
        user.setIsDelete(0);
        user.setUserInfo("系统开发者");
        user.setIsManager(0);
        user.setUserCode("000000");
        user.setIdNum("342224199710050000");
        user.setLandLine("886-9898966");
        user.setPinyin("XiaoDuo");
        user.setPerType("全科医生");
        user.setSubDept("门诊全科");
        user.setDocTitle("主任医生");
        user.setPubHealth("公卫管理");
        user.setDocCode("123456789012345");
        user.setCreateUser("小舵");
        user.setModifiedUser("小舵");
        user.setUserSalt("JKFJK23432S3K4J3241");
        user.setPwdBak("123456");

        Integer rows = registerMapper.addNewUser(user);

        System.err.println("插入成功！共：" + rows + " 行！");



//        User user = new User();
//
//        String pwd = "123456";
//
//        user.setUserName("user");
//        user.setUserPassword(pwd);
//        user.setUserAge(12);
//        user.setUserGender(0);
//        user.setUserPhone("12312341234");
//        user.setUserAddress("浙江杭州市图书馆");
//        user.setRoleId(1);
//        user.setIsDelete(0);
//        user.setPwdBak(pwd);
//
//        Integer row = registerMapper.setUserInfo(user);
//
//        System.out.println("添加用户成功，共: " + row + " 行！" );

//        User admin = registerMapper.findUserByUsername("admin");
//
//        System.out.println(admin);
    }

}


































