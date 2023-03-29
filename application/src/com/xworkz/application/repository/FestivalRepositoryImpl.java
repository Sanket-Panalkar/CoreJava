package com.xworkz.application.repository;

import com.xworkz.application.dto.FestivalDTO;
import com.xworkz.application.exeception.FestivalMemoryFullExeception;

public class FestivalRepositoryImpl implements FestivalRepositoy {

	private FestivalDTO[] value = new FestivalDTO[3];
	private int valueIndex = 0;

	@Override
	public boolean save(FestivalDTO dto) {
		if (valueIndex < value.length) {
			value[valueIndex] = dto;
			valueIndex++;
			System.out.println("Index value: " + this.valueIndex + " and values of " + dto);
			return true;
		}
		else {
			throw new FestivalMemoryFullExeception("Memory is full,so max allowed is 3...");
		}
		

	}

}
