package com.xworkz.application.boot;

import com.xworkz.application.dto.HomeDTO;

import com.xworkz.application.exeception.InvalidDataHomeExeption;
import com.xworkz.application.exeception.MemoryfullHomeExeption;
import com.xworkz.application.repository.HomeRepository;
import com.xworkz.application.repository.HomeRepositoryImpl;
import com.xworkz.application.service.HomeService;
import com.xworkz.application.service.HomeServiceImpl;

public class HomeRunner {

	public static void main(String[] args) {

		try {

			HomeDTO homeDTO = new HomeDTO(20, "mudhol");
			HomeRepository repository = new HomeRepositoryImpl();
			HomeService service = new HomeServiceImpl(repository);
			boolean save1 = service.validateAndSave(homeDTO);

			System.out.println(save1);
			System.out.println("-------------------------------------------------------------");

			HomeDTO homeDTO1 = new HomeDTO(50, "lokapur");
			boolean save2 = service.validateAndSave(homeDTO1);
			System.out.println(save2);
			System.out.println("--------------------------------------------------------------");
			
			HomeDTO homeDTO3 = new HomeDTO(45, "benglor");
			boolean save3 = service.validateAndSave(homeDTO3);
			
			System.out.println(save3);
			System.out.println("--------------------------------------------------------------");

		} catch (InvalidDataHomeExeption e) {
			e.getMessage();
			
			
		} catch (MemoryfullHomeExeption e) {
			//e.printStackTrace();
			e.getMessage();
		}
		
	}
}
