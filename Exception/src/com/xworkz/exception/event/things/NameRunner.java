package com.xworkz.exception.event.things;

public class NameRunner {

	public static void main(String[] args) {
		
		Name name =new Name();
		name.method();
		Name name1 =new Name();
		name1.method();
		System.out.println(Name.ref);
		
	}
	
}
