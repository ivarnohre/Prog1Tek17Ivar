package input;

import java.util.Scanner;

public class TakeThreeNumbers {

	public static void main(String[] args) {

		Scanner inputScanner = new Scanner(System.in);
		double N1 = inputScanner.nextDouble();
		double N2 = inputScanner.nextDouble();
		double N3 = inputScanner.nextDouble();
		
		System.out.println((N1 + N2 + N3) / 2);

	}

}
