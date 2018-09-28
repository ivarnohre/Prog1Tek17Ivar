package input;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter your name:");

		String name = inputScanner.nextLine();

		System.out.println("Hello " + name);

		System.out.print("Enter your weight in kilograms: ");

		double weight = inputScanner.nextDouble();

		if (weight < 30) {
			System.out.println("That's too little. Gain some weight.");
		} else {

			System.out.println("Your weight is " + weight + "KG");

			System.out.print("Enter your age: ");

			int age = inputScanner.nextInt();

			if (age > 120) {
				System.out.println("I do not belive you! You lying piece of shit.");
			} else if (age < 5) {
				System.out.println("No, thats too young.");

			} else {
				System.out.println("Your age is: " + age);
			}

		}
	}

}
