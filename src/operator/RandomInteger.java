package operator;

import java.util.Random;

public class RandomInteger {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int n = random.nextInt(50) + 1;
		
		System.out.println(n);

	}

}
