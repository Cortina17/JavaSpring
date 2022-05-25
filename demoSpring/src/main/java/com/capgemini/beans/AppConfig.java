package com.capgemini.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	//Este archivo con las anotations reemplaza al beans.xml
	@Bean
	public HolaMundo mundo() {
		return new HolaMundo();
	}

}