package PrimitiveDataTypes;

public class reverseNumber {

	public static void main(String[] args) {
		int number = 1234;
		int t = (int) (Math.floor(number / 1000));
		int h = (int) ((Math.floor(number - 1000) / 1000) * 10);
		int ten = (int) ((Math.floor(number - 1200) / 100) * 10);
		int one = (int) (Math.floor(number - 1230));
		System.out.println("The original number is: " + number);
		System.out.println("The reversed number is: " + one+""+ten+""+h+""+t);
		
	}

}
