package com.xworkz.app.conf;

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
	public Integer LaptopPrice() {
		System.out.println("Laptop price_");
		return 60000;
	}

	@Bean
	public Integer LaptopModelNo() {
		System.out.println("laptop model No_");
		return 3505;
	}

	@Bean
	public Integer LaptopDisplayRatio() {
		System.out.println("laptop display ratkio_");
		return 25;
	}

	@Bean
	public Integer LaptopCpu() {
		System.out.println("laptop cpu_");
		return 10;
	}

	@Bean
	public Integer LaptopTotal() {
		System.out.println("total laptops_");
		return 300;
	}

	@Bean
	public Integer LaptopTotalSoftwares() {
		System.out.println("laptop total softwares_");
		return 25;
	}

	@Bean
	public Integer LaptopPriceInindia() {
		System.out.println("laptop price in india_");
		return 65000;
	}

	public Integer LaptopPriceInUK() {
		System.out.println("laptop price in uk _");
		return 45000;
	}

	@Bean
	public Integer LaptopPriceInChina() {
		System.out.println("laptop pric ein china");
		return 95000;
	}

	// Double
	public Double mobile() {
		System.out.println("mobile price_");
		return 25000d;
	}
	

	public Double getBudgetMobilePrice() {
		System.out.println("getBudgetMobilePrice  _");
		return 10000.0;
	}

	public Double getMidRangeMobilePrice() {
		System.out.println("getMidRangeMobilePrice  _");
		return 25000.0;
	}

	public Double getFlagshipMobilePrice() {
		System.out.println("getFlagshipMobilePrice  _");
		return 50000.0;
	}

	public Double getLowEndTabletPrice() {
		System.out.println("getLowEndTabletPrice  _");
		return 15000.0;
	}

	public Double getHighEndTabletPrice() {
		System.out.println("getHighEndTabletPrice  _");
		return 40000.0;
	}

	public Double getBudgetLaptopPrice() {
		System.out.println(" getBudgetLaptopPrice _");
		return 30000.0;
	}

	public Double getMidRangeLaptopPrice() {
		System.out.println("getMidRangeLaptopPrice _");
		return 50000.0;
	}

	public Double getHighEndLaptopPrice() {
		System.out.println("getHighEndLaptopPrice _");
		return 100000.0;
	}
	


}
