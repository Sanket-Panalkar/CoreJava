package com.xworkz.things;

import com.xworkz.interfaceclass.GoldSeller;

public class Priyanka {

	public GoldSeller goldseller;
	
	public Priyanka(GoldSeller goldseller) {
		System.out.println("running Priyanka const--");
		this.goldseller=goldseller;
	}
	
	public void purchaseGold() {
		System.out.println("purchaseGold method in Priyanka--");
	}
}
