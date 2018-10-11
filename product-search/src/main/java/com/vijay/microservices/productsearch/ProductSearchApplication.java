package com.vijay.microservices.productsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.vijay", exclude = {SecurityAutoConfiguration.class})
public class ProductSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductSearchApplication.class, args);
	}
}
