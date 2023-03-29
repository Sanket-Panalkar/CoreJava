package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.dto.FestivalDTO;
import com.xworkz.application.exeception.InvalidFestivalException;
import com.xworkz.application.repository.FestivalRepositoy;
import com.xworkz.application.util.FestivalValidUtil;

public class FestivalServiceImpl implements FestivalService{
	
	private FestivalRepositoy festivalRepositoy;
	
	public FestivalServiceImpl(FestivalRepositoy festivalRepositoy) {
		this.festivalRepositoy=festivalRepositoy;
	}
	
	@Override
	public boolean validateAndThenSave(FestivalDTO dto) throws InvalidFestivalException {
		
		if(dto!=null) {
			System.out.println("dto is not null, we can validate the properties..");
			int id = dto.getId();
			String name = dto.getName();
			LocalDate startDate = dto.getStartDate();
			LocalDate endDate = dto.getEndDate();
			String sweet = dto.getSweet();
			String godName = dto.getGodName();

			boolean validId = false;
			boolean validName = false;
			boolean validStartDate = false;
			boolean validEndDate = false;
			boolean validSweet = false;
			boolean validGodName = false;

			if (id > 0 && id < 10) {
				System.out.println("id is valid..");
				validId = true;
			} else {
				System.err.println("id is invalid..");
			}

			if (FestivalValidUtil.validString(name)) {
				System.out.println("name is valid..");
				validName = true;
			} else {
				System.err.println("name is invalid..");
			}

			if (FestivalValidUtil.validDate(startDate)) {
				System.out.println("startDate is valid..");
				validStartDate = true;
			} else {
				System.err.println("start date is not valid..");
			}

			if (FestivalValidUtil.validDate(endDate)) {
				System.out.println("EndDate is valid");
				validEndDate = true;
			} else {
				System.err.println("EndDate is invalid");
			}
			if (FestivalValidUtil.validString(sweet)) {
				System.out.println("Valid sweet");
				validSweet = true;
			} else {
				System.err.println("Invalid sweet");
			}
			if (FestivalValidUtil.validString(godName)) {
				System.out.println("Valid GodName");
				validGodName = true;
			} else {
				System.err.println("Invalid GodName");
			}
			if (FestivalValidUtil.validFlag(validId,validName,validStartDate,validEndDate,validSweet,validGodName)) {
				System.out.println("Validation done saved");
				boolean save=this.festivalRepositoy.save(dto);
				return save;
				
			} else {
				
				throw new InvalidFestivalException("string should not be null..");
			}


		}else {     
		System.out.println("DTO is null so dont validate");
		}
		
		return false;
	}

	

	
}







