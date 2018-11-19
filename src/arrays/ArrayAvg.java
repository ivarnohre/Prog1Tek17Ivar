package arrays;

public class ArrayAvg {

	public static void main(String[] args) {
		//Try changing numbers below
		int[] array = {2, 4, 29, 123};
		int sum = 0;
		int avg = 0;
		
		for (int i = 0; i < array.length; i++)
		{
		  sum = sum + array[i];
		   avg = (sum / array.length);
		}
       System.out.println("The average is: " + avg);

	}

}
