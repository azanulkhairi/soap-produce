package com.company.jwt.repository;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.company.jwt.webservice.Country;

@Component
public class CountryRepository {

	private static final Map<String, Country> countries = new HashMap<String, Country>();

	@PostConstruct
	public void initData() {
		
	}
	
	public Country findCountry(String name) {
		return countries.get(name);
	}
}
