//package com.capgemini.beans;
//
//public class Jugador{
//
//	private int id;
//	private String nombre;
//	private IEquipo equipo;
//	
//	public String mostrar(){
//
//		return nombre;
//	}
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getNombre() {
//		return nombre;
//	}
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
//
//	public IEquipo getEquipo() {
//		return equipo;
//	}
//
//	public void setEquipo(IEquipo equipo) {
//		this.equipo = equipo;
//	}
//
//}

package com.capgemini.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pique")
public class Jugador {
	
	@Value("5")
	private int id;

	@Value("Pique")
	private String nombre;

	@Autowired
	private IEquipo equipo;

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

	public IEquipo getEquipo() {
		return equipo;
	}

	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}

}
