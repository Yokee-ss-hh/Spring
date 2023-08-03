package yokesh.beanscopeusingxml;

import org.springframework.stereotype.Component;

@Component
public class ScopeXML {
	
	private String x;
	
	private Integer y;

	@Override
	public String toString() {
		return "ScopeXML [x=" + x + ", y=" + y + "]";
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}
}
