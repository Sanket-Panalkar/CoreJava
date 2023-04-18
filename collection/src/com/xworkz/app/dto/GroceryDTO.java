package com.xworkz.app.dto;

import java.io.Serializable;

import java.util.Objects;

public class GroceryDTO implements Serializable, Comparable<GroceryDTO>{

	private int id;
	private String name;
	private int quantity;
	public GroceryDTO(int id, String name, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "GroceryDTO [id=" + id + ", name=" + name + ", quantity=" + quantity + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, quantity);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryDTO other = (GroceryDTO) obj;
		return id == other.id && Objects.equals(name, other.name) && quantity == other.quantity;
	}
	@Override
	public int compareTo(GroceryDTO o) {
		
		return 0;
	}
	
	
}
