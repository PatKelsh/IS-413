package temperature;

public class Celsius {
	
	private int temperature;
	
	public Celsius(int temp){
		this.temperature = temp;
	}
	
	public int convertToFahrenhiet(){
//		((temperature-32)*5)/9
		return ((temperature * 9) / 5) + 32;
	}
	
	public int getTemp(){
		return temperature;
	}

}
