package loops;

public class SumAndAverage {

	public static void main(String[] args) {
		
		int sum = 0;
		int lower = 1;
		int upper = 100;
		int number = lower;
		
		for (number = lower; number <= upper; number++) {
			System.out.println(sum += number);
			
			
			
		}
		double average =((sum += number) / 100.0);
		System.out.println(average);
		
		
	}

}
