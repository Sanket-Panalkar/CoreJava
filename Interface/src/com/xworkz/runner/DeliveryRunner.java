package com.xworkz.runner;

import com.xworkz.interfaceclass.Delivery;
import com.xworkz.things.Dunzo;
import com.xworkz.things.Person;
import com.xworkz.things.Rapido;

public class DeliveryRunner {

	public static void main(String[] args) {

			
		Delivery dilevery = new Dunzo();
		Delivery dilevery1 = new Rapido();
		Person person = new Person(dilevery);
		person.display();		
		
		
		
	}

}
