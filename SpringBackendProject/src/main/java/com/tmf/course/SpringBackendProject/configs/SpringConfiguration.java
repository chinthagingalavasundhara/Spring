package com.tmf.course.SpringBackendProject.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tmf.course.SpringBackendProject.beans.Customer;

@Configuration
@ComponentScan(basePackages = "com.tmf")
public class SpringConfiguration {
	@Bean
	public String name() {
		return "Honey";
	}

	@Bean
	public String city() {
		return "Vizag";
	}

	@Bean
	public int id() {
		return 100001;
	}

	@Bean
	public Customer customer(int id, String name, String city) {
		return new Customer(id, name, city);
	}
}
