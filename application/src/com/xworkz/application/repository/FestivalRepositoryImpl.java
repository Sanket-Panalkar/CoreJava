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
		} else {
			throw new FestivalMemoryFullExeception("Memory is full,so max allowed is 3...");
		}

	}

	@Override
	public boolean isExist(FestivalDTO dto) {
		if (valueIndex == 0) {
			System.out.println("first element will not check..");
			return false;
		} else {
			System.out.println("first element onverds check..");
			for (int i = 0; i < this.valueIndex; i++) {
				FestivalDTO temp = value[i];

				if (temp.equals(dto)) {  
					System.out.println("dto allredy exists..");
					return true;
				}
			}
		}
		return FestivalRepositoy.super.isExist(dto);
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return this.valueIndex;
	}

}
