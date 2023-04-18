package com.xworkz.app.dto;

import java.io.Serializable;
import java.util.Objects;

public class HotelDTO implements Serializable,Comparable<HotelDTO>{

	private String name;
	private String place;
	private int flore;
	
	public HotelDTO(String name, String place, int flore) {
		super();
		this.name = name;
		this.place = place;
		this.flore = flore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getFlore() {
		return flore;
	}

	public void setFlore(int flore) {
		this.flore = flore;
	}

	@Override
	public String toString() {
		return "HotelDTO [name=" + name + ", place=" + place + ", flore=" + flore + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(flore, name, place);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelDTO other = (HotelDTO) obj;
		return flore == other.flore && Objects.equals(name, other.name) && Objects.equals(place, other.place);
	}

	@Override
	public int compareTo(HotelDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
