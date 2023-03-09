package com.xworkz.runner;

import com.xworkz.implimentor.RailwayStaff;
import com.xworkz.interfaceclass.RailwayStation;

public class RailwayStationRunner {

	public static void main(String[] args) {
		
		RailwayStation rv = new RailwayStaff();
		boolean ref  = rv.ticketing();
		System.out.println(ref);
		
		System.out.println(rv.security());
		System.out.println(rv.toString());
		System.out.println(rv.trainName());
		System.out.println(rv.trainPlatform());
		System.out.println(rv.trainSheduling());
		System.out.println(rv.trainType());
		System.out.println(rv.trainColor());
		System.out.println(rv.getClass());
	}
}
