package com.jp.sense.pr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jp.sense.pr.dao")
public class SensePrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SensePrApplication.class, args);
	}

}
