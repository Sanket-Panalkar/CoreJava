package com.xworkz.app.boot;

import java.util.List;

import java.util.Set;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.app.conf.SpringConfiguration;
import com.xworkz.app.things.Book;
import com.xworkz.app.things.Car;
import com.xworkz.app.things.City;
import com.xworkz.app.things.Country;
import com.xworkz.app.things.EarphonePrice;
import com.xworkz.app.things.EvenValues;
import com.xworkz.app.things.Names;
import com.xworkz.app.things.Numbers;
import com.xworkz.app.things.OddNumbers;
import com.xworkz.app.things.Person;
import com.xworkz.app.things.School;

public class SpringRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(spring.getBean(SpringConfiguration.class));

		SpringConfiguration data = spring.getBean(SpringConfiguration.class);

//		System.out.println("product Name :" + data.product());
//		System.out.println("brand :" + data.brand());
//		System.out.println("color :" + data.color());
//		System.out.println("country :" + data.country());
//		System.out.println("cpu :" + data.cpu());
//		System.out.println("display :" + data.display());
//		System.out.println("fan :" + data.fan());
//		System.out.println("gpu :" + data.gpu());
//		System.out.println("keyboard :" + data.keyboard());
//		System.out.println("name :" + data.name());
//		System.out.println("port :" + data.port());
//		System.out.println("price :" + data.price());
//		System.out.println("ram :" + data.ram());
//		System.out.println("ssd :" + data.ssd());
//		System.out.println("validity :" + data.validity());
//		System.out.println("webCam :" + data.webCam());
//		System.out.println("weight :" + data.weight());
//  	System.out.println("wifi :" + data.wifi());

		System.out.println("/////////////////////////////// String \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println(spring.getBean("product", String.class));
		System.out.println(spring.getBean("brand", String.class));
		System.out.println(spring.getBean("color", String.class));
		System.out.println(spring.getBean("country", String.class));
		System.out.println(spring.getBean("cpu", String.class));
		System.out.println(spring.getBean("fan", String.class));
		System.out.println(spring.getBean("gpu", String.class));
		System.out.println(spring.getBean("keyboard", String.class));
		System.out.println(spring.getBean("name", String.class));
		System.out.println(spring.getBean("port", String.class));
		System.out.println(spring.getBean("price", String.class));
		System.out.println(spring.getBean("ram", String.class));
		System.out.println(spring.getBean("ssd", String.class));
		System.out.println(spring.getBean("validity", String.class));
		System.out.println(spring.getBean("ssd", String.class));
		System.out.println(spring.getBean("webCam", String.class));
		System.out.println(spring.getBean("weight", String.class));
		System.out.println(spring.getBean("wifi", String.class));

		System.out.println("--------------Integer--------------");
//		System.out.println("laptop CPU_");
//		System.out.println(data.LaptopCpu());
//		System.out.println("Laptop display ratio_");
//		System.out.println(data.LaptopDisplayRatio());
//		System.out.println("laptop model No_");
//		System.out.println(data.LaptopModelNo());
//		System.out.println("laptop price in china_");
//		System.out.println(data.LaptopPriceInChina());
//		System.out.println("laptop price in india_");
//		System.out.println(data.LaptopPriceInindia());
//		System.out.println("laptop price in UK_");
//		System.out.println(data.LaptopPriceInUK());
//		System.out.println("Total Laptops in shop_");
//		System.out.println(data.LaptopTotal());
//		System.out.println("Total Softwares in Laptop_");
//		System.out.println(data.LaptopTotalSoftwares());
//		System.out.println("wifi is present in all laptops_");
//		System.out.println(data.wifi());
		System.out.println(spring.getBean("laptopCpu", Integer.class));
		System.out.println(spring.getBean("laptopPrice", Integer.class));
		System.out.println(spring.getBean("laptopModelNo", Integer.class));
		System.out.println(spring.getBean("laptopDisplayRatio", Integer.class));
		System.out.println(spring.getBean("laptopTotal", Integer.class));
		System.out.println(spring.getBean("laptopTotalSoftwares", Integer.class));
		System.out.println(spring.getBean("laptopPriceInindia", Integer.class));
		System.out.println(spring.getBean("laptopPriceInUK", Integer.class));
		System.out.println(spring.getBean("laptopPriceInChina", Integer.class));

		System.out.println("--------------Double--------------");

//		System.out.println(data.getBudgetLaptopPrice());
//		System.out.println(data.getBudgetMobilePrice());
//		System.out.println(data.getFlagshipMobilePrice());
//		System.out.println(data.getHighEndLaptopPrice());
//		System.out.println(data.getHighEndTabletPrice());
//		System.out.println(data.getLowEndTabletPrice());
//		System.out.println(data.getMidRangeLaptopPrice());
//		System.out.println(data.getMidRangeMobilePrice());
		System.out.println(spring.getBean("getBudgetLaptopPrice", Double.class));
		System.out.println(spring.getBean("getBudgetMobilePrice", Double.class));
		System.out.println(spring.getBean("getBudgetLaptopPrice", Double.class));
		System.out.println(spring.getBean("getFlagshipMobilePrice", Double.class));
		System.out.println(spring.getBean("getBudgetLaptopPrice", Double.class));
		System.out.println(spring.getBean("getHighEndTabletPrice", Double.class));
		System.out.println(spring.getBean("getLowEndTabletPrice", Double.class));
		System.out.println(spring.getBean("getMidRangeLaptopPrice", Double.class));
		System.out.println(spring.getBean("getMidRangeMobilePrice", Double.class));

		System.out.println("--------------Character-----------");

//		System.out.println("section 1: " + data.section1());
//		System.out.println("section 2: " + data.section2());
//		System.out.println("section 3: " + data.section3());
//		System.out.println("section 4: " + data.section4());
//		System.out.println("section 5: " + data.section5());
//		System.out.println("section 6: " + data.section6());
//		System.out.println("section 7: " + data.section7());
//		System.out.println("section 8: " + data.section8());
//		System.out.println("section 9: " + data.section9());

		System.out.println(spring.getBean("section1", Character.class));
		System.out.println(spring.getBean("section2", Character.class));
		System.out.println(spring.getBean("section3", Character.class));
		System.out.println(spring.getBean("section4", Character.class));
		System.out.println(spring.getBean("section5", Character.class));
		System.out.println(spring.getBean("section6", Character.class));
		System.out.println(spring.getBean("section7", Character.class));
		System.out.println(spring.getBean("section8", Character.class));
		System.out.println(spring.getBean("section9", Character.class));

		System.out.println("----------------Long-------------");

//		System.out.println("mobile Number 1: " + data.mobileNo1());
//		System.out.println("mobile Number 2: " + data.mobileNo2());
//		System.out.println("mobile Number 3: " + data.mobileNo3());
//		System.out.println("mobile Number 4: " + data.mobileNo4());
//		System.out.println("mobile Number 5: " + data.mobileNo5());
//		System.out.println("mobile Number 6: " + data.mobileNo6());
//		System.out.println("mobile Number 7: " + data.mobileNo7());
//		System.out.println("mobile Number 8: " + data.mobileNo8());
//		System.out.println("mobile Number 9: " + data.mobileNo9());

		System.out.println(spring.getBean("mobileNo1", Long.class));

		System.out.println(spring.getBean("mobileNo2", Long.class));

		System.out.println(spring.getBean("mobileNo3", Long.class));

		System.out.println(spring.getBean("mobileNo4", Long.class));

		System.out.println(spring.getBean("mobileNo5", Long.class));

		System.out.println(spring.getBean("mobileNo6", Long.class));

		System.out.println(spring.getBean("mobileNo7", Long.class));

		System.out.println(spring.getBean("mobileNo8", Long.class));

		System.out.println(spring.getBean("mobileNo9", Long.class));

		System.out.println("----------------Byte-------------");

//		System.out.println("byteValue 1: " + data.byteValue1());
//		System.out.println("byteValue 2: " + data.byteValue2());
//		System.out.println("byteValue 3: " + data.byteValue3());
//		System.out.println("byteValue 4: " + data.byteValue4());
//		System.out.println("byteValue 5: " + data.byteValue1());
//		System.out.println("byteValue 6: " + data.byteValue6());
//		System.out.println("byteValue 7: " + data.byteValue7());
//		System.out.println("byteValue 8: " + data.byteValue8());
//		System.out.println("byteValue 9: " + data.byteValue9());

		System.out.println(spring.getBean("byteValue1", Double.class));
		System.out.println(spring.getBean("byteValue2", Double.class));
		System.out.println(spring.getBean("byteValue3", Double.class));
		System.out.println(spring.getBean("byteValue4", Double.class));
		System.out.println(spring.getBean("byteValue5", Double.class));
		System.out.println(spring.getBean("byteValue6", Double.class));
		System.out.println(spring.getBean("byteValue7", Double.class));
		System.out.println(spring.getBean("byteValue8", Double.class));
		System.out.println(spring.getBean("byteValue9", Double.class));

		System.out.println("----------------Boolean-------------");

//		System.out.println("laptop has display : " + data.displays());
//		System.out.println("laptop has mic : " + data.mic());
//		System.out.println("laptop has fingurePrint : " + data.fingurprint());
//		System.out.println("laptop has HDMI Port : " + data.hdmiPort());
//		System.out.println("laptop has keyboard : " + data.keyBoard());
//		System.out.println("laptop has charger : " + data.charger());
//		System.out.println("laptop has battery : " + data.battery());
//		System.out.println("laptop has bagpack : " + data.bagpack());
//		System.out.println("laptop has speaker : " + data.speaker());

		System.out.println(spring.getBean("displays", Boolean.class));
		System.out.println(spring.getBean("mic", Boolean.class));
		System.out.println(spring.getBean("fingurprint", Boolean.class));
		System.out.println(spring.getBean("hdmiPort", Boolean.class));
		System.out.println(spring.getBean("keyBoard", Boolean.class));
		System.out.println(spring.getBean("charger", Boolean.class));
		System.out.println(spring.getBean("battery", Boolean.class));
		System.out.println(spring.getBean("bagpack", Boolean.class));
		System.out.println(spring.getBean("speaker", Boolean.class));

		System.out.println(spring.getBean("addres", List.class));

		System.out.println(spring.getBean("number", List.class));

		System.out.println(spring.getBean("floats", List.class));

		System.out.println(spring.getBean("double1", List.class));

		System.out.println(spring.getBean("names", List.class));

		System.out.println(spring.getBean("double1", List.class));

		System.out.println(spring.getBean("namesw", Set.class));

		System.out.println("component---------------------\n");

//		String value = spring.toString();
//		System.out.println(value);
//		Stream.of(spring.getBeanDefinitionNames()).forEach(System.out::println);
		
		
		System.out.println(spring.getBean(City.class));
		System.out.println(spring.getBean(Numbers.class));
		System.out.println(spring.getBean(Names.class));
		System.out.println(spring.getBean(School.class));
//		System.out.println(spring.getBean(MobileNum.class));
		System.out.println(spring.getBean(EvenValues.class));
		System.out.println(spring.getBean(EarphonePrice.class));
		System.out.println(spring.getBean(OddNumbers.class));
		System.out.println(spring.getBean(Person.class));
		System.out.println(spring.getBean(Book.class));
		System.out.println(spring.getBean(Car.class));
		System.out.println(spring.getBean(Country.class));		
		


	}
}
