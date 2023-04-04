package com.xworkz.application.exeception;

public class DesertMemoryFullException extends RuntimeException{
	//repo
	public DesertMemoryFullException(String msg) {
		super(msg);
	}
}