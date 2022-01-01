package com.ex.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ThNopathApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ThNopathApplication.class, args);
	}

	@Override 
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ThNopathApplication.class);
	}
}
