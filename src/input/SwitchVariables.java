package input;

import java.util.Scanner;

public class SwitchVariables {

	public static void main(String[] args) {
		
		int a, b, temp;
		Scanner inputScanner = new Scanner(System.in);
		 System.out.println("Enter first number"); {
		 a = inputScanner.nextInt(); }
		 System.out.println("Enter second number"); {
		 b = inputScanner.nextInt(); }
		
		System.out.println("A = " + a + ", B = " + b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swapping : A = "+ a + " B = " + b);

	}

}
