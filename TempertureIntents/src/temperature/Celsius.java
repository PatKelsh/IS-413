package temperature;

public class Celsius {
	
	private double temperature;
	
	public Celsius(double temp){
		this.temperature = temp;
	}
	
	public double convertToFahrenhiet(){
//		((temperature-32)*5)/9
		return ((temperature * 9) / 5) + 32;
	}
	
	public double getTemp(){
		return temperature;
	}

}
