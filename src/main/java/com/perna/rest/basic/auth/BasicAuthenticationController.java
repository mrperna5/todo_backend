package com.perna.rest.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller - handles HTTP requests
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAuthenticationController {
	

	//hello-world-bean
	@GetMapping(path = "/basicauth")
	public AuthenticationBean helloWorldBean() {
//		throw new RuntimeException("Some Error has Happened!");
		return new AuthenticationBean("You are authenticated");
	}
		
}
