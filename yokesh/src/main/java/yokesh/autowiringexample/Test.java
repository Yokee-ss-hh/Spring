package yokesh.autowiringexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("yokesh/autowiringexample/bookauthor.xml");
		Book b = (Book) ac.getBean("book");
		System.out.println(b);
	}
}
