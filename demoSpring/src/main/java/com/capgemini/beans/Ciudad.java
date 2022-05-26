package com.capgemini.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Ciudad {
	
	private String nombre;
	
	@PostConstruct
	private void init() {
		System.out.println("antes de iniciar el bean ciu");
	}
	
	@PreDestroy
	private void destroy() {
		System.out.println("apunto de destruir el bean ciu");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
