package com.xworkz.things;

import com.xworkz.interfaceclass.GoldSeller;

public class Mahalakshmi implements GoldSeller{

	@Override
	public double pricePerGram() {
		System.out.println("pricePerGram method in Mahalakshmi");
		return 7000d;
	}

	@Override
	public String getGstNo() {
		String gstNo = "KSDFG78394";
		System.out.println("getGstNo method in Mahalakshmi");
		System.out.println("GST No:"+gstNo);
		return gstNo;
	}

	@Override
	public String getLocation() {
	    String location = "WhiteFeald";
		System.out.println("getLocation method in Mahalakshmi");
		return location;
	}

}
