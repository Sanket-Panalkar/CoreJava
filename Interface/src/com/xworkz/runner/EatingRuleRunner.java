package com.xworkz.runner;

import com.xworkz.interfaceclass.EatingRule;
import com.xworkz.things.Customer;
import com.xworkz.things.Military;

public class EatingRuleRunner {

	public static void main(String[] args) {
		
		EatingRule rule = new Customer();
		Military military = new Military(rule);
		military.initEatingRule();
	}
}
