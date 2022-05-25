package com.capgemini.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {
	
	@Bean
	public HolaMundo marte() {
		return new HolaMundo();
	}
}
