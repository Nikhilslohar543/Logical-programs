package While_Loop;

import java.util.Scanner;

public class Sum_Of_Digit {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter digit :");
		int a = s.nextInt();
		int sum = 0;
		while (a!=0) {

			int i = a % 10;
			sum += i;
			a = a / 10;
		}
		System.out.println("sum of enterd digit : "+sum);

	}

}
