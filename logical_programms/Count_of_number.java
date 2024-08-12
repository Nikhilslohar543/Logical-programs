package While_Loop;

import java.util.Scanner;

public class Count_of_number {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter digit :");
		int a = s.nextInt();
		int count = 0;

		while (a != 0) {
			int i = a % 10;
			count++;
			a /= 10;
		}

		System.out.println("Total count of digit : " + count);

	}

}
