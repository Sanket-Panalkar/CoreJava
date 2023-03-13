package com.xworkz.things;

import com.xworkz.interfaceclass.Delivery;

public class Dunzo implements Delivery{

	@Override
	public double charges() {
		System.out.println("charge in Dunzo--");
		return 0;
	}

	@Override
	public double timeTaken() {
		System.out.println("timeTaken in Dunzo--");
		return 0;
	}

	@Override
	public String agemtName(int rating) {
		
		System.out.println("agentName in Dunzo--");
		if(rating==1) {
			return "basavajaj";	
		}else if(rating==2) {
			return "dinakar";
		}else if (rating==3) {
			return "rakesh";
		}
		return null;
		
	}

	
}
