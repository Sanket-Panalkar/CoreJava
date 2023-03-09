package com.xworkz.implimentor;

import com.xworkz.interfaceclass.RailwayStation;

public class RailwayStaff implements RailwayStation{

	@Override
	public boolean ticketing() {
		
		return false;
	}

	@Override
	public double trainSheduling() {		
		return 02.50d;
	}

	@Override
	public String trainName() {
		
		return "RajajiNagar-Express";
	}

	@Override
	public String trainColor() {
		
		return "train-Color: Blue";
	}

	@Override
	public String trainPlatform() {
		
		return "platform-04";
	}
	
	@Override
	public String security() {
		
		return "camera";
	}

	@Override
	public String place() {
		
		return "Rajajinagar";
	}

	@Override
	public String trainType() {
		
		return "Electrical";
	}

}
