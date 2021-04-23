package edu.greenriver.sdev.sfgdi;

import edu.greenriver.sdev.sfgdi.controllers.ConstructedInjectedController;
import edu.greenriver.sdev.sfgdi.controllers.MyController;
import edu.greenriver.sdev.sfgdi.controllers.PropertyInjectedController;
import edu.greenriver.sdev.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) context.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

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
