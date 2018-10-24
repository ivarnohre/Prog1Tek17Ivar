package input;

import java.util.Scanner;

public class TwoNumberInput {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int x = inputScanner.nextInt();
		System.out.println(x);
		int y = inputScanner.nextInt();
		System.out.println(y);
		
		System.out.println("X + Y = " + (x + y));
		

	}

}
