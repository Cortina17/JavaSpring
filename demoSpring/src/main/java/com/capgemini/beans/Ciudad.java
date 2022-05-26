package com.capgemini.beans;

public class Ciudad {
	
	private String nombre;
	
	private void init() {
		System.out.println("antes de iniciar el bean ciu");
	}
	
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
