package com.wxl.testmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wxl.testmybatis.mapper")
public class SpringBootTestmybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestmybatisApplication.class, args);
	}

}

