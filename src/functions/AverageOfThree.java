package functions;

import java.util.Scanner;

public class AverageOfThree {

	public static void main(String[] args) {
		
		averageOfThree(input());
		

	}
	
	 

	public static int[]  input() {
		
		Scanner scanner = new Scanner(System.in);
		int[] inputs = new int[3];
		System.out.println("Input the first number: ");
		inputs[0] = scanner.nextInt();
		System.out.println("Input the Second number: ");
		inputs[1] = scanner.nextInt();
		System.out.println("Input the third number: ");
		inputs[2] = scanner.nextInt();
		return inputs;
	}
	
	public static void averageOfThree(int[] inputs) {
	
		System.out.print("The average value is: " + (inputs[0] + inputs[1] + inputs[2])/ 3);
		
			
			
		}
		
		
	}