package com.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/msg")
	public String getMasaage() {
		return "Welcome In this tomcate 9 with cicd pipeline";
	}

}
