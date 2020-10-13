/**
*Calculates sphere volume
*Rose Griffin
*
*/

import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double diam;
		double radius;
		double volume;
		
		System.out.println("Calculate sphere volume");
		System.out.println("Enter diameter: ");
		diam = input.nextDouble();
		
		radius = diam/2;
		volume = (4*Math.PI*Math.pow(radius, 3))/3;
				
		System.out.println("Volume: " + volume);

	}

}


