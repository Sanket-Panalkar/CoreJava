package com.xworkz.zpp.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class ShoeShowRoomDTO implements Serializable, Comparable<ShoeShowRoomDTO> {

	@Min(value = 0, message = "value should be gratter then 0")
	@Max(value = 100, message = "value should be less then 100")
	private int id;
	@Size(min = 2, max = 30, message = "value should be 2 and 30")
	private String name;
	@Size(min = 2, max = 30, message = "value should be 2 and 30")
	private String address;
	@Size(min = 2, max = 30, message = "value should be 2 and 30")
	private String gst;

	@Override
	public int compareTo(ShoeShowRoomDTO o) {
		return this.getName().compareTo(getName());
	}

}
