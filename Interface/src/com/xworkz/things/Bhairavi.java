package com.xworkz.things;

import com.xworkz.interfaceclass.GoldSeller;

public class Bhairavi {

    public GoldSeller goldseller;
    
    public Bhairavi(GoldSeller goldseller) {
    	this.goldseller=goldseller;
    	System.out.println("running Bhiravi const--");
	}
    
    public void bangaraKharidi() {
    	System.out.println("bagaraKharidi method in Bhairavi--");
    	double gs = goldseller.pricePerGram();
    	if(gs<6000 && gs>4500) {
    		System.out.println("Bhairavi will buy gold..");
    	}
 
    }
}
