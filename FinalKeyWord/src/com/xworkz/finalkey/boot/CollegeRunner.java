package com.xworkz.finalkey.boot;

import com.xworkz.finalkey.things.Cantin;
import com.xworkz.finalkey.things.College;

public class CollegeRunner {

	public static void main(String[] args) {
		
		College college = new College();
		System.out.println("main method running...");
		college.getSection();
		College college1 = new Cantin();
		Cantin casted = (Cantin)college1;
		 
		System.out.println(casted.getSection());
		      
	}
}
