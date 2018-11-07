package input;

import java.util.Scanner;

public class DecimalToHexadecimal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int num = input.nextInt();

		int rem;
		String string = "";

		char hexa[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

		while (num > 0) {
			rem = num % 16;
			string = hexa[rem] + string;
			num = num / 16;
		}
		System.out.println("The hexadecimal number is: " + string);
	}

}
