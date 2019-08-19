package com.eproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HansController {

	@GetMapping("/demo")
	public String demo() {
		return "Hello World";
	}
}
