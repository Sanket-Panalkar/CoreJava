package com.xworkz.runner;

import com.xworkz.interfaceclass.GoldSeller;
import com.xworkz.things.Abharan;
import com.xworkz.things.Bhairavi;
import com.xworkz.things.DevendraSetu;
import com.xworkz.things.Mahalakshmi;
import com.xworkz.things.Malabar;

public class GoldRunner {

	public static void main(String[] args) {
		
		GoldSeller ref1 = new Malabar();
		GoldSeller ref2 = new DevendraSetu();
		GoldSeller ref3 = new Abharan();
		GoldSeller ref4 = new Mahalakshmi();
		
		Bhairavi bhairavi = new Bhairavi(ref4);
		Bhairavi bhairav1 = new Bhairavi(ref4);
		Bhairavi bhairavi = new Bhairavi(ref4);
		Bhairavi bhairavi = new Bhairavi(ref4);
	}
}
