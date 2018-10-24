package input;

import java.util.Scanner;

public class AreaPerimeter {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter your radius: "); 
		double radius = inputScanner.nextDouble();
		
		
		System.out.println("Area is: " + radius * radius * Math.PI);
		System.out.println("Perimeter is: " + 2 * Math.PI * radius);
		
		
		

	}

}
