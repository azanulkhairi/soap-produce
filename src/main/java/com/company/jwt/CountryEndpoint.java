package com.company.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

import com.company.jwt.repository.CountryRepository;
import com.company.jwt.webservice.GetCountryRequest;
import com.company.jwt.webservice.GetCountryResponse;

/*
 * @Endpoint – registers the class with Spring WS as a Web Service Endpoint
@PayloadRoot – defines the handler method according to the namespace and localPart attributes
@ResponsePayload – indicates that this method returns a value to be mapped to the response payload
@RequestPayload – indicates that this method accepts a parameter to be mapped from the incoming request
*/
@Endpoint
public class CountryEndpoint {
	
	private static final String NAMESPACE_URI ="http://www.baeldung.com/springsoap/gen";
	
	@Autowired
	private CountryRepository countryRepository;
	
	public GetCountryResponse getCountryResponse(@RequestPayload GetCountryRequest request) {
		
		GetCountryResponse response= new GetCountryResponse();
		
		response.setCountry(countryRepository.findCountry(request.getName()));
		
		return response;
		
	}
	

}
