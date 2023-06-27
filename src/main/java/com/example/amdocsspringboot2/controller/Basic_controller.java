package com.example.amdocsspringboot2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Basic_controller {
	
	@GetMapping("/get")
	public String getData() {
		return "welcome to amdocs";
	}

}
