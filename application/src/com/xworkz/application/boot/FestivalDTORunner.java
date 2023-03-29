package com.xworkz.application.boot;

import java.sql.Date;

import java.time.LocalDate;

import com.xworkz.application.dto.FestivalDTO;
import com.xworkz.application.exeception.FestivalMemoryFullExeception;
import com.xworkz.application.exeception.InvalidFestivalException;
import com.xworkz.application.repository.FestivalRepositoryImpl;
import com.xworkz.application.repository.FestivalRepositoy;
import com.xworkz.application.service.FestivalService;
import com.xworkz.application.service.FestivalServiceImpl;

public class FestivalDTORunner {

	public static void main(String[] args) {

		try {
			FestivalDTO festivalDTO = new FestivalDTO(5, "dipavali", LocalDate.now(), LocalDate.of(2022, 6, 8),
					"holige", "mahalaxmi");
			System.out.println(festivalDTO.toString());
			System.out.println(festivalDTO.hashCode());
			System.out.println(festivalDTO.equals(festivalDTO));

			FestivalRepositoy festivalRepositoy = new FestivalRepositoryImpl();

			FestivalService festivalService = new FestivalServiceImpl(festivalRepositoy);

			festivalService.validateAndThenSave(festivalDTO);
			System.out.println("*********************************************");

			FestivalDTO festivalDTO1 = new FestivalDTO(5, "dipavali", LocalDate.now(), LocalDate.of(2022, 6, 8),
					"holige", "mahalaxmi");
			System.out.println(festivalDTO1.toString());
			System.out.println(festivalDTO1.hashCode());
			System.out.println(festivalDTO1.equals(festivalDTO1));

			FestivalService festivalService1 = new FestivalServiceImpl(festivalRepositoy);

			festivalService.validateAndThenSave(festivalDTO1);
			System.out.println("*********************************************");

			FestivalDTO festivalDTO2 = new FestivalDTO(5, "dipavali", LocalDate.now(), LocalDate.of(2022, 6, 8),
					"holige", "mahalaxmi");
			System.out.println(festivalDTO2.toString());
			System.out.println(festivalDTO2.hashCode());
			System.out.println(festivalDTO2.equals(festivalDTO2));

			FestivalService festivalService2 = new FestivalServiceImpl(festivalRepositoy);

			festivalService.validateAndThenSave(festivalDTO2);
			System.out.println("*********************************************");

			FestivalDTO festivalDTO3 = new FestivalDTO(5, "dipavali", LocalDate.now(), LocalDate.of(2022, 6, 8),
					"holige", "mahalaxmi");
			System.out.println(festivalDTO3.toString());
			System.out.println(festivalDTO3.hashCode());
			System.out.println(festivalDTO3.equals(festivalDTO3));

			FestivalService festivalService3 = new FestivalServiceImpl(festivalRepositoy);

			festivalService.validateAndThenSave(festivalDTO3);
			System.out.println("*********************************************");

			FestivalDTO festivalDTO4 = new FestivalDTO(5, "dipavali", LocalDate.now(), LocalDate.of(2022, 6, 8),
					"holige", "mahalaxmi");
			System.out.println(festivalDTO4.toString());
			System.out.println(festivalDTO4.hashCode());
			System.out.println(festivalDTO4.equals(festivalDTO4));

			FestivalService festivalService4 = new FestivalServiceImpl(festivalRepositoy);

			festivalService.validateAndThenSave(festivalDTO);
			System.out.println("*********************************************");
		} catch (InvalidFestivalException e) {
			e.getMessage();
		}

	}
}
