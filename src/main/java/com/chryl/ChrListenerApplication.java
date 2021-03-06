package com.chryl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chryl.mapper")
public class ChrListenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChrListenerApplication.class, args);
	}

}
