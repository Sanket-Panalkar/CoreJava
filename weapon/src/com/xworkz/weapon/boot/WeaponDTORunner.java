package com.xworkz.weapon.boot;

import java.time.LocalDate;

import com.xworkz.weapon.constant.Type;
import com.xworkz.weapon.dto.WeaponDTO;
import com.xworkz.weapon.service.WeaponService;
import com.xworkz.weapon.service.WeaponServiceImpl;

public class WeaponDTORunner {

	public static void main(String[] args) {
		
		System.out.println("Running weaponDTORunner---");
		
		WeaponDTO weapondto = new WeaponDTO(4,"AKM",Type.GUN,200d,"metal","INDIA","INDIA",LocalDate.now(),"Sanket",45d,"Army");
		
		System.out.println(weapondto.toString());
		
		WeaponService weaponservice = new WeaponServiceImpl();
		
		boolean saved = weaponservice.validateAndThenSave(weapondto);
		
		System.out.println(saved);
		
	}
	
	
	
}
