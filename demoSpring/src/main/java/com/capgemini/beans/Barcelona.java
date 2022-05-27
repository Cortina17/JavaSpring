package com.capgemini.beans;

import org.springframework.stereotype.Component;

import com.capgemini.beans.IEquipo;

@Component("equipo")
public class Barcelona implements IEquipo {
	String nombre;

	@Override
	public String mostrar() {
		return "FCB";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
