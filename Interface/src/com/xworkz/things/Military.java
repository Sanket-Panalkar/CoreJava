package com.xworkz.things;

import com.xworkz.interfaceclass.EatingRule;

public class Military {
	public EatingRule eatingRule;
	
	public Military(EatingRule eatingRule) {
	    this.eatingRule = eatingRule;
	}
	
	public void initEatingRule() {
	   boolean wash = this.eatingRule.washedHands("Annesh");
	   double duration = this.eatingRule.durationTaken();
	   
	   if(duration <=EatingRule.DURATION && wash) {
	       System.out.println("Eating is good...");
	   }else {
		   System.out.println("Eatting is bad...");
	   }
	   
	}
}