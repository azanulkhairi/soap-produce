package com.company.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication 
@ComponentScan
public class SoapProduceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapProduceApplication.class, args);
	}

}
