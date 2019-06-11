package com.xuele.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping("/hello")
	public String hello(){
		
		logger.info("say hello log");
		
		return "say hello log";
	}
	
}
