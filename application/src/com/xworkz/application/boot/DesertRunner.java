package com.xworkz.application.boot;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.exeception.*;
import com.xworkz.application.repository.DesertRepository;
import com.xworkz.application.repository.DesertRepositoryImpl;
import com.xworkz.application.service.DesertService;
import com.xworkz.application.service.DesertServiceImpl;

public class DesertRunner {

	public static void main(String[] args) {
		DesertDTO dto = new DesertDTO(1, "Antarctic Desert", "Antartica", "142*100000", 42, 64);
		DesertRepository repository = new DesertRepositoryImpl();
		DesertService service = new DesertServiceImpl(repository);

		DesertDTO dto1 = new DesertDTO(2, "Artic Desert", "Northern America", "13,900,000", 16, 45);
		DesertDTO dto2 = new DesertDTO(3, "Sahara Desert", "Africa", "9,200,000", 30, 58);
		DesertDTO dto3 = new DesertDTO(4, "Great Australian", "Australia", "2,700,000", 23, 40);
		DesertDTO dto4 = new DesertDTO(5, "Arabian Desert", "Western Asia", "2,330,000", 20, 48);
		DesertDTO dto5 = new DesertDTO(6, "Gobi Desert", "China and Mongolia", "1,295,000", 25, 38);
		DesertDTO dto6 = new DesertDTO(7, "Kalahari Desert", "Southern Africa", "900,000", 35, 45);
		DesertDTO dto7 = new DesertDTO(8, "Patagonian Desert", "Argentina", "673,000", 13, 34);
		DesertDTO dto8 = new DesertDTO(9, "Syrian Desert", "Syria", "500,000", 29, 35);
		DesertDTO dto9 = new DesertDTO(10, "Great Basin", "Northern America", "492,098", 35, 45);
		DesertDTO dto10 = new DesertDTO(11, "Chihuahuan Desert", "Northern America", "453,248", 32, 44);
		DesertDTO dto11 = new DesertDTO(12, "Karakum Desert", "Turkmenistan", "350,000", 33, 46);
		DesertDTO dto12 = new DesertDTO(13, "Great Victoria", "Australia", "348,750", 21, 40);
		DesertDTO dto13 = new DesertDTO(14, "Colorado Plateau", "Northern America", "337000", 22, 45);
		DesertDTO dto14 = new DesertDTO(15, "Sonoran Desert", "Mexico", "310000", 28, 46);
		DesertDTO dto15 = new DesertDTO(16, "Kyzylkum Desert", "Turkmenistan and Uzbekistan", "300300", 24, 48);
		DesertDTO dto16 = new DesertDTO(17, "Taklamakan Desert", "China", "270000", 25, 45);
		DesertDTO dto17 = new DesertDTO(18, "Ogden Desert", "Eastern Africa", "256000", 32, 52);
		DesertDTO dto18 = new DesertDTO(19, "Thar Desert", "India", "238,254", 33, 50);
		DesertDTO dto19 = new DesertDTO(20, "Puntland Desert", "Somalia", "200200", 25, 38);
		DesertDTO dto20 = new DesertDTO(21, "Ustyurt Plateau", "Uzbekistan", "2000000", 25, 45);
		DesertDTO dto21 = new DesertDTO(22, "Guban Desert", "Somalia", "175000", 32, 52);
		DesertDTO dto22 = new DesertDTO(23, "Namib Desert", "South Africa", "160000", 33, 55);
		DesertDTO dto23 = new DesertDTO(24, "Registan Desert", "Afghanistan", "146000", 28, 42);

		try {

			boolean save = service.validateAndThenSave(dto);
			System.out.println("Saved:" + save);
			System.out.println("***************************");

			boolean save1 = service.validateAndThenSave(dto1);
			System.out.println("Saved:" + save1);
			System.out.println("***************************");

			boolean save2 = service.validateAndThenSave(dto2);
			System.out.println("Saved:" + save2);
			System.out.println("***************************");

			boolean save3 = service.validateAndThenSave(dto3);
			System.out.println("Saved:" + save3);
			System.out.println("***************************");

			boolean save4 = service.validateAndThenSave(dto4);
			System.out.println("Saved:" + save4);
			System.out.println("***************************");

			boolean save5 = service.validateAndThenSave(dto5);
			System.out.println("Saved:" + save5);
			System.out.println("***************************");

			boolean save6 = service.validateAndThenSave(dto6);
			System.out.println("Saved:" + save6);
			System.out.println("***************************");

			boolean save7 = service.validateAndThenSave(dto7);
			System.out.println("Saved:" + save7);
			System.out.println("**************************");

			boolean save8 = service.validateAndThenSave(dto8);
			System.out.println("Saved:" + save8);
			System.out.println("***************************");

			boolean save9 = service.validateAndThenSave(dto9);
			System.out.println("Saved:" + save9);
			System.out.println("***************************");

			boolean save10 = service.validateAndThenSave(dto10);
			System.out.println("Saved:" + save10);
			System.out.println("***************************");

			boolean save11 = service.validateAndThenSave(dto11);
			System.out.println("Saved:" + save11);
			System.out.println("***************************");

			boolean save12 = service.validateAndThenSave(dto12);
			System.out.println("Saved:" + save12);
			System.out.println("***************************");

			boolean save13 = service.validateAndThenSave(dto13);
			System.out.println("Saved:" + save13);
			System.out.println("***************************");

			boolean save14 = service.validateAndThenSave(dto14);
			System.out.println("Saved:" + save14);
			System.out.println("***************************");

			boolean save15 = service.validateAndThenSave(dto15);
			System.out.println("Saved:" + save15);
			System.out.println("***************************");

			boolean save16 = service.validateAndThenSave(dto16);
			System.out.println("Saved:" + save16);
			System.out.println("***************************");

			boolean save17 = service.validateAndThenSave(dto17);
			System.out.println("Saved:" + save17);
			System.out.println("***************************");

			boolean save18 = service.validateAndThenSave(dto18);
			System.out.println("Saved:" + save18);
			System.out.println("***************************");

			boolean save20 = service.validateAndThenSave(dto20);
			System.out.println("Saved:" + save20);
			System.out.println("***************************");

			boolean save21 = service.validateAndThenSave(dto21);
			System.out.println("Saved:" + save21);
			System.out.println("***************************");

			boolean save22 = service.validateAndThenSave(dto22);
			System.out.println("Saved:" + save22);
			System.out.println("***************************");

			boolean save23 = service.validateAndThenSave(dto23);
			System.out.println("Saved:" + save23);
			System.out.println("***************************");
			System.out.println("Total Saved" + service.getTotal());

			DesertDTO findRef = service.find(dto22);
			System.out.println("findRef" + findRef);

			DesertDTO findByNAmeRef = service.findByName("");
			System.out.println("findByNAmeRef" + findByNAmeRef);

			System.out.println("after findByNAmeRef");

		} catch (InvalidDataDesertException e) {
			System.err.println(e.getMessage());
		}
		System.out.println(service.getTotal());

	}

}