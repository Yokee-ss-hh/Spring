package yokesh.beanscopeusingannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sa")
@Scope("prototype")
public class ScopeAnnotation {
	
	@Value("india")
	String a;
	
	@Value("bharat")
	String b;

	@Override
	public String toString() {
		return "ScopeAnnotation [a=" + a + ", b=" + b + "]";
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}
}
