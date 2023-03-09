package com.xworkz.exception.event.things;

public class Engineer extends Person{

	public Engineer(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	public Engineer(int id, String name, String email) {
		// TODO Auto-generated constructor stub
		super(id,name,email);
	}
	public Engineer(int id,String name,int age,String email) {
		// TODO Auto-generated constructor stub
		super(id,name,age,email);
	}
	
	@Override
	public String toString() {
		
		return "id: "+id+"/nname: "+name+"/age: "+age+"/nemail: "+email;
	}

   

}
