package com.capgemini.demoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.AppConfig;
import com.capgemini.beans.AppConfig2;
import com.capgemini.beans.HolaMundo;
import com.capgemini.beans.Persona;

public class App {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/capgemini/xmls/beans.xml");

		Persona p = (Persona) appContext.getBean("persona");

		System.out.println("El ID de la persona es el " + p.getId() + ", su nombre es " + p.getNombre()
				+ ", su apodo es " + p.getApodo() + ",\n su pais es " + p.getPais().getNombre()
				+ ", y vive en " + p.getPais().getCiudad().getNombre() + ".");

		Persona p2 = (Persona) appContext.getBean("personaAlias");
		
		((ConfigurableApplicationContext) appContext).close();
	}

	public static void main2(String[] args) {

		AnnotationConfigApplicationContext appContext2 = new AnnotationConfigApplicationContext(AppConfig.class,
				AppConfig2.class);

		appContext2.register(AppConfig.class);
		appContext2.register(AppConfig2.class);

		HolaMundo hola = (HolaMundo) appContext2.getBean("mundo");
		HolaMundo hola3 = (HolaMundo) appContext2.getBean("marte");

		System.out.println(hola.getSaludo());
		System.out.println(hola3.getSaludo());

		((ConfigurableApplicationContext) appContext2).close();
	}

	public static void main1(String[] args) {

// PATRON DE DISEÑO FACTORY
// antes
// HolaMundo hola=new HolaMundo();
// hola.getSaludo();
// con Spring
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);

// cualquiera de las dos siguientes lineas es valida (elegir una)
		HolaMundo hola = (HolaMundo) appContext.getBean("mundo"); // uso el id que puse en beans.xml
		// HolaMundo hola2 = (HolaMundo) appContext.getBean("mundo");
		// HolaMundo hola2 = appContext.getBean(HolaMundo.class); // o puedo llamar
		// directamente a la clase
		HolaMundo hola3 = (HolaMundo) appContext.getBean("marte");
		System.out.println(hola.getSaludo());
		// System.out.println(hola2);
		System.out.println(hola3.getSaludo());
		((ConfigurableApplicationContext) appContext).close();
	}

}
