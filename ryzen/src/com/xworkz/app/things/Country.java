package com.xworkz.app.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
public class Country {

	   @Value("India")
	    private String name;
	    
	    @Value("Asia")
	    private String continent;
	    
	    @Value("New Dehali")
	    private String capital;
	    
	    @Value("Kannada")
	    private String language;
	    
	    @Value("Rs")
	    private String currency;
	    
	    @Value("ruppies")
	    private String currencyName;
	    
	    @Value("28")
	    private String numberOfStates;
	    
	    @Value("13,239,523")
	    private String population;
	    
	    @Value("3.287 million square kilometers.")
	    private String area;
	    
	    @Value("15,1947")
	    private String yearFounded;
	    

}
