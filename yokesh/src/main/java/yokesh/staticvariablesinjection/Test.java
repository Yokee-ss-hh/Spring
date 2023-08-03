package yokesh.staticvariablesinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		// Injecting data to static fields using Annotation
		// Create a non-static setter 
		// Do not annotate @Value and provide data to static field 
		// Annotate @Value with data on the created non-static setter 
		ApplicationContext ac1 = new ClassPathXmlApplicationContext("yokesh/staticvariablesinjection/StaticClassDataInjection.xml");
		StaticDataInjectionUsingAnnotation sdjua1 = (StaticDataInjectionUsingAnnotation) ac1.getBean("sta");
		System.out.println(sdjua1);
		
		
		// Injecting data to static variables using xml file 
		// We need to use a class called MethodInvokingFactoryBean in xml file
		// The above class have 2 methods
		// 1) setArguments(Object[] arguments)
		// 2) setStaticMethod(String staticMethod)
		ApplicationContext ac2 = new ClassPathXmlApplicationContext("yokesh/staticvariablesinjection/StaticClassDataInjection.xml");
		StaticDataInjectionUsingXML sdjua2 = (StaticDataInjectionUsingXML) ac2.getBean("sdjux");
		System.out.println(sdjua2);
	}
}
