package operator;

import java.util.Scanner;

public class CompareTwoNumbers {

	public static void main(String[] args) {

		Scanner scanner1 = new Scanner(System.in);
		System.out.print("Input first number: ");
		int n1 = scanner1.nextInt();
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("Input second number: ");
		int n2 = scanner2.nextInt();
		
		if (n1 == n2) {
			System.out.println(n1 + "==" + n2);
		}
		if (n1 <= n2) {
			System.out.println(n1 + "<=" + n2);
		}
		if (n2 <= n1) {
			System.out.println(n2 + "<=" + n1);
		}
		}
		
	}
  

