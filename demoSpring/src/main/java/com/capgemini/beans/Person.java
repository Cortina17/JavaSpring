package com.capgemini.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//import jakarta.annotation.PostConstruct;
//import jakarta.annotation.PreDestroy;

public class Person implements InitializingBean, DisposableBean {

	private int id;
	private String nombre;
	private String apodo;
	private Pais Pais;
	private Ciudad ciudad;

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("antes de iniciar el bean per");

	}

	@Override
	public void destroy() throws Exception {

		System.out.println("apunto de destruir el bean per");
	}

//	@PostConstruct
//	private void init() {
//		System.out.println("antes de iniciar el bean per");
//	}
//	
//	@PreDestroy
//	private void destroy() {
//		System.out.println("apunto de destruir el bean per");
//	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
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
