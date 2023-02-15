package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.Cricket;
import com.xworkz.inheritance.things.Sports;

public class SportsRunner {

	public static void main(String[] args) {

		Cricket ck = new Cricket();
		ck.player();
		ck.getPlace();

		Sports sp = new Sports();
		sp.getPlace();

		Sports sp1 = new Cricket();
		sp1.getPlace();

		Cricket cast = (Cricket) sp1;
		cast.player();

	}
}
