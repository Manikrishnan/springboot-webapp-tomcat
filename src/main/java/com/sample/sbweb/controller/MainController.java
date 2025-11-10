package com.sample.sbweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MainController {
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World from Get";
	}
	
	@PostMapping("/post")
	public String helloWorldPost() {
		return "Hello World from Post";
	}
}
