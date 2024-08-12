package For_loop;

public class Sumof_1_to_11_even {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("sum of 1 to 10 even numbrs : " + sum);

	}

}
