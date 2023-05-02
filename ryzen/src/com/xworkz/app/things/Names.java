package com.xworkz.app.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
public class Names {

	private String name1, name2, name3, name4, name5, name6, name7, name8, name9;

	public Names(@Value("sanket") String name1, @Value("vishal") String name2, @Value("kiran") String name3,
			@Value("harish") String name4, @Value("kavan") String name5, @Value("mallu") String name6,
			@Value("annesh") String name7, @Value("manikanth") String name8, @Value("sagar") String name9) {
		super();
		this.name1 = name1;
		this.name2 = name2;
		this.name3 = name3;
		this.name4 = name4;
		this.name5 = name5;
		this.name6 = name6;
		this.name7 = name7;
		this.name8 = name8;
		this.name9 = name9;
	}

}
