
public class Fahrenheit {
	private double temperature;
	
	public Fahrenheit(double temp){
		this.temperature = temp;
	}
	
	public double convertToCelsius(){
		double show = ((temperature-32)*5)/9;
		return show;
	}

	public double getTemp(){
		return temperature;
	}
}
