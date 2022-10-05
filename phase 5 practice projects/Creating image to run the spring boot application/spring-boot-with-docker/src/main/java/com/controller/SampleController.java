package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class SampleController {
	@GetMapping(value = "/")
	public String greeting() {
		return "Welcome to Spring boot with docker by nikhil";
	}
	@GetMapping(value = "say/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return "welcme user"+name+" to spring boot ";
	}

}
