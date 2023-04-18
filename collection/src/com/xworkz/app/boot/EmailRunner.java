package com.xworkz.app.boot;

import java.util.ArrayList;

import java.util.Collection;

public class EmailRunner {

	public static void main(String[] args) {
		
		Collection<String> email = new ArrayList<String>();
		
		email.add("sanket@gmail.com");
		email.add("raju@gmail.com");
		email.add("manju@gmail.com");
		email.add("annesh@gmail.com");
		email.add("kiran@gmail.com");
		email.add("kiran@gmail.com");
		email.add("ravi@gmail.com");
		email.add("rakesh@gmail.com");
		email.add("manjunath@gmail.com");
		email.add("anil@gmail.com");
		email.add("vinay@gmail.com");
		email.add("santosh@gmail.com");
		email.add("harish@gmail.com");
		email.add("kavan@gmail.com");
		email.add("priyanka@gmail.com");
		email.add("kyarmal@gmail.com");
		email.add("deepa@gmail.com");
		email.add("vishal@gmail.com");
		email.add("hanamanth@gmail.com");
		
		for (String ref : email) {
			System.out.println("emails: "+ref);
		}
		System.out.println("---------------------------------");



	}
}
