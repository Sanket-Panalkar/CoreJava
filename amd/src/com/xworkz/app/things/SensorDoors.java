package com.xworkz.app.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.ToString;

@Component
@ToString
@AllArgsConstructor
public class SensorDoors {

		@Autowired
		private int numDoors;
		
		@Autowired
		private Camera camera;
}
