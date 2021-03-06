package temperature;

/**
 * Package to hold a record of the temperature in Fahrenheit with related
 * methods
 * 
 * @author Pat Kelsh & Geethika
 * 
 */
public class Fahrenheit {
	private int temperature;

	public Fahrenheit(int temp) {
		this.temperature = temp;
	}

	/**
	 * Converts the temperature to Celsius
	 * 
	 * @return The temperature converted to Celsius
	 */
	public int convertToCelsius() {
		int conversion = ((temperature - 32) * 5) / 9;
		return conversion;
	}

	public int getTemp() {
		return temperature;
	}
}
