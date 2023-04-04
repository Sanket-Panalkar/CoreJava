package com.xworkz.application.dto;

import java.io.Serializable;

public class DesertDTO implements Serializable{
	
	private int id;
	private String name;
	private String country;
	private String area;
	private int minTemp;
	private int maxTemp;
	
	public DesertDTO(int id, String name, String country, String area, int minTemp, int maxTemp) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.area = area;
		this.minTemp = minTemp;
		this.maxTemp = maxTemp;
	}

	@Override
	public String toString() {
		return "DesertDTO [id=" + id + ", name=" + name + ", country=" + country + ", area=" + area + ", minTemp="
				+ minTemp + ", maxTemp=" + maxTemp + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + id;
		result = prime * result + maxTemp;
		result = prime * result + minTemp;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof DesertDTO)) {
			return false;
		}
		DesertDTO other = (DesertDTO) obj;
		if (area == null) {
			if (other.area != null) {
				return false;
			}
		} else if (!area.equals(other.area)) {
			return false;
		}
		if (country == null) {
			if (other.country != null) {
				return false;
			}
		} else if (!country.equals(other.country)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (maxTemp != other.maxTemp) {
			return false;
		}
		if (minTemp != other.minTemp) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public String getArea() {
		return area;
	}

	public int getMinTemp() {
		return minTemp;
	}

	public int getMaxTemp() {
		return maxTemp;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setMinTemp(int minTemp) {
		this.minTemp = minTemp;
	}

	public void setMaxTemp(int maxTemp) {
		this.maxTemp = maxTemp;
	}
	
	
	

}