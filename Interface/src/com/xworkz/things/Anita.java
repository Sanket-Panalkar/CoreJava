package com.xworkz.things;

import com.xworkz.interfaceclass.GoldSeller;

public class Anita {

public GoldSeller goldseller;
	
	public Anita(GoldSeller goldseller) {
		System.out.println("running Anita const--");
		this.goldseller=goldseller;
	}
	
	public void buyGold() {
		System.out.println("buyGold method in Anita--");
	}
}
