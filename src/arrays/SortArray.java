package arrays;

public class SortArray {

	public static void main(String[] args) {
		// Try changing numbers in array
		int[] array = { 2, 4, 7, 11, 19, 38 };
        
		//temp used for switching numbers
		int temp;
		//to check if code needs to run multiple times
		boolean isComplete = false;
		while (isComplete = false) {
			isComplete = true;

			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] < array[i + 1]) {
					temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;
					isComplete = false;
				}
			}

		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
		}
		System.out.println("Sorting complete!");
	}
}
