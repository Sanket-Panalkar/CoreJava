package com.xworkz.app.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.app")
public class MuseumConfiguration {

	@Bean
	public String name() {
		System.out.println("running name in MuseumConf..");
		return "National Gallery Of Modern Art";
	}

	@Bean
	public String type() {
		System.out.println("running type in MuseumConf..");
		return "Sculptures";
	}

	@Bean
	public int age() {
		System.out.println("running age in MuseumConf..");
		return 34;
	}

	@Bean
	public String brand() {
		System.out.println("running brand in MuseumConf..");
		return "canon";
	}

	@Bean
	public int numDoor() {
		System.out.println("running numDoor in MuseumConf..");
		return 40;
	}

	@Bean
	public int fee() {
		System.out.println("running fee in MuseumConf..");
		return 80;
	}

	@Bean
	public String names() {
		System.out.println("running names in MuseumConf..");
		return "dr rajkumar";
	}

}
