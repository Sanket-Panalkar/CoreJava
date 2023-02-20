package com.xworkz.object.boot;

import com.xworkz.object.things.Pipe;

public class PipeRunner {

	public static void main(String[] args) {
		Pipe pipe = new Pipe();
		pipe.setBrand("Finolex Industries");
		pipe.setColor("blue");
		pipe.setPrice(648);
		System.out.println(pipe.toString());
		System.out.println(pipe.equals(pipe));
	    System.out.println(pipe.toString());
		pipe.setBrand("ASTM");
		pipe.setColor("yellow");
		pipe.setPrice(10);
		System.out.println(pipe.equals(pipe));
		
		
	}

}
