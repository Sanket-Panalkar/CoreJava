package com.xworkz.app.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
public class School {

	private String class1, class2, class3, class4, class5, class6, class7, class8, class9, class10;

	
	public School(@Value("1st") String class1,@Value("2nd") String class2,@Value("3rd") String class3,@Value("4rth") String class4,@Value("5th") String class5,@Value("6th") String class6,
			@Value("7th")String class7,@Value("8th") String class8,@Value("9th") String class9,@Value("10th") String class10) {
		super();
		this.class1 = class1;
		this.class2 = class2;
		this.class3 = class3;
		this.class4 = class4;
		this.class5 = class5;
		this.class6 = class6;
		this.class7 = class7;
		this.class8 = class8;
		this.class9 = class9;
		this.class10 = class10;
	}

}
