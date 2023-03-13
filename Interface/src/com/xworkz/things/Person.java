package com.xworkz.things;

import com.xworkz.interfaceclass.Delivery;

public class Person {

	public Delivery delivery;
	
	public Person(Delivery delivery) {
		System.out.println("arg const in Person..");
		this.delivery=delivery;
	}
	
	public void display() {
		System.out.println("display method in Person---");
	    double charge = delivery.charges();
	    double time = delivery.timeTaken();
	    delivery.agemtName(0);
	    
	    if(charge<60) {
	    	System.out.println("charges are ok");
	    }else {
	    	System.out.println("charges are expencive");
	    }
	    if(time<=30) {
	    	System.out.println("ontime delivery");
	    }else if (time>30) {
	    	System.out.println("delaed delivery");
	    }
	}
}
