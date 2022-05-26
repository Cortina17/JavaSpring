package com.capgemini.beans;

public class Person {
	
	private int id;
	private String nombre;
	private String apodo;
	private Pais Pais;
	
	private void init() {
		System.out.println("antes de iniciar el bean");
	}
	
	private void destroy() {
		System.out.println("apunto de destruir el bean");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public Pais getPais() {
		return Pais;
	}

	public void setPais(Pais pais) {
		Pais = pais;
	}


}
