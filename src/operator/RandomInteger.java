package operator;

import java.util.Random;

public class RandomInteger {

	public static void main(String[] args) {
		
		Random random = new Random();
		//500 is the range of random integer
		//+1 so value wont be 0
		int n = random.nextInt(500) + 1;
		
		System.out.println(n);

	}

}
