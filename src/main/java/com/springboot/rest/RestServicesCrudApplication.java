package com.springboot.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title="Spring boot Rest API",
				description="Spring boot Rest API documentation",
				version="1.0.0",
		contact=@Contact(
				name="A",
				email="a@gmail.com"
				)
		)
		)
public class RestServicesCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServicesCrudApplication.class, args);
	}

}
