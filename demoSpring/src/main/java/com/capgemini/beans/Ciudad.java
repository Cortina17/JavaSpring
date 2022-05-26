package com.capgemini.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//import jakarta.annotation.PostConstruct;
//import jakarta.annotation.PreDestroy;

public class Ciudad implements InitializingBean, DisposableBean {

	private String nombre;

//	@PostConstruct
//	private void init() {
//		System.out.println("antes de iniciar el bean ciu");
//	}
//	
//	@PreDestroy
//	private void destroy() {
//		System.out.println("apunto de destruir el bean ciu");
//	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("antes de iniciar el bean ciu");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("apunto de destruir el bean ciu");

	}

}
