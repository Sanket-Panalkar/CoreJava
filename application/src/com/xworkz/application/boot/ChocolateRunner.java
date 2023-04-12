package com.xworkz.application.boot;

import com.xworkz.application.dto.ChocolateDTO;
import com.xworkz.application.exeception.InvalidDataChocolateExeption;
import com.xworkz.application.exeception.MemoryFullChocolateExeption;
import com.xworkz.application.repository.ChocolateRepository;
import com.xworkz.application.repository.ChocolateRepositoryImpl;
import com.xworkz.application.service.ChocolateServiceImpl;
import com.xworkz.application.service.ChololateService;

public class ChocolateRunner {

	public static void main(String[] args) {
		
		try {
			ChocolateDTO chocolateDTO = new ChocolateDTO("darymilk", 10, 35.0);
			ChocolateRepository repository = new ChocolateRepositoryImpl();
			ChololateService service = new ChocolateServiceImpl(repository);
			boolean save1 = service.validateAndSave(chocolateDTO);
			System.out.println(save1);
			System.out.println("------------------------------------------------------");

			ChocolateDTO chocolateDTO1 = new ChocolateDTO("kitkat", 20, 25.0);
			boolean save2 = service.validateAndSave(chocolateDTO1);
			System.out.println(save1);
			System.out.println("------------------------------------------------------");

			ChocolateDTO chocolateDTO3 = new ChocolateDTO("catbary", 15, 30.00);
			boolean save3 = service.validateAndSave(chocolateDTO3);
			System.out.println(save3);
			System.out.println("------------------------------------------------------");

			ChocolateDTO cholChocolateDTO4 = new ChocolateDTO("silk", 40, 22.00);
			boolean save4 = service.validateAndSave(cholChocolateDTO4);
			System.err.println(save4);
			System.out.println("------------------------------------------------------");

			
		} catch (InvalidDataChocolateExeption e) {
			e.getMessage();
		} catch (MemoryFullChocolateExeption e) {
			e.getMessage();
		}

			}
}
