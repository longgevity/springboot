package com.zzyu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootShiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootShiroApplication.class, args);
	}

}
