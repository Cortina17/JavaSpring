package com.capgemini.beans;

import org.springframework.beans.factory.annotation.Value;

public class HolaMundo {

	@Value("Hola Asturias")
	private String saludo; //= "Eseeeeeeeeeee";

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

}
