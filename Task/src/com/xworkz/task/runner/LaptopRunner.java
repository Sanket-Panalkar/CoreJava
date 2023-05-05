package com.xworkz.task.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import com.xworkz.task.dto.LaptopDTO;
import com.xworkz.task.repository.LaptopRepository;
import com.xworkz.task.repository.LaptopRepositoryImpl;
import com.xworkz.task.service.LaptopService;
import com.xworkz.task.service.LaptopServiceImpl;

public class LaptopRunner {

	public static void main(String[] args) {
		
		LaptopDTO dto1  = new LaptopDTO("DELL","Dellinspiron",25000,"inspiron3505",18,2.5,6,8,"windows","ryzen 7");
		LaptopDTO dto2 = new LaptopDTO("HP", "HP Pavilion", 45000, "pavilion360", 15.6, 2.2, 8, 16, "Windows 10", "intel core i7");
		LaptopDTO dto3 = new LaptopDTO("Acer", "Acer Aspire 5", 55000, "aspire5A515-56", 15.6, 2.4, 16, 32, "Windows 11", "intel core i5");
		LaptopDTO dto4 = new LaptopDTO("Apple", "MacBook Pro", 120000, "M1", 13.3, 3.2, 16, 32, "macOS Big Sur", "Apple M1 chip");

		Collection<LaptopDTO> laptopDTOs = new ArrayList<>();
		
		laptopDTOs.add(dto1);
		laptopDTOs.add(dto2);
		laptopDTOs.add(dto3);
		laptopDTOs.add(dto4);
		
		LaptopRepository repository = new LaptopRepositoryImpl();
		
		LaptopService service = new LaptopServiceImpl(repository);
		
		boolean save1 = service.validateAndSave(dto1);
		System.out.println("Saved:" + save1);

		boolean save2 = service.validateAndSave(dto2);
		System.out.println("Saved:" + save2);

		boolean save3 = service.validateAndSave(dto3);
		System.out.println("Saved:" + save3);

		boolean save4 = service.validateAndSave(dto4);
		System.out.println("Saved:" + save4);

		Optional<LaptopDTO> optionalByName = service.findByName("Dellinspiron");

		if (optionalByName.isPresent()) {
			System.out.println("Laptop Exists");
			LaptopDTO optional = optionalByName.get();
			System.out.println(optional);
		} else {
			System.out.println("Laptop does not exist");
		} 
	}
}
