package com.xworkz.task.dto;

import java.io.Serializable;
import java.util.Objects;

public class LaptopDTO implements Serializable,Comparable<LaptopDTO>{

	private String brand;
	private String name;
	private int price;
	private String model;
	private double screenSize;
	private double weight;
	private int batteryLife;
	private int RAM;
	private String OS;
	private String processor;

	public LaptopDTO(String brand, String name, int price, String model, double screenSize, double weight,
			int batteryLife, int rAM, String oS, String processor) {
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.model = model;
		this.screenSize = screenSize;
		this.weight = weight;
		this.batteryLife = batteryLife;
		RAM = rAM;
		OS = oS;
		this.processor = processor;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getBatteryLife() {
		return batteryLife;
	}

	public void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(OS, RAM, batteryLife, brand, model, name, price, processor, screenSize, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LaptopDTO other = (LaptopDTO) obj;
		return Objects.equals(OS, other.OS) && RAM == other.RAM && batteryLife == other.batteryLife
				&& Objects.equals(brand, other.brand) && Objects.equals(model, other.model)
				&& Objects.equals(name, other.name) && price == other.price
				&& Objects.equals(processor, other.processor)
				&& Double.doubleToLongBits(screenSize) == Double.doubleToLongBits(other.screenSize)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	@Override
	public String toString() {
		return "LaptopDTO [brand=" + brand + ", name=" + name + ", price=" + price + ", model=" + model
				+ ", screenSize=" + screenSize + ", weight=" + weight + ", batteryLife=" + batteryLife + ", RAM=" + RAM
				+ ", OS=" + OS + ", processor=" + processor + "]";
	}

	@Override
	public int compareTo(LaptopDTO o) {
		if(name!=null) {
			return this.getName().compareTo(o.getName());
		}
		return 0;
	}

}
