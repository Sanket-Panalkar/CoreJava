package com.xworkz.app.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Saloon {

	private String name;    
	private String ownerName;
	private String type;
	private int noOfBarbers;
	
//	public Saloon() {
//		// TODO Auto-generated constructor stub 
//	}
	
	public Saloon(@Value("sanket") String name, @Value("annesh") String ownerName, @Value("gents") String type, @Value("2") int noOfBarbers) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.type = type;
		this.noOfBarbers = noOfBarbers;
	}

	@Override
	public String toString() {
		return "Saloon [name=" + name + ", ownerName=" + ownerName + ", type=" + type + ", noOfBarbers=" + noOfBarbers
				+ "]";
	}

}
