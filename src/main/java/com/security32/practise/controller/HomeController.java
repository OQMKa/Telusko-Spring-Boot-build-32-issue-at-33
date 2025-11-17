package com.security32.practise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/build32")
	public String greet() {
		return "hello";
	}

}
