package PrimitiveDataTypes;

public class specifiedDecimals {

	public static void main(String[] args) {
		float floatNumber =  12.565659f;
		int numberOfDecimals = 2;
		double rounder = Math.pow(10, numberOfDecimals);
		
		double round = Math.round(floatNumber * rounder)/rounder;
		System.out.println(round);
	    
        
		 
	}

}
