package com.javatechie.devopsintegration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@GetMapping(path = "/")
	public String hello() {
		
		return "Hello World from chaxxx ";
	}
	
}
