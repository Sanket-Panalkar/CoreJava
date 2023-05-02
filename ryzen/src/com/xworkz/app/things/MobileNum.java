package com.xworkz.app.things;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
public class MobileNum {

	private Long n1, n2, n3, n4, n5, n6, n7, n8, n9;

	public MobileNum(@Value("7337686718L") Long n1, @Value("2579686718L") Long n2, @Value("9937686718L") Long n3,
			@Value("9837686718L") Long n4, @Value("8637686718L") Long n5, @Value("9937686718L") Long n6,
			@Value("7867686718L") Long n7, @Value("89376867549L") Long n8, @Value("733768676L") Long n9) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
		this.n5 = n5;
		this.n6 = n6;
		this.n7 = n7;
		this.n8 = n8;
		this.n9 = n9;
	}
}
