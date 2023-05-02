package com.xworkz.app.conf;

import java.util.ArrayList;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.app")

public class SpringConfiguration {

	// Using String

	@Bean
	public String product() {
		System.out.println("running product method ...");
		return "laptop";

	}

	@Bean
	public String brand() {
		System.out.println("running brand method ...");
		return "dell";

	}

	@Bean
	public String name() {
		System.out.println("running name method ...");
		return "dell-inspiron";

	}

	@Bean
	public String display() {
		System.out.println("running display method ...");
		return "ammolate";

	}

	@Bean
	public String price() {
		System.out.println("running price method ...");
		return "sixty-thousand";

	}

	@Bean
	public String weight() {
		System.out.println("running weight method ...");
		return "2.5 kg";

	}

	@Bean
	public String country() {
		System.out.println("running country method ...");
		return "india";

	}

	@Bean
	public String validity() {
		System.out.println("running validity method ...");
		return "2 years";

	}

	@Bean
	public String cpu() {
		System.out.println("running cpu method ...");
		return "ryzen";

	}

	@Bean
	public String gpu() {
		System.out.println("running gpu method ...");
		return "readeon-vege-10";

	}

	@Bean
	public String keyboard() {
		System.out.println("running keyboard method ...");
		return "backlit";

	}

	@Bean
	public String ram() {
		System.out.println("running ram method ...");
		return "8 gb";

	}

	@Bean
	public String ssd() {
		System.out.println("running ssd method ...");
		return "512 gb";

	}

	@Bean
	public String webCam() {
		System.out.println("running webCam method ...");
		return "HD";

	}

	@Bean
	public String color() {
		System.out.println("running color method ...");
		return "siliver";

	}

	@Bean
	public String fan() {
		System.out.println("running fan method ...");
		return "single";

	}

	@Bean
	public String port() {
		System.out.println("running port method ...");
		return "HDMI";

	}

	@Bean
	public String wifi() {
		System.out.println("running wifi method ...");
		return "yes";

	}

	// using All wraper Classes

	// Integer
	@Bean
	public Integer laptopPrice() {
		System.out.println("Laptop price_");
		return 60000;
	}

	@Bean
	public Integer laptopModelNo() {
		System.out.println("laptop model No_");
		return 3505;
	}

	@Bean
	public Integer laptopDisplayRatio() {
		System.out.println("laptop display ratkio_");
		return 25;
	}

	@Bean
	public Integer laptopCpu() {
		System.out.println("laptop cpu_");
		return 10;
	}

	@Bean
	public Integer laptopTotal() {
		System.out.println("total laptops_");
		return 300;
	}

	@Bean
	public Integer laptopTotalSoftwares() {
		System.out.println("laptop total softwares_");
		return 25;
	}

	@Bean
	public Integer laptopPriceInindia() {
		System.out.println("laptop price in india_");
		return 65000;
	}

	@Bean
	public Integer laptopPriceInUK() {
		System.out.println("laptop price in uk _");
		return 45000;
	}

	@Bean
	public Integer laptopPriceInChina() {
		System.out.println("laptop pric ein china");
		return 95000;
	}

	// Double
	@Bean
	public Double mobile() {
		System.out.println("mobile price_");
		return 25000d;
	}

	@Bean
	public Double getBudgetMobilePrice() {
		System.out.println("getBudgetMobilePrice  _");
		return 10000.0;
	}

	@Bean
	public Double getMidRangeMobilePrice() {
		System.out.println("getMidRangeMobilePrice  _");
		return 25000.0;
	}

	@Bean
	public Double getFlagshipMobilePrice() {
		System.out.println("getFlagshipMobilePrice  _");
		return 50000.0;
	}

	@Bean
	public Double getLowEndTabletPrice() {
		System.out.println("getLowEndTabletPrice  _");
		return 15000.0;
	}

	@Bean
	public Double getHighEndTabletPrice() {
		System.out.println("getHighEndTabletPrice  _");
		return 40000.0;
	}

	@Bean
	public Double getBudgetLaptopPrice() {
		System.out.println(" getBudgetLaptopPrice _");
		return 30000.0;
	}

	@Bean
	public Double getMidRangeLaptopPrice() {
		System.out.println("getMidRangeLaptopPrice _");
		return 50000.0;
	}

