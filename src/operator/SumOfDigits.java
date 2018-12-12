package operator;

import java.util.Scanner;

 /**
 * Computes the sum of the digits in a integer. Flowchart is available
 * author Ivar Nohre
 */

public class SumOfDigits {
	
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type a number: "); //This integer will be used
		int n = scanner.nextInt();
		int sum = 0; //This value will be the final sum
		
		while (n > 0) { //To keep loop running until finished
			sum = sum + n % 10; //Number % 10 will give the last digit
			n = n / 10; //Divide by ten to access next digit
		}
		System.out.println("The sum is: " + sum); //Print
	}
}