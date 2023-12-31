package com.azurecicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class SpringAzureDemo1Application {

	@GetMapping("/msg")
	public String message() {return "test message";}
	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemo1Application.class, args);
	}

}
