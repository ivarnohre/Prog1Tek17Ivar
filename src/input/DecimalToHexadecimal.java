package input;

import java.util.Scanner;

public class DecimalToHexadecimal {
 /**
  * This program changes a regular number to hexadecimal (16-system)
  * @param args
  */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int num = input.nextInt();

		int rem; //to store the converted number
		String string = ""; //to store the answer in hexa.

		char hexa[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' }; //hexadecimal number system

		while (num > 0) { //loop will run until the whole number is used.
			rem = num % 16; //will store the numbers remainder when divided by 16
			string = hexa[rem] + string; //Will write the remainder in hexadecimal by using the char
			num = num / 16; //divide by 16. If the number is still greater than 0 after this the loop will run again.
		}
		System.out.println("The hexadecimal number is: " + string); //Print.
	}

}
