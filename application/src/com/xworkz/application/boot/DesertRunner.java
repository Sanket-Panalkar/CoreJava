package com.xworkz.application.boot;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.exeception.*;
import com.xworkz.application.repository.DesertRepository;
import com.xworkz.application.repository.DesertRepositoryImpl;
import com.xworkz.application.service.DesertService;
import com.xworkz.application.service.DesertServiceImpl;

public class DesertRunner {

	public static void main(String[] args) {
		DesertDTO dto=new DesertDTO(1, "Antarctic Desert", "Antartica", "142*100000", 42, 64);
		DesertRepository repository=new DesertRepositoryImpl();
		DesertService service=new DesertServiceImpl(repository);
		
		DesertDTO dto1=new DesertDTO(2, "Artic Desert", "Northern America", "13,900,000", 16, 45);
		DesertService service1=new DesertServiceImpl(repository);
		
		DesertDTO dto2=new DesertDTO(3, "Sahara Desert", "Africa", "9,200,000", 30, 58);
		DesertService service2=new DesertServiceImpl(repository);
		
		DesertDTO dto3=new DesertDTO(4, "Great Australian", "Australia", "2,700,000", 23, 40);
		DesertService service3=new DesertServiceImpl(repository);
		
		DesertDTO dto4=new DesertDTO(5, "Arabian Desert", "Western Asia", "2,330,000", 20, 48);
		DesertService service4=new DesertServiceImpl(repository);
		
		DesertDTO dto5=new DesertDTO(6, "Gobi Desert","China and Mongolia", "1,295,000", 25, 38);
		DesertService service5=new DesertServiceImpl(repository);
		
		DesertDTO dto6=new DesertDTO(7, "Kalahari Desert","Southern Africa", "900,000", 35, 45);
		DesertService service6=new DesertServiceImpl(repository);
		
		DesertDTO dto7=new DesertDTO(8, "Patagonian Desert","Argentina", "673,000", 13, 34);
		DesertService service7=new DesertServiceImpl(repository);
		
		DesertDTO dto8=new DesertDTO(9, "Syrian Desert","Syria", "500,000", 29, 35);
		DesertService service8=new DesertServiceImpl(repository);
		
		DesertDTO dto9=new DesertDTO(10, "Great Basin","Northern America", "492,098", 35, 45);
		DesertService service9=new DesertServiceImpl(repository);
		
		DesertDTO dto10=new DesertDTO(11, "Chihuahuan Desert","Northern America", "453,248", 32, 44);
		DesertService service10=new DesertServiceImpl(repository);
		
		DesertDTO dto11=new DesertDTO(12, "Karakum Desert","Turkmenistan", "350,000", 33, 46);
		DesertService service11=new DesertServiceImpl(repository);
		
		DesertDTO dto12=new DesertDTO(13, "Great Victoria","Australia", "348,750", 21, 40);
		DesertService service12=new DesertServiceImpl(repository);
		
		DesertDTO dto13=new DesertDTO(14, "Colorado Plateau","Northern America", "337000", 22, 45);
		DesertService service13=new DesertServiceImpl(repository);
		
		DesertDTO dto14=new DesertDTO(15, "Sonoran Desert","Mexico", "310000", 28, 46);
		DesertService service14=new DesertServiceImpl(repository);
		
		DesertDTO dto15=new DesertDTO(16, "Kyzylkum Desert","Turkmenistan and Uzbekistan", "300300", 24, 48);
		DesertService service15=new DesertServiceImpl(repository);
		
		DesertDTO dto16=new DesertDTO(17, "Taklamakan Desert","China", "270000", 25, 45); 
		DesertService service16=new DesertServiceImpl(repository);
		
		DesertDTO dto17=new DesertDTO(18, "Ogden Desert","Eastern Africa", "256000", 32, 52); 
		DesertService service17=new DesertServiceImpl(repository);
		
		DesertDTO dto18=new DesertDTO(19, "Thar Desert","India", "238,254", 33, 50); 
		DesertService service18=new DesertServiceImpl(repository);
		
		DesertDTO dto19=new DesertDTO(20, "Puntland Desert","Somalia", "200200", 25, 38); 
		DesertService service19=new DesertServiceImpl(repository);
		
		DesertDTO dto20=new DesertDTO(21, "Ustyurt Plateau","Uzbekistan", "2000000", 25, 45); 
		DesertService service20=new DesertServiceImpl(repository);
		
		DesertDTO dto21=new DesertDTO(22, "Guban Desert","Somalia", "175000", 32, 52); 
		DesertService service21=new DesertServiceImpl(repository);
		
		DesertDTO dto22=new DesertDTO(23, "Namib Desert","South Africa", "160000", 33, 55); 
		DesertService service22=new DesertServiceImpl(repository);
		
		DesertDTO dto23=new DesertDTO(24, "Registan Desert","Afghanistan", "146000", 28, 42); 
		DesertService service23=new DesertServiceImpl(repository);
	try {
		
		boolean save=service.validateAndThenSave(dto);
		System.out.println("Saved:"+save);
		System.out.println(service.find(dto));
		System.out.println(service.findByName("Antarctic Desert"));
		System.out.println(service.findAreaByName("Antarctic Desert"));
		System.out.println(service.findByNameAndCountryAndArea("Antarctic Desert", "Syria", "142*100000"));
		System.out.println("***************************");
		
		
		boolean save1=service1.validateAndThenSave(dto1);
		System.out.println("Saved:"+save1);
		System.out.println(service1.find(dto1));
		System.out.println(service1.findByName("Artic Desert"));
		System.out.println(service1.findAreaByName("Artic Desert"));
		System.out.println(service1.findByNameAndCountryAndArea("Artic Desert", "Northern America", "13,900,000"));
		System.out.println("***************************");
		
		boolean save2=service2.validateAndThenSave(dto2);
		System.out.println("Saved:"+save2);
		System.out.println(service2.find(dto2));
		System.out.println(service2.findByName("Sahara Desert"));
		System.out.println(service2.findAreaByName("Sahara Desert"));
		System.out.println(service2.findByNameAndCountryAndArea("Sahara Desert", "Africa", "9,200,000"));
		System.out.println("***************************");
		
		boolean save3=service3.validateAndThenSave(dto3);
		System.out.println("Saved:"+save3);
		System.out.println(service3.find(dto3));
		System.out.println(service3.findByName("Great Australian"));
		System.out.println(service3.findAreaByName("Great Australian"));
		System.out.println(service3.findByNameAndCountryAndArea("Great Australian", "Australia", "2,700,000"));
		System.out.println("***************************");
		
		boolean save4=service4.validateAndThenSave(dto4);
		System.out.println("Saved:"+save4);
		System.out.println(service4.find(dto4));
		System.out.println(service4.findByName("Arabian Desert"));
		System.out.println(service4.findAreaByName("Arabian Desert"));
		System.out.println(service4.findByNameAndCountryAndArea("Arabian Desert", "Western Asia", "2,330,000"));
		System.out.println("***************************");
		
		boolean save5=service5.validateAndThenSave(dto5);
		System.out.println("Saved:"+save5);
		System.out.println(service5.find(dto5));
		System.out.println(service5.findByName("Gobi Desert"));
		System.out.println(service5.findAreaByName("Gobi Desert"));
		System.out.println(service5.findByNameAndCountryAndArea("Gobi Desert", "China and Mongolia", "1,295,000"));
		System.out.println("***************************");
		
		boolean save6=service6.validateAndThenSave(dto6);
		System.out.println("Saved:"+save6);
		System.out.println(service6.find(dto6));
		System.out.println(service6.findByName("Kalahari Desert"));
		System.out.println(service6.findAreaByName("Kalahari Desert"));
		System.out.println(service6.findByNameAndCountryAndArea("Kalahari Desert", "Southern Africa", "900,000"));
		System.out.println("***************************");
		
		boolean save7=service7.validateAndThenSave(dto7);
		System.out.println("Saved:"+save7);
		System.out.println(service7.find(dto7));
		System.out.println(service7.findByName("Patagonian Desert"));
		System.out.println(service7.findAreaByName("Patagonian Desert"));
		System.out.println(service7.findByNameAndCountryAndArea("Patagonian Desert", "Argentina", "673,000"));
		System.out.println("***************************");
		
		boolean save8=service8.validateAndThenSave(dto8);
		System.out.println("Saved:"+save8);
		System.out.println(service8.find(dto8));
		System.out.println(service8.findByName("Syrian Desert"));
		System.out.println(service8.findAreaByName("Syrian Desert"));
		System.out.println(service8.findByNameAndCountryAndArea("Syrian Desert", "Syria", "500,000"));
		System.out.println("***************************");
		

		boolean save9=service9.validateAndThenSave(dto9);
		System.out.println("Saved:"+save9);
		System.out.println(service9.find(dto9));
		System.out.println(service9.findByName("Great Basin"));
		System.out.println(service9.findAreaByName("Great Basin"));
		System.out.println(service9.findByNameAndCountryAndArea("Great Basin", "Northern America", "492,098"));
		System.out.println("***************************");
		
		boolean save10=service10.validateAndThenSave(dto10);
		System.out.println("Saved:"+save10);
		System.out.println(service10.find(dto10));
		System.out.println(service10.findByName("Chihuahuan Desert"));
		System.out.println(service10.findAreaByName("Chihuahuan Desert"));
		System.out.println(service10.findByNameAndCountryAndArea("Chihuahuan Desert", "Northern America", "453,248"));
		System.out.println("***************************");
		
		boolean save11=service11.validateAndThenSave(dto11);
		System.out.println("Saved:"+save11);
		System.out.println(service11.find(dto11));
		System.out.println(service11.findByName("Karakum Desert"));
		System.out.println(service11.findAreaByName("Karakum Desert"));
		System.out.println(service11.findByNameAndCountryAndArea("Karakum Desert", "Australia", "348,750"));
		System.out.println("***************************");
		
		boolean save12=service12.validateAndThenSave(dto12);
		System.out.println("Saved:"+save12);
		System.out.println(service12.find(dto12));
		System.out.println(service12.findByName("Great Victoria"));
		System.out.println(service12.findAreaByName("Great Victoria"));
		System.out.println(service12.findByNameAndCountryAndArea("Great Victoria", "Turkmenistan", "350,000"));
		System.out.println("***************************");
		
		boolean save13=service13.validateAndThenSave(dto13);
		System.out.println("Saved:"+save13);
		System.out.println(service13.find(dto13));
		System.out.println(service13.findByName("Colorado Plateau"));
		System.out.println(service13.findAreaByName("Colorado Plateau"));
		System.out.println(service13.findByNameAndCountryAndArea("Colorado Plateau", "Northern America", "337000"));
		System.out.println("***************************");
		
		boolean save14=service14.validateAndThenSave(dto14);
		System.out.println("Saved:"+save14);
		System.out.println(service14.find(dto14));
		System.out.println(service14.findByName("Sonoran Desert"));
		System.out.println(service14.findAreaByName("Sonoran Desert"));
		System.out.println(service14.findByNameAndCountryAndArea("Sonoran Desert", "Mexico", "310000"));
		System.out.println("***************************");
		
		boolean save15=service15.validateAndThenSave(dto15);
		System.out.println("Saved:"+save15);
		System.out.println(service15.find(dto15));
		System.out.println(service15.findByName("Kyzylkum Desert"));
		System.out.println(service15.findAreaByName("Kyzylkum Desert"));
		System.out.println(service15.findByNameAndCountryAndArea("Kyzylkum Desert", "Turkmenistan and Uzbekistan", "300300"));
		System.out.println("***************************");
		
		boolean save16=service16.validateAndThenSave(dto16);
		System.out.println("Saved:"+save16);
		System.out.println(service16.find(dto16));
		System.out.println(service16.findByName("Taklamakan Desert"));
		System.out.println(service16.findAreaByName("Taklamakan Desert"));
		System.out.println(service16.findByNameAndCountryAndArea("Taklamakan Desert", "China", "270000"));
		System.out.println("***************************");
		
		boolean save17=service17.validateAndThenSave(dto17);
		System.out.println("Saved:"+save17);
		System.out.println(service17.find(dto17));
		System.out.println(service17.findByName("Ogden Desert"));
		System.out.println(service17.findAreaByName("Ogden Desert"));
		System.out.println(service17.findByNameAndCountryAndArea("Ogden Desert", "Eastern Africa", "256000"));
		System.out.println("***************************");
		
		boolean save18=service18.validateAndThenSave(dto18);
		System.out.println("Saved:"+save18);
		System.out.println(service18.find(dto18));
		System.out.println(service18.findByName("Thar Desert"));
		System.out.println(service18.findAreaByName("Thar Desert"));
		System.out.println(service18.findByNameAndCountryAndArea("Thar Desert", "India", "238,254"));
		System.out.println("***************************");
		
		boolean save20=service20.validateAndThenSave(dto20);
		System.out.println("Saved:"+save20);
		System.out.println(service20.find(dto20));
		System.out.println(service20.findByName("Ustyurt Plateau"));
		System.out.println(service20.findAreaByName("Ustyurt Plateau"));
		System.out.println(service20.findByNameAndCountryAndArea("Ustyurt Plateau", "Uzbekistan", "2000000"));
		System.out.println("***************************");
		
		boolean save21=service21.validateAndThenSave(dto21);
		System.out.println("Saved:"+save21);
		System.out.println(service21.find(dto21));
		System.out.println(service21.findByName("Guban Desert"));
		System.out.println(service21.findAreaByName("Guban Desert"));
		System.out.println(service21.findByNameAndCountryAndArea("Guban Desert", "Somalia", "175000"));
		System.out.println("***************************");
		
		boolean save22=service22.validateAndThenSave(dto22);
		System.out.println("Saved:"+save22);
		System.out.println(service22.find(dto22));
		System.out.println(service22.findByName("Namib Desert"));
		System.out.println(service22.findAreaByName("Namib Desert"));
		System.out.println(service22.findByNameAndCountryAndArea("Namib Desert", "South Africa", "160000"));
		System.out.println("***************************");
		
		boolean save23=service23.validateAndThenSave(dto23);
		System.out.println("Saved:"+save23);
		System.out.println(service23.find(dto23));
		System.out.println(service23.findByName("Registan Desert"));
		System.out.println(service23.findAreaByName("Registan Desert"));
		System.out.println(service23.findByNameAndCountryAndArea("Registan Desert", "Afghanistan", "146000"));
		System.out.println("***************************");
	} catch (InvalidDataDesertException e) {
		e.getMessage();
	}System.out.println(service1.getTotal());

	}

}