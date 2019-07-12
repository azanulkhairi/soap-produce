package com.company.jwt.repository;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.company.jwt.webservice.Country;
import com.company.jwt.webservice.Currency;

@Component
public class CountryRepository {

	private static final Map<String, Country> countries = new HashMap<String, Country>();

	@PostConstruct
	public void initData() {
		
		Country country = new Country();
		country.setName("Spain");
		country.setCapital("Madrid");
		country.setCurrency(Currency.EUR);
		country.setPopulation(100000);
		
		countries.put("Spain", country);
		
		Country country1 = new Country();
		country.setName("England");
		country.setCapital("London");
		country.setCurrency(Currency.GBP);
		country.setPopulation(1020000);
		
		countries.put("England", country);
	}
	
	public Country findCountry(String name) {
		return countries.get(name);
	}
}
