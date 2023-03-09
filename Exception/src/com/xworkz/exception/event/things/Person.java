package com.xworkz.exception.event.things;

public class Person {
 
	protected int id;
	protected String name;
	protected int age;
	protected String email;
	
	
//	public Person(int id) {
//		this.id=id;
//	}
//	public Person(int id,String name) {
//		this(id);
//		this.name=name;
//	}
//	public Person(int id,String name,int age) {
//		this(id,name);
//		this.age=age;
//	}
//	public Person(int id,String name,int age,String email) {
//		this(id,name,age);
//		this.email=email;
//	}
	public Person(int id,String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	public Person(int id, String name, String email) {
		// TODO Auto-generated constructor stub
		this(id,name);
		this.email=email;
	}
	public Person(int id,String name,int age,String email) {
		// TODO Auto-generated constructor stub
		this(id,name,email);
		this.age=age;
	}
	
	public void setPerson(int id,String name,int age,String email) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.email=email;
	}
	
	
	
	
	
	
	
	
}
