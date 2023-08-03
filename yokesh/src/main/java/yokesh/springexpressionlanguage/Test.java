package yokesh.springexpressionlanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("yokesh/springexpressionlanguage/MathClass.xml");
		MathClass mc = (MathClass) ac.getBean("mathClass");
		System.out.println(mc);
	}
}
