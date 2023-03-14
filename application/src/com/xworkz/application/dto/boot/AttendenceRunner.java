package com.xworkz.application.dto.boot;

import com.xworkz.application.dto.things.Attendence;

public class AttendenceRunner {

	public static void main(String[] args) {
		 
		Attendence att = new Attendence();
		
		String name =att.setName("Sanket");
		System.out.println("name is: "+name);
		att.setDate(null);
		att.setSize(60d);
		att.setVersion("2.3.8");
		System.out.println(att.toString());
	}
	
}
