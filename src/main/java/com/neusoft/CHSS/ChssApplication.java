package com.neusoft.CHSS;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@MapperScan("com.neusoft.CHSS.mapper")
public class ChssApplication {

	public static void main(String[] args) {

		SpringApplication.run(ChssApplication.class, args);
	}

}

