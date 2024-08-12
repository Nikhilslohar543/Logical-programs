package For_loop;

public class Sumof_1_to_11_evenodd {

	public static void main(String[] args) {

		int even =0;
		int odd=0;
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				odd += i;
			}
		}
		System.out.println("sum of 1 to 10 odd numbrs : " +odd);
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				even += i;
			}
		}
		System.out.println("sum of 1 to 10 even numbrs : " + even);

	}

}
