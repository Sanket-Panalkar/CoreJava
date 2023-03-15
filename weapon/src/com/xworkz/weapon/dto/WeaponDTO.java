package com.xworkz.weapon.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.xworkz.weapon.constant.Type;

public class WeaponDTO implements Serializable {

	private int id;
	private String name;
	private Type type;
	private double cost;
	private String material;
	private String madeBy;
	private String manufacturedBy;
	private LocalDate manufacturedYear;
	private String usedBy;
	private double weight;
	private String usedFor;

	public WeaponDTO() {
		System.out.println("running WeaponDTO...");
	}

	public WeaponDTO(int id, String name, Type type, double cost, String material, String madeBy, String manufacturedBy,
			LocalDate manufacturedYear, String usedBy, double weight, String usedFor) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.material = material;
		this.madeBy = madeBy;
		this.manufacturedBy = manufacturedBy;
		this.manufacturedYear = manufacturedYear;
		this.usedBy = usedBy;
		this.weight = weight;
		this.usedFor = usedFor;
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

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public String getManufacturedBy() {
		return manufacturedBy;
	}

	public void setManufacturedBy(String manufacturedBy) {
		this.manufacturedBy = manufacturedBy;
	}

	public LocalDate getManufacturedYear() {
		return manufacturedYear;
	}

	public void setManufacturedYear(LocalDate manufacturedYear) {
		this.manufacturedYear = manufacturedYear;
	}

	public String getUsedBy() {
		return usedBy;
	}

	public void setUsedBy(String usedBy) {
		this.usedBy = usedBy;
	}

	public double getWeaight() {
		return weight;
	}

	public void setWeaight(double weaight) {
		this.weight = weight;
	}

	public String getUsedFor() {
		return usedFor;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}

	@Override
	public String toString() {
		return "WeaponDTO [id=" + id + ", name=" + name + ", type=" + type + ", cost=" + cost + ", material=" + material
				+ ", madeBy=" + madeBy + ", manufacturedBy=" + manufacturedBy + ", manufacturedYear=" + manufacturedYear
				+ ", usedBy=" + usedBy + ", weight=" + weight + ", usedFor=" + usedFor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, id, madeBy, manufacturedBy, manufacturedYear, material, name, type, usedBy, usedFor,
				weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WeaponDTO other = (WeaponDTO) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && id == other.id
				&& Objects.equals(madeBy, other.madeBy) && Objects.equals(manufacturedBy, other.manufacturedBy)
				&& Objects.equals(manufacturedYear, other.manufacturedYear) && Objects.equals(material, other.material)
				&& Objects.equals(name, other.name) && type == other.type && Objects.equals(usedBy, other.usedBy)
				&& Objects.equals(usedFor, other.usedFor)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

}
