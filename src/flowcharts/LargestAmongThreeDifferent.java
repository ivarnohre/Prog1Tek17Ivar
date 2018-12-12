package flowcharts;

import java.util.Scanner;

/**
 * Returns largest value among three integers
 * @author ivar.nohre
 *
 */

public class LargestAmongThreeDifferent {
	
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		//START
		
		int a, b, c; //Declare variables A, B, and C
		Scanner input = new Scanner(System.in);
		a = input.nextInt(); //Read A
		b = input.nextInt(); //Read B
        c = input.nextInt(); //Read C
        
        //Is A larger than B?
        if (a > b) {
        	   //If true
        	if (a > c) {
        		//If True
        		System.out.println("A");
        	} else {
        		//If False
        		System.out.println("B");
        	}
        } else {
        	   //If false
        	if (b > c ) {
        		//If true
        		System.out.println("B");
        	} else {
        		//If false
        		System.out.println("C");
        	}
        }
        
        
        
        
	}

}
