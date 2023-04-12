package com.xworkz.application.repository;

import com.xworkz.application.dto.HomeDTO;
import com.xworkz.application.exeception.MemoryfullHomeExeption;

public class HomeRepositoryImpl implements HomeRepository{

	private HomeDTO[] ref = new HomeDTO[2];
	private int index=0;
	
	@Override
	public boolean save(HomeDTO dto) {
		if(this.index<this.ref.length) {
			this.ref[index]=dto;
			this.index++;
			System.out.println("DTO at index"+index+" "+dto);
			return true;
		}
		System.err.println("memory is full..cant add more files..max allowed is 2");
		throw new MemoryfullHomeExeption("memory is full..cant add more files..max allowed is 2");
	}

}