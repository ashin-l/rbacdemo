package com.example.rbacdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

// 屏蔽 spring boot security 需要增加注解 @SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class RbacdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RbacdemoApplication.class, args);
	}

}
