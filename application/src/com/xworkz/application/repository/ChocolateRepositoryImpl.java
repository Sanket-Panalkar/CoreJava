package com.xworkz.application.repository;

import com.xworkz.application.dto.ChocolateDTO;
import com.xworkz.application.exeception.InvalidDataChocolateExeption;

public class ChocolateRepositoryImpl implements ChocolateRepository{

	private ChocolateDTO[] ref = new ChocolateDTO[3];
	private int index = 0;
	
	
	@Override
	public boolean save(ChocolateDTO dto) throws InvalidDataChocolateExeption {
		System.out.println("save method in cholcolateRepositoryImpl...");
		
		if(this.index<this.ref.length) {
		 this.ref[index]=dto;
		 this.index++;
		 System.out.println("dto at index"+index+" "+dto);
		 return true;
		}
		else {
			System.err.println("memory is full cant add more files, max allowed is 3");
		}
		return false;
	}
	
	@Override
	public boolean validateAndSave(ChocolateDTO dto) throws InvalidDataChocolateExeption {
		if(this.index<ref.length) {
			ref[index]= dto;
			this.index++;
			System.out.println("saving is correct..");
			return true;
		}
		else {
			System.err.println("memory is full, cant store..");
			throw new InvalidDataChocolateExeption("can't store, memory is full");
		}
	}
	
	@Override
	public boolean isExist(ChocolateDTO dto) {
		if(index==0) {
			System.out.println("can't check first element..");
		}else {
			System.out.println("onwerds first element..");
			for(int index=0; index<ref.length; index++) {
				ChocolateDTO temp = ref[index];
				if(temp!=null && temp.equals(dto)) {
					System.out.println("dto is exists..");
					return true;
				}
			}
		}
		
		return false;
	}
	
	@Override
	public ChocolateDTO findBybrand(String brand) throws InvalidDataChocolateExeption {
		for(int index=0; index<this.index; index++) {
			ChocolateDTO fine = this.ref[index];
			if(fine.equals(ref)) {
				return fine;
			}
		}
		return ChocolateRepository.super.findBybrand(brand);
	}

	@Override
	public ChocolateDTO findByBrandAndPrice(String brand, int price) throws InvalidDataChocolateExeption {
		for(int index=0; index<ref.length; index++) {
			
		}
		return ChocolateRepository.super.findByBrandAndPrice(brand, price);
	}
	
}
