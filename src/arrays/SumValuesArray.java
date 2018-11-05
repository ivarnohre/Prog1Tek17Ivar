package arrays;

public class SumValuesArray {

	public static void main(String[] args) {
		//Try changing the numbers
		int[] array = {2, 4, 29, 23};
		int sum = 0;
		
		for (int i = 0; i < array.length; i++)
		{
		  sum = sum + array[i];
		}
       System.out.println("The sum is: " + sum);
	}
    
}
