package com.xworkz.application.dto.boot;

import com.xworkz.application.dto.things.TravelDTO;

public class TravelDTO_Runner {

	public static void main(String[] args) {
		
		TravelDTO travel = new TravelDTO();
		travel.setName("trivel application");
		travel.setOwner("sanket");
		travel.setSize(25);
		travel.setVersion(6.8d);
		
	    System.out.println(travel.toString());
	    System.out.println(travel.hashCode());
	    System.out.println(travel.equals(travel));
	}
}
