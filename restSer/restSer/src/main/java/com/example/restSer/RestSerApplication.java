package com.example.restSer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;/*
															import org.springframework.web.bind.annotation.RequestMapping;
															import org.springframework.web.bind.annotation.RequestMethod;*/
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Configuration;  
@Configuration
@SpringBootApplication
@RestController
public class RestSerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestSerApplication.class, args);
	}
	@GetMapping(path="/hello")
	public String helloWorld()  
	{  
	return "Hello World1";  
	}  
	@GetMapping(path="hello-world-bean")
	public HelloWorldBean hello() {
		return new HelloWorldBean("helloBean");
	}
	@GetMapping(path="/hello-world-bean/PathVariable/{name}")
	public HelloWorldBean hello1(@PathVariable String name) {
		return new HelloWorldBean("hi",name);
	}
	
	

}
