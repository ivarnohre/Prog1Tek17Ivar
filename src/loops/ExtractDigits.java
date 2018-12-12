package loops;

import java.util.Scanner;

public class ExtractDigits {
 /**
  * This program will extract digits from a multi digit integer.
  * @param args
  */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type a number to extract digits: ");
		int n = scanner.nextInt();
		
		while (n > 0) {
			int digit = n % 10;
			n = n / 10;
			System.out.println(digit);
		}
        
	}

}
