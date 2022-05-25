package com.capgemini.demoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.capgemini.beans.AppConfig;
import com.capgemini.beans.AppConfig2;
import com.capgemini.beans.HolaMundo;

public class App {
	public static void main(String[] args) {

// PATRON DE DISEÑO FACTORY
// antes
// HolaMundo hola=new HolaMundo();
// hola.getSaludo();
// con Spring
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);

// cualquiera de las dos siguientes lineas es valida (elegir una)
		HolaMundo hola = (HolaMundo) appContext.getBean("mundo"); // uso el id que puse en beans.xml
		// HolaMundo hola2 = (HolaMundo) appContext.getBean("mundo");
		// HolaMundo hola2 = appContext.getBean(HolaMundo.class); // o puedo llamar directamente a la clase
		HolaMundo hola3 = (HolaMundo) appContext.getBean("marte");
		System.out.println(hola.getSaludo());
		// System.out.println(hola2);
		System.out.println(hola3.getSaludo());
		((ConfigurableApplicationContext) appContext).close();
	}

	public static void main1(String[] args) {

		ApplicationContext appContext2 = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);
	}
}
