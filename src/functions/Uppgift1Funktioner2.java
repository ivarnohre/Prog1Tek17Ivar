package functions;

import java.util.Scanner;

public class Uppgift1Funktioner2 {
    /**
     * Runs the LargestAmongThree function
     * @param args
     */
	public static void main(String[] args) {
		
		largestAmongThree(input());
		

	}
	/**
	 * For input/scanners
	 * @return
	 */
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
	/**
	 * Sorts and gets the largest number
	 * @param inputs
	 */
	public static void largestAmongThree(int[] inputs) {
		int tempVar;
		if (inputs[0] > inputs[1]) {
			tempVar = inputs[0];
		} else {
			tempVar = inputs[1];
		}
		System.out.print("The largest value is: ");
		if (tempVar > inputs[2]) {
			System.out.println(tempVar);
		} else {
			System.out.println(inputs[2]);
			
			
		}
		
		
	}

}
