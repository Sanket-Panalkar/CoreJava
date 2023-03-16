package com.xworkz.application.dto.things;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Attendence implements Serializable{

	private String name ;
	private LocalDate date;
	private String version ;
	private double size ;
	
	public Attendence() {
		System.out.println("no arg const---");
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		return this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
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
		return "Attendence [name=" + name + ", date=" + date + ", version=" + version + ", size=" + size + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, name, size, version);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)	
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Attendence other = (Attendence) obj;
		return Objects.equals(date, other.date) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(size) == Double.doubleToLongBits(other.size)
				&& Objects.equals(version, other.version);
	}
	
	
	 
	
}
