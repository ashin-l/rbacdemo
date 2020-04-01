package com.example.rbacdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

// 屏蔽 spring boot security 需要增加注解 @SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@MapperScan("com.example.rbacdemo.dao")
public class RbacdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RbacdemoApplication.class, args);
	}

}
