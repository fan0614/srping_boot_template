package com.francis.spring_boot_template;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.francis.spring_boot_template.mapper")
@SpringBootApplication
public class SpringBootTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTemplateApplication.class, args);
	}

}
