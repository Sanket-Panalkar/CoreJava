package com.xworkz.app.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
public class Numbers {

private int num1,num2,num3,num4,num5,num6,num7,num8,num9;



public Numbers(@Value("") int num1,@Value("") int num2,@Value("") int num3,@Value("") int num4,@Value("") int num5,@Value("") int num6,@Value("") int num7,@Value("") int num8,@Value("") int num9) {
	super();
	this.num1 = num1;
	this.num2 = num2;
	this.num3 = num3;
	this.num4 = num4;
	this.num5 = num5;
	this.num6 = num6;
	this.num7 = num7;
	this.num8 = num8;
	this.num9 = num9;
}


	

}
