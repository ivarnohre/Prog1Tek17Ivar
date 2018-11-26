package loops;

public class OddNumbers {

	public static void main(String[] args) {

		int i = 0;

		while (i <= 100) {
			i = i + 1;
			if (i % 2 == 1) {
				System.out.println(i);

			}
			if (i == 100) {
				break;

			}

		}
	}
}
