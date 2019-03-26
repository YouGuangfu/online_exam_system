package com.you.online_exam_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OnlineExamServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineExamServiceApplication.class, args);
	}

}
