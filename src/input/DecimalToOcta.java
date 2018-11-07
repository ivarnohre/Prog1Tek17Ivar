package input;

import java.util.Scanner;

public class DecimalToOcta {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int num = input.nextInt();

		int rem;
		String string = "";

		char[] octa = {'0', '1','2', '3', '4', '5', '6', '7'};

		while (num > 0) {
			rem = num % 8;
			string = octa[rem] + string;
			num = num / 8;
		}
		System.out.println("The octal number is: " + string);

	}

}
