package com.xworkz.things;

import com.xworkz.interfaceclass.Delivery;

public class Rapido implements Delivery{

	@Override
	public double charges() {
		System.out.println("charge in Rapido--");
		return 0;
	}

	@Override
	public double timeTaken() {
		System.out.println("timeTaken in Rapido--");
		return 0;
	}

	@Override
	public String agemtName(int rating) {
		System.out.println("agentName in Rapido--");
		return null;
	}

	
}
