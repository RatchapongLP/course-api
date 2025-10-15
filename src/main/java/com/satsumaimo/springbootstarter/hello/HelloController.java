package com.satsumaimo.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	// Maps only to GET HTTP method by default
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
}
