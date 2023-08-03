package yokesh.beanscopeusingannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac1 = new ClassPathXmlApplicationContext("yokesh/beanscopeusingannotation/AnnotationScope.xml");
		
		ScopeAnnotation sa1 = (ScopeAnnotation) ac1.getBean("sa");
		System.out.println(sa1);
		System.out.println(sa1.hashCode());
		
		ScopeAnnotation sa2 = (ScopeAnnotation) ac1.getBean("sa");
		System.out.println(sa2);
		System.out.println(sa2.hashCode());
		
		System.out.println(sa1 == sa2); // true becuase by default Scope is singleton 
		
		// Now add @Scope("prototype") in ScopeAnnotation class and see the output 
		// We will get sa1 == sa2 as false becuase prototype creates different objects each time 
		// a request for bean creation is invoked.
	}
}
