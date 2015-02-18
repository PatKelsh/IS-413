package temperature;

public class TempDriver {

	public static void main(String[] args) {

		if (args.length != 0) {

			if (args.length != 0) {

				int temp = Integer.parseInt(args[0]);
				Fahrenheit fahrenheit = new Fahrenheit(temp);
				Celsius celsius = new Celsius(fahrenheit.convertToCelsius());
				// Celsius cel = new Celsius(temp);
				// Fahrenheit fahr = new Fahrenheit(cel.convertToFahrenhiet());

				System.out.println("The temp in Fahrenheit is "
						+ fahrenheit.getTemp());
				System.out.println("The temp in Celsius is "
						+ celsius.getTemp());
			}
		}
	}

}
