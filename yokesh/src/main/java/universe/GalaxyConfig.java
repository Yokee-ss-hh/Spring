package universe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import galaxy.MilkyWay;

@Configuration
public class GalaxyConfig {
	
	@Bean("mw")
	public MilkyWay getMilkyWay() {
		return new MilkyWay();
	}
}
