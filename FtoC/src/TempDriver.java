
public class TempDriver {
	
	public static void main(String[] args){
		
		if(args.length != 0){
			
			double temp = Double.parseDouble(args[0]);
			Fahrenheit fahr = new Fahrenheit(temp);
			Celsius cel = new Celsius(fahr.convertToCelsius());
//			Celsius cel = new Celsius(temp);
//			Fahrenheit fahr = new Fahrenheit(cel.convertToFahrenhiet());
			
			System.out.println("The temp in Fahrenheit is " + fahr.getTemp());
			System.out.println("The temp in Celsius is " + cel.getTemp());
		}
	}

}
