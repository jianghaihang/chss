package com.neusoft.CHSS.mapperTest;

import com.neusoft.CHSS.entity.User;
import com.neusoft.CHSS.mapper.LoginMapper;
import com.neusoft.CHSS.mapper.RegisterMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.Test;

import java.util.List;

//import javax.sql.DataSource;
//import org.springframework.context.ApplicationContext;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 测试用户
 * @time 2019/11/24 10:49
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class LoginMapperTest {

    @Autowired
    private LoginMapper loginMapper;

//    @Autowired
//    private LoginMapper userMapper;

//    @Autowired
//    ApplicationContext applicationContext;
//
//    @Autowired
//    DataSourceProperties dataSourceProperties;

    @Test
    public void findAllUser(){

//        DataSource dataSource = applicationContext.getBean(DataSource.class);
//
//        System.out.println(dataSource);
//        System.out.println(dataSource.getClass().getName());
//        System.out.println(dataSourceProperties);

        User user = loginMapper.findUserByAccount("xiaoduo");

        System.err.println(user);


    }
}


































