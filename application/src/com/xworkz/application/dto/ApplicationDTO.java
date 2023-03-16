package com.xworkz.application.dto.things;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class ApplicationDTO implements Serializable {

	private String name;
	private double length;
	private String owner;
	private String avilable;
	private LocalDate attDate;

	public ApplicationDTO() {
		System.out.println("no arg constructor in ApplicationDTO");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getAvilable() {
		return avilable;
	}

	public void setAvilable(String avilable) {
		this.avilable = avilable;
	}

	public LocalDate getAttDate() {
		return attDate;
	}

	public void setAttDate(LocalDate attDate) {
		this.attDate = attDate;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", length=" + length + ", owner=" + owner + ", avilable=" + avilable
				+ ", attDate=" + attDate + ", getName()=" + getName() + ", getLength()=" + getLength() + ", getOwner()="
				+ getOwner() + ", getAvilable()=" + getAvilable() + ", getAttDate()=" + getAttDate() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(attDate, avilable, length, name, owner);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationDTO other = (ApplicationDTO) obj;
		return Objects.equals(attDate, other.attDate) && Objects.equals(avilable, other.avilable)
				&& Double.doubleToLongBits(length) == Double.doubleToLongBits(other.length)
				&& Objects.equals(name, other.name) && Objects.equals(owner, other.owner);
	}

}
