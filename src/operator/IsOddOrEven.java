package operator;

import java.util.Scanner;

public class IsOddOrEven {
    //this program will test if a integer is even or odd.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		int num = scanner.nextInt();
		//if a number remainder when divided by 2 equals 0 it is a even number
		if (num % 2 == 0) {
			System.out.println(num + " is even.");
		//otherwise it is odd.
		}
		else {
			System.out.println(num + " is odd.");
		}

	}

}
