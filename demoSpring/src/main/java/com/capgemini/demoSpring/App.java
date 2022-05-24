package com.capgemini.demoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capgemini.beans.*;

public class App {
	public static void main(String[] args) {

//		HolaMundo m = new HolaMundo();
//		m.setSaludo("Eseeee");
//		System.out.println(m.getSaludo());

		// 1er caso llamando a beans.xml
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/capgemini/xmls/beans.xml");

		// 2ndo caso llamando al AppConfig con @Configuration
		ApplicationContext appContext2 = new AnnotationConfigApplicationContext(AppConfig.class);

		// HolaMundo hola = (HolaMundo) appContext.getBean("mundo"); // se usa el id que
		// se puso en el beans.xml
		HolaMundo hola2 = (HolaMundo) appContext2.getBean(HolaMundo.class);
		// System.out.println(hola.getSaludo());

		((ConfigurableApplicationContext) appContext).close();
	}

}
