package yokesh.yokesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	// As class "Person" is annotated as @Component with no value in it
    	// Spring creates "Person" class object by converting to pascalCase as "person"
    	// As Value annotation is not used on all of the Person class variables the default
    	// value of "null" will be injected for variables by spring 
        ApplicationContext ac1 = new ClassPathXmlApplicationContext("yokesh/yokesh/App.xml");
        Person p1 = (Person) ac1.getBean("person");
        System.out.println(p1);
        
        
        // For class "Phone" , We annotated class with @Component("phoneObject"). Spring uses 
        // "phoneObject" to create object for "Phone" class instead of default pascalCase object "phone"
        // @Value() is annotated on data variables which will be used by spring to inject data to variables
        ApplicationContext ac2 = new ClassPathXmlApplicationContext("yokesh/yokesh/App.xml");
        Phone p2 = (Phone) ac2.getBean("phoneObject");
        System.out.println(p2);
    }
}
