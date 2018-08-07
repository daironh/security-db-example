package com.daironh.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloController {

	@GetMapping("/all")
	public String hello() {
		return "hello!!!";
	}

	@GetMapping("/secured/all")
	public String securedHello() {
		return "secured hello!!!";
	}

}
