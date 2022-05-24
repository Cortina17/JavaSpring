package com.capgemini.beans;

import org.springframework.context.annotation.Configuration;

public class AppConfig {

	@Configuration
	public HolaMundo mundo() {
		return new HolaMundo();
	}
	
}