	@Bean
	public Double getHighEndLaptopPrice() {
		System.out.println("getHighEndLaptopPrice _");
		return 100000.0;
	}

	// Float
	@Bean
	public Float weightOfLaptop() {
		return 2.5f;

	}

	// Character

	@Bean
	public Character section1() {
		return 'A';

	}

	@Bean
	public Character section2() {
		return 'B';
	}

	@Bean
	public Character section3() {
		return 'C';

	}

	@Bean
	public Character section4() {
		return 'D';

	}

	@Bean
	public Character section5() {
		return 'E';

	}

	@Bean
	public Character section6() {
		return 'F';

	}

	@Bean
	public Character section7() {
		return 'G';

	}

	@Bean
	public Character section8() {
		return 'H';

	}

	@Bean
	public Character section9() {
		return 'I';

	}

	// Long
	@Bean
	public Long mobileNo1() {
		return 7337686718l;

	}

	@Bean
	public Long mobileNo2() {
		return 7337686718l;

	}

	@Bean
	public Long mobileNo3() {
		return 7337686718l;

	}

	@Bean
	public Long mobileNo4() {
		return 7337686718l;

	}

	@Bean
	public Long mobileNo5() {
		return 7337686718l;

	}

	@Bean
	public Long mobileNo6() {
		return 7337686718l;

	}

	@Bean
	public Long mobileNo7() {
		return 7337686718l;

	}

	@Bean
	public Long mobileNo8() {
		return 7337686718l;

	}

	@Bean
	public Long mobileNo9() {
		return 7337686718l;

	}

	// Byte

	@Bean
	public Byte byteValue1() {
		return 10;

	}

	@Bean
	public Byte byteValue2() {
		return 20;

	}

	@Bean
	public Byte byteValue3() {
		return 30;

	}

	@Bean
	public Byte byteValue4() {
		return 40;

	}

	@Bean
	public Byte byteValue5() {
		return 50;

	}

	@Bean
	public Byte byteValue6() {
		return 60;

	}

	@Bean
	public Byte byteValue7() {
		return 70;

	}

	@Bean
	public Byte byteValue8() {
		return 80;

	}

	@Bean
	public Byte byteValue9() {
		return 90;

	}

	// Boolean

	@Bean
	public Boolean speaker() {
		return true;
	}

	@Bean
	public Boolean mic() {
		return true;
	}

	@Bean
	public Boolean displays() {
		return true;
	}

	@Bean
	public Boolean keyBoard() {
		return true;
	}

	@Bean
	public Boolean hdmiPort() {
		return true;
	}

	@Bean
	public Boolean fingurprint() {
		return true;
	}

	@Bean
	public Boolean bagpack() {
		return true;
	}

	@Bean
	public Boolean battery() {
		return true;
	}

	@Bean
	public Boolean charger() {
		return true;
	}

	@Bean
	public List<String> addres() {
		List<String> address = new ArrayList<String>();
		address.add("mudhol");
		address.add("bagalkot");
		address.add("lokapur");
		address.add("mahalingpur");
		address.add("ilakal");
		return address;

	}

	@Bean
	public List<Integer> number() {
		List<Integer> num = new LinkedList<Integer>();
		num.add(351);
		num.add(35165);
		num.add(5168);
		num.add(9897);
		num.add(6465);
		return num;

	}

	@Bean
	public List<Float> floats() {
		List<Float> float1 = new LinkedList<Float>();
		float1.add(351.1f);
		float1.add(351.6f);
		float1.add(351.9f);
		float1.add(35.1f);
		float1.add(85.1f);
		return float1;

	}

	@Bean
	public List<Double> double1() {
		List<Double> v = new Vector<Double>();
		v.add(351.6);
		v.add(351.5);
		v.add(351.9);
		v.add(35.8);
		v.add(85.7);
		return v;

	}

	@Bean
	public List<String> names() {
		List<String> s = new Stack<String>();
		s.add("sanket");
		s.add("virath");
		s.add("irgfan");
		s.add("ganesh");
		s.add("annesh");
		return s;

	}
	
	@Bean
	public Set<String> namesw() {
		Set<String> hs = new LinkedHashSet<String>();
		hs.add("home");
		hs.add("college");
		hs.add("class");
		hs.add("city");
		hs.add("names");
		return hs;

	}

}
