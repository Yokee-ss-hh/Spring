package yokesh.world;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"yokesh.hello","yokesh.world","universe"})
@Configuration
public class Test {

	// Test class is annotated with Configuration so we need to pass this class 
	// in AnnotationConfigApplicationContext() class to scan for beans 
	// Included ComponentScan to scan packages for beans 
	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(Test.class);
		System.out.println(ac.containsBean("b"));
		System.out.println(ac.containsBean("c"));
		System.out.println(ac.containsBean("a"));
	    System.out.println(ac.containsBean("mw"));
	}

}
