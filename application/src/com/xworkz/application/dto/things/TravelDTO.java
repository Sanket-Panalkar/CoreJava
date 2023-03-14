package com.xworkz.application.dto.things;

import java.io.Serializable;
import java.util.Objects;

public class TravelDTO implements Serializable {

	private String name ;
	private String owner ;
	private double version ;
	private double size ;
	
	public TravelDTO() {
		System.out.println("no arg const of Travel..");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Travel [name=" + name + ", owner=" + owner + ", version=" + version + ", size=" + size + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, owner, size, version);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TravelDTO other = (TravelDTO) obj;
		return Objects.equals(name, other.name) && Objects.equals(owner, other.owner)
				&& Double.doubleToLongBits(size) == Double.doubleToLongBits(other.size)
				&& Double.doubleToLongBits(version) == Double.doubleToLongBits(other.version);
	}
	
	
}
