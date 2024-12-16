package com.govind.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String helloLarchSoftPvtLtd() {
		return "Welocome Sir to Govind Bhujbal Spring Boot Application !!!";
	}
}
