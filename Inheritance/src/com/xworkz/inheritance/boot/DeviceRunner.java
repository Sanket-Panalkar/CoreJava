package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.Camera;
import com.xworkz.inheritance.things.Device;

public class DeviceRunner {

	public static void main(String[] args) {

		  Camera camera=new Camera();
		  camera.capture();
		  camera.operator();
		  String ref=camera.getType();
		  System.out.println(ref);
		  
		  Device device = new Device();
		  device.operator();
		  device.getType();
		  
		  
		  Device device1=new Camera();
		  device1.operator();
		  device1.getType();
		  Camera castd=(Camera)device;
		  castd.capture(); 
		  
		   
		
		
	}
}
