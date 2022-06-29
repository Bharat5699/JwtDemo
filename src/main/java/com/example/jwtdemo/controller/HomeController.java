package com.example.jwtdemo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/home")
	public String home(Authentication auth) {
		return "welcome "+auth.getName()+" "+auth.getAuthorities().iterator().next().getAuthority();
	}

}
