package input;

import java.util.Scanner;

public class BinaryConvert {

	public static void main(String[] args) {
		int decimal = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input a decimal number");
		decimal = scanner.nextInt();
		
		System.out.println(Integer.toBinaryString(decimal));
		
		
	}
  }


