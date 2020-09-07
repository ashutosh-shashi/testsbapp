package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/app")
	public String testing() {
		return "You are in app";
	}
	
	@GetMapping("/")
	public String testing2() {
		return "Hello application";
	}
	
	@GetMapping("/test")
	public String testing1() {
		return "You are in test";
	}

}
