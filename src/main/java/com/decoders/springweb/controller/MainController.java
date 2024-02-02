package com.decoders.springweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}
	
	@PostMapping("/post")
	public String helloWorldPost() {
		return "Hello World from Post";
	}
}
