package com.investments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages = { "com.investments.web.controller"})
//@EnableWebMvc


//@SpringBootApplication
//@ComponentScan(basePackageClasses = InvestmentsController.class)

@SpringBootApplication(scanBasePackages = { "web.controller" })
public class InvestmentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestmentsApplication.class, args);

	}
}
