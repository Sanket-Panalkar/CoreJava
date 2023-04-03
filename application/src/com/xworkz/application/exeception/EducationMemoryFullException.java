package com.xworkz.application.exeception;

public class EducationMemoryFullException extends RuntimeException {
	
	public EducationMemoryFullException(String msg) {
		super(msg);
		System.out.println("repo");
	}
}