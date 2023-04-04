package com.xworkz.application.boot;

import java.time.LocalDate;


import com.xworkz.application.dto.EducationDTO;
import com.xworkz.application.exeception.*;
import com.xworkz.application.exeception.*;
import com.xworkz.application.repository.EducationRepository;
import com.xworkz.application.repository.EducationRepositoryImpl;
import com.xworkz.application.service.EducationService;
import com.xworkz.application.service.EducationServiceImpl;

public class EducationRunner {

	public static void main(String[] args) {
		EducationDTO dto = new EducationDTO(1, "BE", 65, "VTU", LocalDate.of(2022, 11, 15), LocalDate.of(2023, 4, 2), 1,
				"MEch", "sanket");

		EducationRepository repository = new EducationRepositoryImpl();
		EducationService service = new EducationServiceImpl(repository);

		EducationDTO dto1 = new EducationDTO(1, "Msc", 63, "vtu", LocalDate.of(2022, 11, 15), LocalDate.of(2023, 4, 2),
				1, "General", "vishal");

		EducationService service1 = new EducationServiceImpl(repository);

		EducationDTO dto2 = new EducationDTO(1, "BE", 46, "BTVU", LocalDate.of(2022, 11, 15), LocalDate.of(2023, 4, 2),
				2, "General", "mahesh");

		EducationService service2 = new EducationServiceImpl(repository);

		EducationDTO dto3 = new EducationDTO(1, "Mtech", 65, "RCU", LocalDate.of(2022, 05, 15),
				LocalDate.of(2023, 6, 8), 3, "General", "kiran");

		EducationService service3 = new EducationServiceImpl(repository);

		EducationDTO dto4 = new EducationDTO(1, "BA", 77, "RCU", LocalDate.of(2022, 11, 15), LocalDate.of(2023, 6, 8),
				4, "General", "suresh");

		EducationService service4 = new EducationServiceImpl(repository);

		EducationDTO dto5 = new EducationDTO(1, "ITI", 92, "RCU", LocalDate.of(2022, 11, 15), LocalDate.of(2023, 6, 8),
				5, "General", "shridher");

		EducationService service5 = new EducationServiceImpl(repository);

		EducationDTO dto6 = new EducationDTO(1, "Msc", 87, "RCU", LocalDate.of(2022, 11, 15), LocalDate.of(2023, 6, 8),
				6, "General", "kyarmal");

		EducationService service6 = new EducationServiceImpl(repository);

		EducationDTO dto7 = new EducationDTO(1, "BA", 60, "RCU", LocalDate.of(2022, 11, 15), LocalDate.of(2023, 4, 2),
				7, "General", "chetan");

		EducationService service7 = new EducationServiceImpl(repository);

		EducationDTO dto8 = new EducationDTO(1, "BA", 55, "VTU", LocalDate.of(2022, 11, 12), LocalDate.of(2023, 4, 2),
				8, "General", "rakesh");

		EducationService service8 = new EducationServiceImpl(repository);

		EducationDTO dto9 = new EducationDTO(1, "BE", 56, "RCU", LocalDate.of(2022, 11, 15), LocalDate.of(2023, 4, 2),
				9, "General", "annesh");

		EducationService service9 = new EducationServiceImpl(repository);

		EducationDTO dto10 = new EducationDTO(1, "BA", 70, "RCU", LocalDate.of(2022, 06, 15), LocalDate.of(2023, 4, 2),
				10, "General", "basavaraj");

		EducationService service10 = new EducationServiceImpl(repository);

		EducationDTO dto11 = new EducationDTO(1, "MBA", 88, "VTU", LocalDate.of(2022, 11, 15), LocalDate.of(2023, 6, 8),
				11, "General", "laxmi");

		EducationService service11 = new EducationServiceImpl(repository);

		EducationDTO dto12 = new EducationDTO(1, "BE", 65, "VTU", LocalDate.of(2022, 11, 15), LocalDate.of(2023, 6, 8),
				12, "General", "bhavana");

		EducationService service12 = new EducationServiceImpl(repository);

		EducationDTO dto13 = new EducationDTO(1, "BA", 65, "RCU", LocalDate.of(2022, 11, 15), LocalDate.of(2023, 6, 8),
				13, "General", "sneha");

		EducationService service13 = new EducationServiceImpl(repository);

		EducationDTO dto14 = new EducationDTO(1, "BTech", 65, "RCU", LocalDate.of(2022, 11, 15),
				LocalDate.of(2023, 6, 8), 14, "General", "sumit");

		EducationService service14 = new EducationServiceImpl(repository);

		EducationDTO dto15 = new EducationDTO(1, "BA", 65, "RCU", LocalDate.of(2022, 11, 15), LocalDate.of(2023, 6, 8),
				15, "General", "sudhiksha");

		EducationService service15 = new EducationServiceImpl(repository);

		EducationDTO dto16 = new EducationDTO(1, "BA", 65, "RCU", LocalDate.of(2022, 11, 15), LocalDate.of(2023, 6, 8),
				16, "General", "pintu");

		EducationService service16 = new EducationServiceImpl(repository);

		EducationDTO dto17 = new EducationDTO(1, "BA", 65, "RCU", LocalDate.of(2022, 11, 15), LocalDate.of(2023, 6, 8),
				17, "General", "banti");

		EducationService service17 = new EducationServiceImpl(repository);

		EducationDTO dto18 = new EducationDTO(1, "BA", 65, "RCU", LocalDate.of(2022, 11, 15), LocalDate.of(2023, 6, 8),
				18, "General", "ponda");

		EducationService service18 = new EducationServiceImpl(repository);

		EducationDTO dto19 = new EducationDTO(1, "BA", 65, "RCU", LocalDate.of(2022, 11, 15), LocalDate.of(2023, 6, 8),
				19, "General", "akhilesh");

		EducationService service19 = new EducationServiceImpl(repository);

		EducationDTO dto20 = new EducationDTO(1, "BA", 65, "RCU", LocalDate.of(2022, 11, 15), LocalDate.of(2023, 6, 8),
				20, "General", "anny");

		EducationService service20 = new EducationServiceImpl(repository);
		try {

			boolean save = service.validateAndThenSave(dto);
			System.out.println("Save:" + save);
			System.out.println(service.find(dto));
			System.out.println(service.findByCandidateName("Annish"));
			System.out.println(service.findByCandidateNameAndUniversity("Annish", "BU..."));
			System.out
					.println(service.findBacklogByCandidateNameAndDegreeNameAndUniversity("Annish", "B.Tech", "BU..."));
			System.out.println(service.findbyCandidateNameAndStartDateAndEndDAte("Annish", LocalDate.of(2022, 12, 2),
					LocalDate.now()));
			System.out.println(service.findPercentageByCandidateName("Annesh"));
			System.out.println(
					service.findStreamByCandidateNameAndDegreeNameAndUniversity("Annish", "BE degree", "BU..."));
			System.out
					.println(service.findIdByCandidateNameAndDegreeNameAndUnivaersity("Annish", "BE degree", "BU..."));
			System.out.println(service.findUniversityByCandidateName("Annish"));
			System.out.println(service.getTotal());
			System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

			boolean save1 = service1.validateAndThenSave(dto1);
			System.out.println("Save:" + save1);
			System.out.println(service1.find(dto1));
			System.out.println(service1.findByCandidateName("Arjun"));
			System.out.println(service1.findByCandidateNameAndUniversity("Arjun", "Bangalore university"));
			System.out.println(service1.findBacklogByCandidateNameAndDegreeNameAndUniversity("Arjun", "Bcom",
					"Bangalore university"));
			System.out.println(service1.findbyCandidateNameAndStartDateAndEndDAte("Arjun", LocalDate.of(2022, 12, 2),
					LocalDate.now()));
			System.out.println(service1.findPercentageByCandidateName("Arjun"));
			System.out.println(service1.findStreamByCandidateNameAndDegreeNameAndUniversity("Raju", "Bcom",
					"Bangalore University"));
			System.out.println(
					service1.findIdByCandidateNameAndDegreeNameAndUnivaersity("Arjun", "Bcom", "Bangalore university"));
			System.out.println(service1.findUniversityByCandidateName("Arjun"));
			System.out.println(service1.getTotal());
			System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

			boolean save2 = service2.validateAndThenSave(dto2);
			System.out.println("Save:" + save2);
			System.out.println(service2.find(dto2));
			System.out.println(service2.findByCandidateName("Savita"));
			System.out.println(service2.findByCandidateNameAndUniversity("Savita", "BTVU"));
			System.out
					.println(service2.findBacklogByCandidateNameAndDegreeNameAndUniversity("Savita", "B.Tech", "BTVU"));
			System.out.println(service2.findbyCandidateNameAndStartDateAndEndDAte("Savita", LocalDate.of(2022, 12, 2),
					LocalDate.now()));
			System.out.println(service2.findPercentageByCandidateName("Savita"));
			System.out
					.println(service2.findStreamByCandidateNameAndDegreeNameAndUniversity("Savita", "B.Tech", "BTVU"));
			System.out.println(service2.findIdByCandidateNameAndDegreeNameAndUnivaersity("Savita", "B.Tech", "BTVU"));
			System.out.println(service2.findUniversityByCandidateName("Savita"));
			System.out.println(service2.getTotal());
			System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

			boolean save3 = service3.validateAndThenSave(dto3);
			System.out.println("Save:" + save3);
			System.out.println(service3.find(dto3));
			System.out.println(service3.findByCandidateName("Surab"));
			System.out.println(service3.findByCandidateNameAndUniversity("Surab", "RCU"));
			System.out.println(service3.findBacklogByCandidateNameAndDegreeNameAndUniversity("Surab", "Bsc", "RCU"));
			System.out.println(service3.findbyCandidateNameAndStartDateAndEndDAte("Surab", LocalDate.of(2022, 12, 2),
					LocalDate.now()));
			System.out.println(service3.findPercentageByCandidateName("Surab"));
			System.out.println(service3.findStreamByCandidateNameAndDegreeNameAndUniversity("Surab", "Bsc", "RCU"));
			System.out.println(service3.findIdByCandidateNameAndDegreeNameAndUnivaersity("Surab", "Bsc", "RCU"));
			System.out.println(service3.findUniversityByCandidateName("Surab"));
			System.out.println(service3.getTotal());
			System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||************************************************************************");

			boolean save4 = service4.validateAndThenSave(dto4);
			System.out.println("Save:" + save4);
			System.out.println(service4.find(dto4));
			System.out.println(service4.findByCandidateName("Sachin"));
			System.out.println(service4.findByCandidateNameAndUniversity("Sachin", "RCU"));
			System.out.println(service4.findBacklogByCandidateNameAndDegreeNameAndUniversity("Sachin", "BA", "RCU"));
			System.out.println(service4.findbyCandidateNameAndStartDateAndEndDAte("Sachin", LocalDate.of(2022, 12, 2),
					LocalDate.now()));
			System.out.println(service4.findPercentageByCandidateName("Sachin"));
			System.out.println(service4.findStreamByCandidateNameAndDegreeNameAndUniversity("Sachin", "BA", "RCU"));
			System.out.println(service4.findIdByCandidateNameAndDegreeNameAndUnivaersity("Sachin", "BA", "RCU"));
			System.out.println(service4.findUniversityByCandidateName("Sachin"));
			System.out.println(service4.getTotal());
			System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

			boolean save5 = service5.validateAndThenSave(dto5);
			System.out.println("Save:" + save5);
			System.out.println(service5.find(dto5));
			System.out.println(service5.findByCandidateName("Abhi"));
			System.out.println(service5.findByCandidateNameAndUniversity("Abhi", "RCU"));
			System.out.println(service5.findBacklogByCandidateNameAndDegreeNameAndUniversity("Abhi", "BA", "RCU"));
			System.out.println(service5.findbyCandidateNameAndStartDateAndEndDAte("Abhi", LocalDate.of(2022, 12, 2),
					LocalDate.now()));
			System.out.println(service5.findPercentageByCandidateName("Abhi"));
			System.out.println(service5.findStreamByCandidateNameAndDegreeNameAndUniversity("Abhi", "BA", "RCU"));
			System.out.println(service5.findIdByCandidateNameAndDegreeNameAndUnivaersity("Abhi", "BA", "RCU"));
			System.out.println(service5.findUniversityByCandidateName("Abhi"));
			System.out.println(service5.getTotal());
			System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

			boolean save6 = service6.validateAndThenSave(dto6);
			System.out.println("Save:" + save6);
			System.out.println(service6.find(dto6));
			System.out.println(service6.findByCandidateName("Anuj"));
			System.out.println(service6.findByCandidateNameAndUniversity("Anuj", "RCU"));
			System.out.println(service6.findBacklogByCandidateNameAndDegreeNameAndUniversity("Anuj", "BA", "RCU"));
			System.out.println(service6.findbyCandidateNameAndStartDateAndEndDAte("Anuj", LocalDate.of(2022, 12, 2),
					LocalDate.now()));
			System.out.println(service6.findPercentageByCandidateName("Anuj"));
			System.out.println(service6.findStreamByCandidateNameAndDegreeNameAndUniversity("Anuj", "BA", "RCU"));
			System.out.println(service6.findIdByCandidateNameAndDegreeNameAndUnivaersity("Anuj", "BA", "RCU"));
			System.out.println(service6.findUniversityByCandidateName("Anuj"));
			System.out.println(service6.getTotal());
			System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

			boolean save7 = service7.validateAndThenSave(dto7);
			System.out.println("Save:" + save7);
			System.out.println(service7.find(dto7));
			System.out.println(service7.findByCandidateName("Anasuy"));
			System.out.println(service7.findByCandidateNameAndUniversity("Anasuy", "RCU"));
			System.out.println(service7.findBacklogByCandidateNameAndDegreeNameAndUniversity("Anasuy", "BA", "RCU"));
			System.out.println(service7.findbyCandidateNameAndStartDateAndEndDAte("Anasuy", LocalDate.of(2022, 12, 2),
					LocalDate.now()));
			System.out.println(service7.findPercentageByCandidateName("Anasuy"));
			System.out.println(service7.findStreamByCandidateNameAndDegreeNameAndUniversity("Anasuy", "BA", "RCU"));
			System.out.println(service7.findIdByCandidateNameAndDegreeNameAndUnivaersity("Anasuy", "BA", "RCU"));
			System.out.println(service7.findUniversityByCandidateName("Anasuy"));
			System.out.println(service7.getTotal());
			System.out.println("************************************************************************");

			boolean save8 = service8.validateAndThenSave(dto8);
			System.out.println("Save:" + save8);
			System.out.println(service8.find(dto8));
			System.out.println(service8.findByCandidateName("Amit"));
			System.out.println(service8.findByCandidateNameAndUniversity("Amit", "RCU"));
			System.out.println(service8.findBacklogByCandidateNameAndDegreeNameAndUniversity("Amit", "BA", "RCU"));
			System.out.println(service8.findbyCandidateNameAndStartDateAndEndDAte("Amit", LocalDate.of(2022, 12, 2),
					LocalDate.now()));
			System.out.println(service8.findPercentageByCandidateName("Amit"));
			System.out.println(service8.findStreamByCandidateNameAndDegreeNameAndUniversity("Amit", "BA", "RCU"));
			System.out.println(service8.findIdByCandidateNameAndDegreeNameAndUnivaersity("Amit", "BA", "RCU"));
			System.out.println(service8.findUniversityByCandidateName("Amit"));
			System.out.println(service8.getTotal());
			System.out.println("************************************************************************");

			boolean save9 = service9.validateAndThenSave(dto9);
			System.out.println("Save:" + save9);
			System.out.println(service9.find(dto9));
			System.out.println(service9.findByCandidateName("Abhi"));
			System.out.println(service9.findByCandidateNameAndUniversity("Abhi", "RCU"));
			System.out.println(service9.findBacklogByCandidateNameAndDegreeNameAndUniversity("Arun", "BA", "RCU"));
			System.out.println(service9.findbyCandidateNameAndStartDateAndEndDAte("Abhi", LocalDate.of(2022, 12, 2),
					LocalDate.now()));
			System.out.println(service9.findPercentageByCandidateName("Abhi"));
			System.out.println(service9.findStreamByCandidateNameAndDegreeNameAndUniversity("Abhi", "BA", "RCU"));
			System.out.println(service9.findIdByCandidateNameAndDegreeNameAndUnivaersity("Abhi", "BA", "RCU"));
			System.out.println(service9.findUniversityByCandidateName("Abhi"));
			System.out.println(service9.getTotal());
			System.out.println("************************************************************************");

			boolean save10 = service10.validateAndThenSave(dto10);
			System.out.println("Save:" + save10);
			System.out.println(service10.find(dto10));
			System.out.println(service10.findByCandidateName("Basu"));
			System.out.println(service10.findByCandidateNameAndUniversity("Basu", "RCU"));
			System.out.println(service10.findBacklogByCandidateNameAndDegreeNameAndUniversity("Basu", "BA", "RCU"));
			System.out.println(service10.findbyCandidateNameAndStartDateAndEndDAte("Basu", LocalDate.of(2022, 12, 2),
					LocalDate.now()));
			System.out.println(service10.findPercentageByCandidateName("Basu"));
			System.out.println(service10.findStreamByCandidateNameAndDegreeNameAndUniversity("Basu", "BA", "RCU"));
			System.out.println(service10.findIdByCandidateNameAndDegreeNameAndUnivaersity("Basu", "BA", "RCU"));
			System.out.println(service10.findUniversityByCandidateName("Basu"));
			System.out.println(service10.getTotal());
			System.out.println("************************************************************************");

			boolean save11 = service11.validateAndThenSave(dto11);
			System.out.println("Save:" + save11);
			System.out.println(service11.find(dto11));
			System.out.println(service11.findByCandidateName("Rakesh"));
			System.out.println(service11.findByCandidateNameAndUniversity("Rakesh", "RCU"));
			System.out.println(
					service11.findBacklogByCandidateNameAndDegreeNameAndUniversity("Rakesh", "BA", "RCU"));
			System.out.println(service11.findbyCandidateNameAndStartDateAndEndDAte("Rakesh",
					LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service11.findPercentageByCandidateName("Rakesh"));
			System.out.println(
					service11.findStreamByCandidateNameAndDegreeNameAndUniversity("Rakesh", "BA", "RCU"));
			System.out.println(service11.findIdByCandidateNameAndDegreeNameAndUnivaersity("Rakesh", "BA", "RCU"));
			System.out.println(service11.findUniversityByCandidateName("Rakesh"));
			System.out.println(service11.getTotal());
			System.out.println("************************************************************************");

			boolean save12 = service12.validateAndThenSave(dto12);
			System.out.println("Save:" + save12);
			System.out.println(service12.find(dto12));
			System.out.println(service12.findByCandidateName("Bavya"));
			System.out.println(service12.findByCandidateNameAndUniversity("Bavya", "RCU"));
			System.out.println(service12.findBacklogByCandidateNameAndDegreeNameAndUniversity("Bavya", "BA", "RCU"));
			System.out.println(service12.findbyCandidateNameAndStartDateAndEndDAte("Bavya", LocalDate.of(2022, 12, 2),
					LocalDate.now()));
			System.out.println(service12.findPercentageByCandidateName("Bavya"));
			System.out.println(service12.findStreamByCandidateNameAndDegreeNameAndUniversity("Bavya", "BA", "RCU"));
			System.out.println(service12.findIdByCandidateNameAndDegreeNameAndUnivaersity("Bavya", "BA", "RCU"));
			System.out.println(service12.findUniversityByCandidateName("Bavya"));
			System.out.println(service12.getTotal());
			System.out.println("************************************************************************");

			boolean save13 = service13.validateAndThenSave(dto13);
			System.out.println("Save:" + save13);
			System.out.println(service13.find(dto13));
			System.out.println(service13.findByCandidateName("Bhavan"));
			System.out.println(service13.findByCandidateNameAndUniversity("Bhavan", "RCU"));
			System.out.println(service13.findBacklogByCandidateNameAndDegreeNameAndUniversity("Bhavan", "BA", "RCU"));
			System.out.println(service13.findbyCandidateNameAndStartDateAndEndDAte("Bhavan", LocalDate.of(2022, 12, 2),
					LocalDate.now()));
			System.out.println(service13.findPercentageByCandidateName("Bhavan"));
			System.out.println(service13.findStreamByCandidateNameAndDegreeNameAndUniversity("Bhavan", "BA", "RCU"));
			System.out.println(service13.findIdByCandidateNameAndDegreeNameAndUnivaersity("Bhavan", "BA", "RCU"));
			System.out.println(service13.findUniversityByCandidateName("Bhavan"));
			System.out.println(service13.getTotal());
			System.out.println("************************************************************************");

			boolean save14 = service14.validateAndThenSave(dto14);
			System.out.println("Save:" + save14);
			System.out.println(service14.find(dto14));
			System.out.println(service14.findByCandidateName("Bharat"));
			System.out.println(service14.findByCandidateNameAndUniversity("Bharat", "RCU"));
			System.out.println(service14.findBacklogByCandidateNameAndDegreeNameAndUniversity("Bharat", "BA", "RCU"));
			System.out.println(service14.findbyCandidateNameAndStartDateAndEndDAte("Bharat", LocalDate.of(2022, 12, 2),
					LocalDate.now()));
			System.out.println(service14.findPercentageByCandidateName("Bharat"));
			System.out.println(service14.findStreamByCandidateNameAndDegreeNameAndUniversity("Bharat", "BA", "RCU"));
			System.out.println(service14.findIdByCandidateNameAndDegreeNameAndUnivaersity("Bharat", "BA", "RCU"));
			System.out.println(service14.findUniversityByCandidateName("Bharat"));
			System.out.println(service14.getTotal());
			System.out.println("************************************************************************");

			boolean save15 = service15.validateAndThenSave(dto15);
			System.out.println("Save:" + save15);
			System.out.println(service15.find(dto15));
			System.out.println(service15.findByCandidateName("Adheera"));
			System.out.println(service15.findByCandidateNameAndUniversity("Adheera", "RCU"));
			System.out.println(service15.findBacklogByCandidateNameAndDegreeNameAndUniversity("Adheera", "BA", "RCU"));
			System.out.println(service15.findbyCandidateNameAndStartDateAndEndDAte("Adheera", LocalDate.of(2022, 12, 2),
					LocalDate.now()));
			System.out.println(service15.findPercentageByCandidateName("Adheera"));
			System.out.println(service15.findStreamByCandidateNameAndDegreeNameAndUniversity("Adheera", "BA", "RCU"));
			System.out.println(service15.findIdByCandidateNameAndDegreeNameAndUnivaersity("Adheera", "BA", "RCU"));
			System.out.println(service15.findUniversityByCandidateName("Adheera"));
			System.out.println(service15.getTotal());
			System.out.println("************************************************************************");

			boolean save16 = service16.validateAndThenSave(dto16);
			System.out.println("Save:" + save16);
			System.out.println(service16.find(dto16));
			System.out.println(service16.findByCandidateName("Sangeet"));
			System.out.println(service16.findByCandidateNameAndUniversity("Sangeet", "RCU"));
			System.out.println(service16.findBacklogByCandidateNameAndDegreeNameAndUniversity("Sangeet", "BA", "RCU"));
			System.out.println(service16.findbyCandidateNameAndStartDateAndEndDAte("Sangeet", LocalDate.of(2022, 12, 2),
					LocalDate.now()));
			System.out.println(service16.findPercentageByCandidateName("Sangeet"));
			System.out.println(service16.findStreamByCandidateNameAndDegreeNameAndUniversity("Sangeet", "BA", "RCU"));
			System.out.println(service16.findIdByCandidateNameAndDegreeNameAndUnivaersity("Sangeet", "BA", "RCU"));
			System.out.println(service16.findUniversityByCandidateName("Sangeet"));
			System.out.println(service16.getTotal());
			System.out.println("************************************************************************");

			boolean save17 = service17.validateAndThenSave(dto17);
			System.out.println("Save:" + save17);
			System.out.println(service17.find(dto17));
			System.out.println(service17.findByCandidateName("Charan"));
			System.out.println(service17.findByCandidateNameAndUniversity("Charan", "RCU"));
			System.out.println(service17.findBacklogByCandidateNameAndDegreeNameAndUniversity("Charan", "BA", "RCU"));
			System.out.println(service17.findbyCandidateNameAndStartDateAndEndDAte("Charan", LocalDate.of(2022, 12, 2),
					LocalDate.now()));
			System.out.println(service17.findPercentageByCandidateName("Charan"));
			System.out.println(service17.findStreamByCandidateNameAndDegreeNameAndUniversity("Charan", "BA", "RCU"));
			System.out.println(service17.findIdByCandidateNameAndDegreeNameAndUnivaersity("Charan", "BA", "RCU"));
			System.out.println(service17.findUniversityByCandidateName("Charan"));
			System.out.println(service17.getTotal());
			System.out.println("************************************************************************");

			boolean save18 = service18.validateAndThenSave(dto18);
			System.out.println("Save:" + save18);
			System.out.println(service18.find(dto18));
			System.out.println(service18.findByCandidateName("Dvani"));
			System.out.println(service18.findByCandidateNameAndUniversity("Dvani", "RCU"));
			System.out.println(service18.findBacklogByCandidateNameAndDegreeNameAndUniversity("Dvani", "BA", "RCU"));
			System.out.println(service18.findbyCandidateNameAndStartDateAndEndDAte("Dvani", LocalDate.of(2022, 12, 2),
					LocalDate.now()));
			System.out.println(service18.findPercentageByCandidateName("Dvani"));
			System.out.println(service18.findStreamByCandidateNameAndDegreeNameAndUniversity("Dvani", "BA", "RCU"));
			System.out.println(service18.findIdByCandidateNameAndDegreeNameAndUnivaersity("Dvani", "BA", "RCU"));
			System.out.println(service18.findUniversityByCandidateName("Dvani"));
			System.out.println(service18.getTotal());
			System.out.println("************************************************************************");

			boolean save19 = service19.validateAndThenSave(dto19);
			System.out.println("Save:" + save19);
			System.out.println(service19.find(dto19));
			System.out.println(service19.findByCandidateName("Ravi"));
			System.out.println(service19.findByCandidateNameAndUniversity("Ravi", "RCU"));
			System.out.println(service19.findBacklogByCandidateNameAndDegreeNameAndUniversity("Ravi", "BA", "RCU"));
			System.out.println(service19.findbyCandidateNameAndStartDateAndEndDAte("Ravi", LocalDate.of(2022, 12, 2),
					LocalDate.now()));
			System.out.println(service19.findPercentageByCandidateName("Ravi"));
			System.out.println(service19.findStreamByCandidateNameAndDegreeNameAndUniversity("Ravi", "BA", "RCU"));
			System.out.println(service19.findIdByCandidateNameAndDegreeNameAndUnivaersity("Ravi", "BA", "RCU"));
			System.out.println(service19.findUniversityByCandidateName("Ravi"));
			System.out.println(service19.getTotal());
			System.out.println("************************************************************************");

			boolean save20 = service20.validateAndThenSave(dto20);
			System.out.println("Save:" + save20);
			System.out.println(service20.find(dto20));
			System.out.println(service20.findByCandidateName("Veenam"));
			System.out.println(service20.findByCandidateNameAndUniversity("Veenam", "RCU"));
			System.out.println(service20.findBacklogByCandidateNameAndDegreeNameAndUniversity("Veenam", "BA", "RCU"));
			System.out.println(service20.findbyCandidateNameAndStartDateAndEndDAte("Veenam",
					LocalDate.of(2022, 12, 2), LocalDate.now()));
			System.out.println(service20.findPercentageByCandidateName("Veenam"));
			System.out.println(service20.findStreamByCandidateNameAndDegreeNameAndUniversity("Veenam", "BA", "RCU"));
			System.out.println(service20.findIdByCandidateNameAndDegreeNameAndUnivaersity("Veenam", "BA", "RCU"));
			System.out.println(service20.findUniversityByCandidateName("Veenam"));
			System.out.println(service20.getTotal());
			System.out.println("************************************************************************");

		} catch (InvalidEducationException e) {
			e.getMessage();
		} catch (EducationMemoryFullException e) {
			e.getMessage();
		}

	}

}
