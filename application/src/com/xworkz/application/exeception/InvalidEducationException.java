package com.xworkz.application.exeception;

public class InvalidEducationException extends Exception {

	public InvalidEducationException(String message) {
		super(message);
		System.out.println("service");
	}
}