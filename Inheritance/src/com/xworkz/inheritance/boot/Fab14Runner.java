package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.Feb14;
import com.xworkz.inheritance.things.ValentineDay;

public class Fab14Runner {

	public static void main(String[] args) {

		ValentineDay vd = new ValentineDay();
		vd.day();
		vd.getYear();
		vd.holiday();

		Feb14 feb = new Feb14();
		feb.day();
		feb.getYear();

		ValentineDay cast = (ValentineDay) feb;
		cast.holiday();

	}

}
