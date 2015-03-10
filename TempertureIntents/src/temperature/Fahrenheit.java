package temperature;

/**
 * Package to hold a record of the temperature in Fahrenheit with related
 * methods
 * 
 * @author Pat Kelsh & Geethika
 * 
 */
public class Fahrenheit {
	private double temperature;

	public Fahrenheit(double startTemp) {
		this.temperature = startTemp;
	}

	/**
	 * Converts the temperature to Celsius
	 * 
	 * @return The temperature converted to Celsius
	 */
	public double convertToCelsius() {
		double conversion = ((temperature - 32) * 5) / 9;
		return conversion;
	}

	public double getTemp() {
		return temperature;
	}
}
