package com.xworkz.application.repository;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.exeception.*;

public class DesertRepositoryImpl implements DesertRepository {
	private DesertDTO[] value = new DesertDTO[23];
	private int indexValue = 0;

	@Override
	public boolean save(DesertDTO dto) {
		if (this.indexValue < this.value.length) {
			this.value[indexValue] = dto;
			this.indexValue++;
			System.out.println("Index value is " + this.indexValue + " " + dto);
			return true;
		} else {
			System.out.println("Memory is full,cannot add more files,max allowed is 23");
			throw new DesertMemoryFullException("Memory is full,cannot add more files,max allowed is 23");
		}

	}

	@Override
	public boolean isExist(DesertDTO dto) {
		if (indexValue == 0) {
			System.out.println("First value will not check");
			return false;
		}
		System.out.println("First value onwards check");
		for (int i = 0; i < this.indexValue; i++) {
			DesertDTO temp = this.value[i];
			if (temp.equals(dto)) {
				System.out.println("Dto is already exist");
				return true;
			}

		}
		return DesertRepository.super.isExist(dto);
	}

	@Override
	public DesertDTO find(DesertDTO dto) {
		for (int i = 0; i < this.indexValue; i++) {
			DesertDTO temp = value[i];
			if (temp.equals(dto)) {
				return temp;
			}
		}
		return DesertRepository.super.find(dto);
	}

	@Override
	public DesertDTO findByName(String name) {
		for (int i = 0; i < this.indexValue; i++) {
			String findName = value[i].getName();
			if (findName.equals(name)) {
				return value[i];
			}
		}
		return DesertRepository.super.findByName(name);
	}

	@Override
	public String findAreaByName(String name) {
		for (int i = 0; i < this.indexValue; i++) {
			String areaByName = value[i].getName();
			if (areaByName.equals(name)) {
				return value[i].getArea();
			}
		}
		return DesertRepository.super.findAreaByName(name);
	}

	@Override
	public DesertDTO findByNameAndCountryAndArea(String name, String country, String area) {
		for (int i = 0; i < this.indexValue; i++) {
			String nam = value[i].getName();
			String coun = value[i].getCountry();
			String ar = value[i].getArea();
			if (nam.equals(name) && coun.equals(country) && ar.equals(area)) {
				return value[i];
			}
		}
		return DesertRepository.super.findByNameAndCountryAndArea(name, country, area);
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return this.indexValue;
	}

}