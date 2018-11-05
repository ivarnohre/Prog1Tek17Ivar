package arrays;

public class SortArray {

	public static void main(String[] args) {
		//Try changing numbers in array
		int[] array = {2, 4, 7, 11, 19, 38};
		
		int temp;
		
		for (int i = 1; i < array.length; i++) {
			for ( int j = i; j > 0; j--) {
				if (array[j] < array [j - 1]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
					
				}
			}
		}
       for (int i = 0; i < array.length; i++) {
    	   System.out.println(array[i]);
       }
	}

}
