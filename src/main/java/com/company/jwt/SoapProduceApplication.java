package com.company.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.company.jwt") //to scan packages mentioned
public class SoapProduceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapProduceApplication.class, args);
	}

}
