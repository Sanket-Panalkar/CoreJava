package com.xworkz.things;

import com.xworkz.interfaceclass.GoldSeller;

public class Abharan implements GoldSeller{

	@Override
	public double pricePerGram() {
		System.out.println("pricePerGram method in Abharan");
		return 6000d;
	}

	@Override
	public String getGstNo() {
		String gstNo = "SDF3874576G";
		System.out.println("getGstNo method in Abharan");
		System.out.println("GST No:"+gstNo);
		return gstNo;
	}

	@Override
	public String getLocation() {
		String location = "BTm-Layout";
		System.out.println("getLocation method in Abharan");
		System.out.println("location :"+location);
		return location;
	}

}
