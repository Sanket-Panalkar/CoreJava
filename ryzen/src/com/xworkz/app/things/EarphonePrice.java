package com.xworkz.app.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
public class EarphonePrice {

	private double price1, price2, price3, price4, price5, price6, price7, price8, price9, price10, price11;

	public EarphonePrice(@Value("250") double price1, @Value("550") double price2, @Value("2650") double price3,
			@Value("690") double price4, @Value("86250") double price5, @Value("2500") double price6,
			@Value("650") double price7, @Value("850") double price8, @Value("2550") double price9,
			@Value("880") double price10, @Value("68210") double price11) {
		super();
		this.price1 = price1;
		this.price2 = price2;
		this.price3 = price3;
		this.price4 = price4;
		this.price5 = price5;
		this.price6 = price6;
		this.price7 = price7;
		this.price8 = price8;
		this.price9 = price9;
		this.price10 = price10;
		this.price11 = price11;
	}

}
