package input;

import java.util.Scanner;

public class NplusNNplusNNN {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to be calculated: " );
		int n = scanner.nextInt();
		
		if (n <= 0) {
			System.out.println("Invalid Number!");
		} else {
			int Num2 = ((n * 10)+ n);
			int Num3 = (((n * 100)+ n * 10)+n);
			
			System.out.println("Input Number: " + n);
			System.out.println("Answer: " + (n + Num2 + Num3));
		}
		
		
		

	
	}
}
