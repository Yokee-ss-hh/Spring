package yokesh.springexpressionlanguage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MathClass {
	
	// SPEC for Static method: T(classname).method()
	// SPEC for Static variable: T(classname).variable
	// SPEC for new object: new class("<--data-->")
	// SPEC to call instance method: new class("<--data-->").instanceMethod()
	
	@Value("#{T(java.lang.Math).sqrt(100)}")
	private double squareRoot;
	
	
	@Value("#{T(java.lang.Math).round(12.23432)}")
	private int roundOfANumber;
	
	@Value("#{new java.lang.String('YOKESH')}")
	private String someString;
	
	@Value("#{new yokesh.springexpressionlanguage.Age(23).getAge()}")
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSomeString() {
		return someString;
	}

	public void setSomeString(String someString) {
		this.someString = someString;
	}


	@Override
	public String toString() {
		return "MathClass [squareRoot=" + squareRoot + ", roundOfANumber=" + roundOfANumber + ", someString="
				+ someString + ", age=" + age + "]";
	}


	public double getSquareRoot() {
		return squareRoot;
	}


	public void setSquareRoot(double squareRoot) {
		this.squareRoot = squareRoot;
	}


	public int getRoundOfANumber() {
		return roundOfANumber;
	}


	public void setRoundOfANumber(int roundOfANumber) {
		this.roundOfANumber = roundOfANumber;
	}
}
