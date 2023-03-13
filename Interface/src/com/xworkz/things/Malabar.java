package com.xworkz.things;

import com.xworkz.interfaceclass.GoldSeller;

public class Malabar implements GoldSeller{

	@Override
	public double pricePerGram() {
		System.out.println("pricePerGram method in Malabar...");
		return 15000d;
	}

	@Override
	public String getGstNo() {
		System.out.println("getGstNo methgod in Malabar...");
		String gstNo = "GCS65547SF";
		
		System.out.println("GST No:"+gstNo);
		return gstNo;
	}

	@Override
	public String getLocation() {
		System.out.println("getLocation method in Malabar..");
		String location = "jayanagar";
		
		return location;
	}

	
}
