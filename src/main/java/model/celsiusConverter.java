package model;

/**
 * @author Joe Shilkaitis - jshilkaitis
 * CIS175 - Fall 2022
 * Sep 22, 2022
 */
public class celsiusConverter {
	private int fahrenheit;
	private int celsius;
	
	public celsiusConverter() {
		super();
	}

	public celsiusConverter(int fahrenheit) {
		super();
		this.fahrenheit = fahrenheit;
		convertToCelsius(fahrenheit);
	}

	public int getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(int fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

	public int getCelsius() {
		return celsius;
	}

	public void setCelsius(int celcius) {
		this.celsius = celcius;
	}
	
	public void convertToCelsius(int fahrenheit) {
		int celsius;
		celsius = (fahrenheit-32)*5/9;
		setCelsius(celsius);
	}

	@Override
	public String toString() {
		return fahrenheit + " degrees fahrenheit converts to " + celsius + " degrees celsius.";
	}
	
}
