package com.xworkz.app.boot;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import com.xworkz.app.Type;
import com.xworkz.app.dto.SnakeDTO;
import com.xworkz.app.repository.SnakeRepository;
import com.xworkz.app.repository.SnakeRepositoryImpl;
import com.xworkz.app.service.SnakeService;
import com.xworkz.app.service.SnakeServiceImpl;

public class SnakeRunner {

	public static void main(String[] args) {
		SnakeDTO dto1 = new SnakeDTO(1, "Kobra", Type.VENOMOUS, "Karnataka");
		SnakeDTO dto2 = new SnakeDTO(2, "Vipers", Type.VENOMOUS, "Hariyana");
		SnakeDTO dto3 = new SnakeDTO(3, "Krait", Type.NON_VENOMOUS, "UP");
		SnakeDTO dto4 = new SnakeDTO(4, "Lycodon", Type.VENOMOUS, "Delhi");
		SnakeDTO dto5 = new SnakeDTO(5, "Kari", Type.NON_VENOMOUS, "Karnataka");

		Collection<SnakeDTO> snakeDTOs = new ArrayList<>();
		snakeDTOs.add(dto1);
		snakeDTOs.add(dto2);
		snakeDTOs.add(dto3);
		snakeDTOs.add(dto4);
		snakeDTOs.add(dto5);

		SnakeRepository repository = new SnakeRepositoryImpl();
		SnakeService service = new SnakeServiceImpl(repository);

		boolean save1 = service.validateAndSave(dto1);
		System.out.println("Saved:" + save1);

		boolean save2 = service.validateAndSave(dto2);
		System.out.println("Saved:" + save2);

		boolean save3 = service.validateAndSave(dto3);
		System.out.println("Saved:" + save3);

		boolean save4 = service.validateAndSave(dto4);
		System.out.println("Saved:" + save4);

		boolean save5 = service.validateAndSave(dto5);
		System.out.println("Saved:" + save5 + "\n");

		Optional<SnakeDTO> optionalById = service.findById(6);

		if (optionalById.isPresent()) {
			System.out.println("Snake Exists");
			SnakeDTO optional = optionalById.get();
			System.out.println(optional);
		} else {
			System.out.println("Snake does not exist");
		}  
	}     
           
}          