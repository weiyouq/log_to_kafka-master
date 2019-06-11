package com.xuele;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.xuele.web")
@SpringBootApplication
public class LogApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(LogApplication.class, args);
	}
}
