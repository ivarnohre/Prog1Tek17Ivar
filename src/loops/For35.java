package loops;

public class For35 {
 /**
  * this program shows all numbers divsible by 3 or 5 between 1 and 100
  * @param args
  */
	public static void main(String[] args) {
		int three = 3;
		int five = 5;
		
		System.out.println("Numbers divisible by five are:");
		for(five = 5; five < 100; five+= 5) {
			System.out.println(five); 
				if(five == 100) {
					break;
			}
			
		}
        System.out.println("Numbers divisible by three are:");
		for(three = 3; three < 100; three+= 3) {
			System.out.println(three);
			if(three == 99) {
				break;
			}
		}
		
		
		
	}

}
