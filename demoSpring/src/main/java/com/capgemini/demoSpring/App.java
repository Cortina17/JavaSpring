package com.capgemini.demoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capgemini.beans.*;

public class App {
	public static void main(String[] args) {
		
//		HolaMundo m = new HolaMundo();
//		m.setSaludo("Eseeee");
//		System.out.println(m.getSaludo());

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/capgemini/xmls/beans.xml");

		HolaMundo hola = (HolaMundo) appContext.getBean("mundo"); // se usa el id que se puso en el beans.xml

		System.out.println(hola.getSaludo());

		((ConfigurableApplicationContext) appContext).close();
	}

}
