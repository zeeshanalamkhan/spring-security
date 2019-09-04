package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping("/admin")
	public String admin() {
		return "<h1>Hello Admin!</h1>";
	}

	@GetMapping("/user")
	public String user() {
		return "<h1>Hello User!</h1>";
	}

	@GetMapping("/all")
	public String all() {
		return "<h1>Hello EveryOne!</h1>";
	}
}
