package com.xworkz.things;

import com.xworkz.interfaceclass.GoldSeller;

public class DevendraSetu implements GoldSeller{

	@Override
	public double pricePerGram() {
		System.out.println("pricePerGram method in DevendraSetu");
		return 4500d;
	}

	@Override
	public String getGstNo() {
		String gstNo = "esyfvs4";
		System.out.println("getGstNo method in DevendraSetu");
		System.out.println("gst Number :"+gstNo);
		return gstNo;
	}

	@Override
	public String getLocation() {
		String location = "Rajaji-Nagara";
		System.out.println("getLocation method in DevendraSetu");
		return location;
	}

}
