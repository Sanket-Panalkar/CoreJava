package com.xworkz.things;

public abstract class AbstractInfo { 
	
	private String createdBy;
	private String updatedBy;
	
	
	public void init(String createdBy , String updatedBy) {
		System.out.println("init method in AbstractInfo...");
		this.createdBy=createdBy;
		this.updatedBy=updatedBy;
		
	}
	
	@Override
	public String toString() {
		
		System.out.println("toString method in abstract info....");
		
		return "Created by :"+createdBy+"/n updatedBy : "+updatedBy;
	}
}
