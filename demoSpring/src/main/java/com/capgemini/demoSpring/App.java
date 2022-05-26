package com.capgemini.demoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.AppConfig;
import com.capgemini.beans.AppConfig2;
import com.capgemini.beans.Ciudad;
import com.capgemini.beans.HolaMundo;
import com.capgemini.beans.Person;
import com.capgemini.beans.Persona;

public class App {
	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/capgemini/xmls/beans.xml");

		Person p = (Person) appContext.getBean("person");
		Ciudad c = (Ciudad) appContext.getBean("ciudad");

		System.out.println(p);
		System.out.println(p.getApodo());
		
		System.out.println(c);
		System.out.println(c.getNombre());

		System.out.println("Su apodo es " + p.getApodo() + ", su ciudad " + p.getCiudad().getNombre() + " y su pais es " + p.getPais().getNombre() + ".");
		
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
