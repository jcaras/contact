package com.contact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages={ "com.contact.controller",
		"com.contact.model", "com.contact.services"})
@RestController
public class ContactApiApplication {


	@RequestMapping("/")
	public String home() {
		return "Hello Docker World With Spring Boot MVC";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ContactApiApplication.class, args);
	}

}

