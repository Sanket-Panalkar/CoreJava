package com.xworkz.object.things;

public class Coconut {

	private String name;
	private float size;
	private String color;
	private String origin;

	public void setName(String name) {
		this.name = name;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		System.out.println("toString() in COconut\n------------------");
		return "Name: " + this.name + "\nSize: " + size + "\ncolor: " + color + "\norigin: " + origin;
	}
}
