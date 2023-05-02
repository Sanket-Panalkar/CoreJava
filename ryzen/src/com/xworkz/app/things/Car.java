package com.xworkz.app.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
public class Car {

	 	@Value("THI1893")
	    private String licensePlate;
	    
	    @Value("Honda")
	    private String make;
	    
	    @Value("Civic")
	    private String model;
	    
	    @Value("2023")
	    private String year;
	    
	    @Value("Black")
	    private String color;
	    
	    @Value("Sedan")
	    private String bodyStyle;
	    
	    @Value("Gasoline")
	    private String fuelType;
	    
	    @Value("Automatic")
	    private String transmission;
	    
	    @Value("4")
	    private String numberOfDoors;
	    
	    @Value("25000")
	    private String mileage;
	    

}
