package operator;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type a number: ");
		int n = scanner.nextInt();
		int sum = 0;
		
		while (n > 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		System.out.println("The sum is: " + sum);
	}
}