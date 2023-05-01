package com.xworkz.app.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Barber {

	private String name;
	private int exp;
	private double salary;
	private int age;
	private long contactNo;
	private String gender;

	@Value("10")
	public void setExp(int exp) {
		this.exp = exp;
	}

	@Value("9865412535")
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public Barber(@Value("huliya")String name,@Value("55000") double salary,@Value("35") int age,@Value("male") String gender) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Barber [name=" + name + ", exp=" + exp + ", salary=" + salary + ", age=" + age + ", contactNo="
				+ contactNo + ", gender=" + gender + "]";
	}

}