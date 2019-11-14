package com.example.vasu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/getFirstName")
	public String firstName() {
		return "Vasu";
	}

	@GetMapping("/getLastName")
	public String lastName() {
		return "Rajput";
	}
}
