package loops;

public class While35 {

	public static void main(String[] args) {
		
		int three = 3;
		int five = 5;
		
		System.out.println("The following numbers are divisible by 3");
		while(three <= 99) {
			System.out.println(three += 3); {
				  if(three == 99) {
					 break;
				 }
					
			}
			
		}
		System.out.println("The following numbers are divisible by 5");
		while(five <= 100) {
			System.out.println(five += 5); {
				if(five == 100) {
					break;
				}
			}
		}
	}
}


