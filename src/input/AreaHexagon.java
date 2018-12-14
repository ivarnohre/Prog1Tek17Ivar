package input;

import java.util.Scanner;

public class AreaHexagon {
    /**
     * This will calculate the area of a hexagon given the side length.
     * @param args
     */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the side length of the hexagon: ");
		double s = scanner.nextDouble();

		if (s <= 0) {
			System.out.println("Invalid Number!");
		} else {
			double sSq = Math.pow(s, 2); //Side length to the power of 2, is used in the calculation.
			System.out.println("The Area is: " + (3 * Math.sqrt(3) / 2) * sSq); //this calculation goes as:
			//((3 times the power of 3) divided by 2) times the side length to the power of 2
			

		}

	}

}
