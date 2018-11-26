package strings;

import java.util.Scanner;

public class GetTheIndex {
    //This declares a string as the Swedish alphabet
	public static void main(String[] args) {
		String S = "ABCDEFGHIJKLMNOPQRSTUVWXYZÅÄÖ";
		System.out.println("The Swedish alphabet looks like this: " + S);
		
		//Scans a number and uses that number in the position 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type a position in the alphabet between 0 and 28 to get the letter: ");
		int pos = scanner.nextInt();
		int index = S.charAt(pos);
		
		System.out.println("The letter is: " + (char)index);

	}

}
