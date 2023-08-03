package yokesh.yokesh;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("phoneObject")
public class Phone {
	
	@Value("Iphone")
	private String phoneType;
	
	@Value("1122334455")
	private Integer phoneNumber;
	
	@Value("#{temp}")
	private List<String> phoneNames;

	public List<String> getPhoneNames() {
		return phoneNames;
	}

	public void setPhoneNames(List<String> phoneNames) {
		this.phoneNames = phoneNames;
	}

	@Override
	public String toString() {
		return "Phone [phoneType=" + phoneType + ", phoneNumber=" + phoneNumber + ", phoneNames=" + phoneNames + "]";
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
