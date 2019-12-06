package com.neusoft.CHSS.dbConnectTest;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 数据库测试
 * @time 2019/11/23 0:21
 */

public class DbConnect {

    @Test
    public void demo() throws SQLException {

        AbstractApplicationContext acc = new ClassPathXmlApplicationContext("spring-dao.xml");

        DataSource dbSource = acc.getBean("dataSource", DataSource.class);

        System.err.println(dbSource.getConnection());

        acc.close();
    }
}

































