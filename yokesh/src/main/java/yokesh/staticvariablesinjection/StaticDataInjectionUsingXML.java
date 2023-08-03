package yokesh.staticvariablesinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sdjux")
public class StaticDataInjectionUsingXML {
	
	@Value("#{stat}")
	private static String name;

	@Override
	public String toString() {
		return "StaticDataInjectionUsingXML [name=" + name + "]";
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		StaticDataInjectionUsingXML.name = name;
	}

}
