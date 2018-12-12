package operator;

import java.util.Scanner;
 /**
  * This program will determine ugly numbers. A ugly number is a number whos only prime factors are 2,3 or 5.
  * @author ivar.nohre
  *
  */
public class UglyNumbers {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        System.out.print("Write a number: ");
        int n = in.nextInt();  		
         {
           
        }
		int x = 0;
        while (n != 1) { //run code below if n is not equal to 1. 1 Is counted as a ugly number
            if (n % 5 == 0) { //check if 5 is a prime factor of the number
            	System.out.print("It is an ugly number.");
            	break; //break the code
            } else if (n % 3 == 0) { //check if 3 is a prime factor of the number
            	System.out.print("It is an ugly number.");
            	break; //break the code
            } else if (n % 2 == 0) { //check if 2 is a prime factor of the number
            	System.out.print("It is an ugly number.");
            	break; //break the code
            } else {
                System.out.print("It is not an ugly number.");
                x = 1;
				break;
            }
        }
       
	
	    }
}
