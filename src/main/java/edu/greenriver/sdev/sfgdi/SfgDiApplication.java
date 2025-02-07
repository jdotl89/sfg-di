package edu.greenriver.sdev.sfgdi;

import edu.greenriver.sdev.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) context.getBean("myController");

		System.out.println("------------ Primary Bean");

		System.out.println(myController.sayHello());

		System.out.println("------------ Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)
				context.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------------ Setter");

		SetterInjectedController setterInjectedController =(SetterInjectedController) context.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------------ Constructor");

		ConstructedInjectedController constructedInjectedController = (ConstructedInjectedController) context.getBean("constructedInjectedController");

		System.out.println(constructedInjectedController.getGreeting());
	}

}
