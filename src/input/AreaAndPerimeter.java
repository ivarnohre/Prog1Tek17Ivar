package input;

import java.util.Scanner;

public class AreaAndPerimeter {

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter your width: ");
		double width = inputScanner.nextDouble();
		System.out.println("Enter your height: ");
		double height= inputScanner.nextDouble();
		
		System.out.println("Area: " + width * height);
		System.out.println("Perimeter: " + 2 *(height + width));

	}

}
