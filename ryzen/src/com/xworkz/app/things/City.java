package com.xworkz.app.things;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
public class City {

	private String city1, city2, city3, city4, city5, city6, city7, city8, city9;

	
	public City(@Value("mudhol") String city1,@Value("bagalkot") String city2,@Value("mangalur") String city3,@Value("bengalor") String city4,@Value("") String city5,@Value("") String city6,@Value("") String city7,
			@Value("xworkz")	String city8,@Value("rajajinagr") String city9) {
		super();
		this.city1 = city1;
		this.city2 = city2;
		this.city3 = city3;
		this.city4 = city4;
		this.city5 = city5;
		this.city6 = city6;
		this.city7 = city7;
		this.city8 = city8;
		this.city9 = city9;
	}

}
