package input;

import java.util.Scanner;

public class AreaHexagon {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the side length of the hexagon: ");
		double s = scanner.nextDouble();

		if (s <= 0) {
			System.out.println("Invalid Number!");
		} else {
			double sSq = Math.pow(s, 2);
			System.out.println("The Area is: " + (3 * Math.sqrt(3) / 2) * sSq);

		}

	}

}
