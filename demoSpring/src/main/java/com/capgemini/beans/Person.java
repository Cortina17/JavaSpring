package com.capgemini.beans;

public class Person {
	
	private int id;
	private String nombre;
	private String apodo;
	private Pais Pais;
	private Ciudad ciudad;
	
	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	private void init() {
		System.out.println("antes de iniciar el bean per");
	}
	
	private void destroy() {
		System.out.println("apunto de destruir el bean per");
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
