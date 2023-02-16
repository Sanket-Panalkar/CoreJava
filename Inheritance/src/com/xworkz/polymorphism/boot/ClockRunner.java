package com.xworkz.polymorphism.boot;

import com.xworkz.polymorphism.things.Clock;
import com.xworkz.polymorphism.things.DigitalWatch;

public class ClockRunner {

	public static void main(String[] args) {
		Clock clock = new DigitalWatch();
		clock.hour();
		clock.alarm();
	}
}
