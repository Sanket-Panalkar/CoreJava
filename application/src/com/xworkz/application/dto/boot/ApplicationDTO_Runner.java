package com.xworkz.application.dto.boot;

import com.xworkz.application.dto.things.ApplicationDTO;

public class ApplicationDTO_Runner {
	
	public static void main(String[] args) {
		
		ApplicationDTO application = new ApplicationDTO();
		

		application.setAttDate(null);
		application.setAvilable("avilable");
		application.setLength(22d);
		application.setName("instagram");
		application.setOwner("sanket");
		
		System.out.println(application.getOwner());
		System.out.println(application.getName());
		System.out.println(application.getLength());
		System.out.println(application.getAvilable());
		System.out.println(application.getAttDate());

		System.out.println(application.toString());
		System.out.println(application.hashCode());
		
		application.equals(application);
	}

}
