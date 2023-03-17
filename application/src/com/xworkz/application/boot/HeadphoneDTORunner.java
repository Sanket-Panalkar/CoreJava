package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.constant.Brand;
import com.xworkz.application.constant.Color;
import com.xworkz.application.constant.TypeAndWeight;
import com.xworkz.application.dto.HeadphoneDTO;
import com.xworkz.application.service.HeadphoneService;
import com.xworkz.application.service.HeadphoneServiceImpl;

public class HeadphoneDTORunner {

	public static void main(String[] args) {

		HeadphoneDTO headphoneDTO = new HeadphoneDTO(Brand.MI, "SDYUF76G", 20.00, true, Color.GOLDEN,
				TypeAndWeight.WIRED, "Sanket Panalkar", 58, LocalDate.of(2017, 5, 18), 3);    
		
		String data = headphoneDTO.toString();
		
		System.out.println(data);
		
		HeadphoneService ref = new HeadphoneServiceImpl();
		          boolean newRef = ref.validateAndSave(headphoneDTO);
		          System.out.println(newRef);
	}
}
