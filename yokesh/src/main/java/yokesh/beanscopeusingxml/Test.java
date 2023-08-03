package yokesh.beanscopeusingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		// There are 4 types of bean scopes
		// 1) singleton
		// 2) prototype
		// 3) request
		// 4) session
		// 5) globalsession
		// By default spring uses singleton as bean scope 
		// We can use bean scope in 2 ways i) XML file ii) Annotation based 
		
		
		// ------------ Singleton bean scope using xml example -----------
		
		ApplicationContext ac1 = new ClassPathXmlApplicationContext("yokesh/beanscopeusingxml/XMLScope.xml");
		ScopeXML sx1 = (ScopeXML) ac1.getBean("xmBean1");
		System.out.println(sx1);
		System.out.println(sx1.hashCode());
		
		ScopeXML sx2 = (ScopeXML) ac1.getBean("xmBean1");
		System.out.println(sx2);
		System.out.println(sx2.hashCode());
		
		System.out.println(sx1 == sx2); // true because spring uses singleton design pattern to generate
		// objects of a class 
		
		// -------------- prototype bean scope using xml example -------------
		// In the xml file we need to use scope attribute 
		ScopeXML sx3 = (ScopeXML) ac1.getBean("xmBean2");
		System.out.println(sx3);
		System.out.println(sx3.hashCode());
		
		ScopeXML sx4 = (ScopeXML) ac1.getBean("xmBean2");
		System.out.println(sx4);
		System.out.println(sx4.hashCode());
		
		System.out.println(sx3 == sx4); // false because spring uses prototype design pattern to generate
		// multiple objects of a class 
		// We defined scope="prototype" for the bean in xml file. 
		
		// Refer yokesh.beanscopeusingannotation package for bean scope using annotations
	}
}
