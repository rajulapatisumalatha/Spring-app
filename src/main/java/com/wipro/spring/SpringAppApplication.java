package com.wipro.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringAppApplication extends ServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
	}
	@Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	      return builder.sources(SpringAppApplication.class);
	  }
}
