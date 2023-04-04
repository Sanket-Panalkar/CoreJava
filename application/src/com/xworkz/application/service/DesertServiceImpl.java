package com.xworkz.application.service;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.exeception.*;
import com.xworkz.application.repository.DesertRepository;

import static com.xworkz.application.util.DesertValidUtil.*;

public class DesertServiceImpl implements DesertService{
	private DesertRepository desertRepository;
	
	public DesertServiceImpl(DesertRepository desertRepository) {
		this.desertRepository=desertRepository;
	}
	@Override
	public boolean validateAndThenSave(DesertDTO dto) throws InvalidDataDesertException{
		if(dto!=null) {
			System.out.println("dto is not null so validate");
			int id=dto.getId();
			String name=dto.getName();
			String country=dto.getCountry();
			String area=dto.getArea();
			int minTemp=dto.getMinTemp();
			int maxTemp=dto.getMaxTemp();
			
			boolean validId=false;
			boolean validName=false;
			boolean validCountry=false;
			boolean validArea=false;
			boolean validMinTemp=false;
			boolean validMaxTemp=false;
			
			if(validInt(id)) {
				System.out.println("Valid ID");
				validId=true;
			}else {
				System.err.println("Invalid ID");
			}
			if(validString(name)) {
				System.out.println("Valid Name");
				validName=true;
			}else {
				System.err.println("Invalid Name");
			}
			if(validString(country)) {
				System.out.println("Valid Country");
				validCountry=true;
			}else {
				System.err.println("Invalid Country");
			}
			if(validString(area)) {
				System.out.println("Valid Area");
				validArea=true;
			}else {
				System.err.println("Invalid Area");
			}
			if(validInt(minTemp)) {
				System.out.println("Valid minTemp");
				validMinTemp=true;
			}else {
				System.err.println("Invalid minTemp");
			}
			if(validInt(maxTemp)) {
				System.out.println("Valid maxTemp");
				validMaxTemp=true;
			}else {
				System.err.println("Invalid maxTemp");
			}
			if(validFlag(validId,validName,validCountry,validArea,validMinTemp,validMaxTemp)) {
				System.out.println("Validation done so save");
				boolean exist=this.desertRepository.isExist(dto);
				if(!exist) {
					boolean save=this.desertRepository.save(dto);
					System.out.println("DTO is not duplicate so save");
					return save;
				}else {
					System.err.println("Dto is duplicate so dont save");
					throw new InvalidDataDesertException("Data is invalid");
				}
				
			}else {
				System.err.println("Validation not dont so dont save");
			}
			
		}else {
			System.err.println("Dto is null so dont save");
		}
		return false;
	}
	@Override
	public DesertDTO find(DesertDTO dto) throws InvalidDataDesertException{
		if(dto!=null) {
			DesertDTO fin=this.desertRepository.find(dto);
			return fin;
		}
		throw new InvalidDataDesertException("Data Invalid Exception:Passing invalid data");
	}
	@Override
	public DesertDTO findByName(String name) throws InvalidDataDesertException {
		if(validString(name)) {
			DesertDTO byName=this.desertRepository.findByName(name);
			return byName;
		}
		throw new InvalidDataDesertException("Data Invalid Exception:Passing invalid name");
	}
	@Override
	public String findAreaByName(String name) throws InvalidDataDesertException {
		if(validString(name)) {
			String areaByName=this.desertRepository.findAreaByName(name);
			return areaByName;
		}
		throw new InvalidDataDesertException("Data Invalid Exception:Passing invalid area by name");
	}
	@Override
	public DesertDTO findByNameAndCountryAndArea(String name, String country, String area) throws InvalidDataDesertException{
		if(validString(name) && validString(country) && validString(area)) {
			DesertDTO ref=this.desertRepository.findByNameAndCountryAndArea(name, country, area);
			return ref;
		}
		throw new InvalidDataDesertException("Data Invalid Exception:Passing invalid data's");
	}
	@Override
	public int getTotal() {
		// TODO Auto-generated method stub
		return this.desertRepository.total();
	}

}