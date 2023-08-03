package yokesh.staticvariablesinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sta")
public class StaticDataInjectionUsingAnnotation {
    
	 private static String name;

	@Override
	public String toString() {
		return "ScopeXML [name=" + name + "]";
	}

	public static String getName() {
		return name;
	}

	@Value("YOKESH")
	public void setName(String name) {
		StaticDataInjectionUsingAnnotation.name = name;
	}
}
