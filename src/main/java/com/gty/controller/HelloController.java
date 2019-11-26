package com.gty.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello spring boot！";
	}
	

	public static void main(String[] args) {
		System.out.println("2");
		SpringApplication.run(HelloController.class, args);
	}
}
