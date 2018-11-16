package strings;

import java.util.Scanner;

public class GetTheIndex {

	public static void main(String[] args) {
		String S = "ABCDEFGHIJKLMNOPQRSTUVWXYZÅÄÖ";
		System.out.println(S);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type a position in the alphabet between 0 and 28 to get the letter: ");
		int pos = scanner.nextInt();
		int index = S.charAt(pos);
		
		System.out.println((char)index);

	}

}
