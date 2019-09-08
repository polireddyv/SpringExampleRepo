package com.example.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins= {"http://localhost:4200"})
public class HelloWorldController {

	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean getHelloWorldBean() {
		return new HelloWorldBean(10, "Hello Mounika ... from REST service");
	}
	
	@GetMapping(path="/hello-world-bean/{name}")
	public HelloWorldBean getHelloWorldPathVariableBean(@PathVariable String name) {
		return new HelloWorldBean(10, "Hello "+name+" ... from REST service");
	}	
	
}
