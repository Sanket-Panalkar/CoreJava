package com.xworkz.app.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.app.conf.SpringConfiguration;

public class SpringRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(spring.getBean(SpringConfiguration.class));

		SpringConfiguration data = spring.getBean(SpringConfiguration.class);
		System.out.println("product Name :" + data.product());
		System.out.println("brand :" + data.brand());
		System.out.println("color :" + data.color());
		System.out.println("country :" + data.country());
		System.out.println("cpu :" + data.cpu());
		System.out.println("display :" + data.display());
		System.out.println("fan :" + data.fan());
		System.out.println("gpu :" + data.gpu());
		System.out.println("keyboard :" + data.keyboard());
		System.out.println("name :" + data.name());
		System.out.println("port :" + data.port());
		System.out.println("price :" + data.price());
		System.out.println("ram :" + data.ram());
		System.out.println("ssd :" + data.ssd());
		System.out.println("validity :" + data.validity());
		System.out.println("webCam :" + data.webCam());
		System.out.println("weight :" + data.weight());
		System.out.println("wifi :" + data.wifi());
		
		
		System.out.println("--------------Integer--------------");
		
		System.out.println(data.LaptopCpu());
		
		System.out.println(data.LaptopDisplayRatio());
		
		System.out.println("laptop model No_");
		System.out.println(data.LaptopModelNo());

		System.out.println(data.LaptopPriceInChina());
		
		System.out.println(data.LaptopPriceInindia());

		System.out.println(data.LaptopPriceInUK());

		System.out.println(data.LaptopTotal());

		System.out.println(data.LaptopTotalSoftwares());

		System.out.println(data.wifi());
		
		
		System.out.println("--------------Double--------------");
		
		System.out.println(data.getBudgetLaptopPrice());
		System.out.println(data.getBudgetMobilePrice());
		System.out.println(data.getFlagshipMobilePrice());
		System.out.println(data.getHighEndLaptopPrice());
		System.out.println(data.getHighEndTabletPrice());
		System.out.println(data.getLowEndTabletPrice());
		System.out.println(data.getMidRangeLaptopPrice());
		System.out.println(data.getMidRangeMobilePrice());
		
		System.out.println("--------------Long--------------");
		
		



	}
}
