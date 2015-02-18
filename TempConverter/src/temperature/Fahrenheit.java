package temperature;

public class Fahrenheit {
	private int temperature;
	
	public Fahrenheit(int temp){
		this.temperature = temp;
	}
	
	public int convertToCelsius(){
		int show = ((temperature-32)*5)/9;
		return show;
	}

	public int getTemp(){
		return temperature;
	}
}
