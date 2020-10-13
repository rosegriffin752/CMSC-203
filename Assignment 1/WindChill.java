//Rose Griffin
//calculates the wind chill using the temperature in fahrenheit and wind speed.
import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		
		final double NUM1 = 35.74, NUM2 = 0.6215, NUM3 = 35.75, NUM4 = 0.4275;
		double windChill, windSpeed, tempInFah;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Wind Chill Calculator\n\nEnter the temperature in Fahrenheit (must be >= -45 and <= 40): ");
		tempInFah = input.nextDouble();
		
		if (!(tempInFah >= -45 && tempInFah <= 40)) {
			System.out.println("Invalid temperature");
		} else {
			System.out.println("Enter the wind speed (must be >= 5 and <= 60): ");
			windSpeed = input.nextDouble();
			if (!(windSpeed >= 5 && windSpeed <= 60)) {
				System.out.println("Invalid wind speed");
			} else {
				windChill = NUM1 + (NUM2*tempInFah) - NUM3*(Math.pow(windSpeed, 0.16)) + NUM4*tempInFah*(Math.pow(windSpeed, 0.16)); //Calculate wind chill
				System.out.println("\nWind chill temperature: " + windChill + " degrees Fahrenheit");
			}
		}
		System.out.println("\nProgrammer: Rose Griffin");
		input.close();
	}

}





