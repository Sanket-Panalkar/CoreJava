package com.xworkz.app.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
public class EvenValues {

private int num1,num2,num3,num4,num5,num6,num7,num8,num9;



public EvenValues(@Value("2") int num1,@Value("4") int num2,@Value("6") int num3,@Value("8") int num4,@Value("10") int num5,@Value("12") int num6,@Value("14") int num7,@Value("16") int num8,@Value("18") int num9) {
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
