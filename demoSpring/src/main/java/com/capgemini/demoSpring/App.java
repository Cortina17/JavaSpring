package com.capgemini.demoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.AppConfig;
import com.capgemini.beans.AppConfig2;
import com.capgemini.beans.Ciudad;
import com.capgemini.beans.HolaMundo;
import com.capgemini.beans.IEquipo;
import com.capgemini.beans.Jugador;
import com.capgemini.beans.Person;
import com.capgemini.beans.Persona;

public class App {
	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/capgemini/xmls/beans.xml");

		Jugador j = (Jugador) appContext.getBean("messi");
		Jugador j1 = (Jugador) appContext.getBean("benzema");
	
		System.out.println(j.getNombre() + ", " + j.getId() + ", " + j.getEquipo().mostrar()) ;
		System.out.println(j1.getNombre() + ", " + j1.getId() + ", " + j1.getEquipo().mostrar()) ;

		((ConfigurableApplicationContext) appContext).close();
	}

	
	public static void main2(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/capgemini/xmls/beans.xml");

		Persona p = (Persona) appContext.getBean("persona");
		Ciudad c = (Ciudad) appContext.getBean("ciudad");

		System.out.println(p.getApodo());

		System.out.println(c.getNombre());

		System.out.println("Su apodo es " + p.getApodo() + ", su ciudad " + p.getNombre() + " y su pais es " + p.getPais().getNombre() + ".");
		
		((ConfigurableApplicationContext) appContext).close();
	}

	public static void main1(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/capgemini/xmls/beans2.xml");

		Person p = (Person) appContext.getBean("person");
		Person p1 = (Person) appContext.getBean("person");

		System.out.println(p);
		System.out.println(p1);

		System.out.println("El ID de la persona es el " + p.getId() + ", su nombre es " + p.getNombre()
				+ ", su apodo es " + p.getApodo() + " y su pais es " + p.getPais().getNombre() + ".");

		((ConfigurableApplicationContext) appContext).close();

	}

}
