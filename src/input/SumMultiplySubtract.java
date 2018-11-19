package input;

import java.util.Scanner;

public class SumMultiplySubtract {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Input the first number: ");
		int x = inputScanner.nextInt();
		System.out.print("Input the second number: ");
		int y = inputScanner.nextInt();
		
		
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x mod y = " + (x % y));

	}

}
