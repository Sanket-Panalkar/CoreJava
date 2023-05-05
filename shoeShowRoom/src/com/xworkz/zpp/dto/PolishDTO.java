package com.xworkz.zpp.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PolishDTO implements Serializable, Comparable<PolishDTO> {

	@Size(min = 2, max = 10, message = "value should be less the 10 and gretter then 2")
	private String brand;
	@Max(value = 0, message = "value should be greater then 0")
	@Min(value = 50, message = "value should be less then 50")
	private int price;

	@Override
	public int compareTo(PolishDTO o) {
		return this.getBrand().compareTo(getBrand());
	}

}
