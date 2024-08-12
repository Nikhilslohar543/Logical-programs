package While_Loop;
import java.util.Scanner;
public class Reverse_number {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number :");
		int a = s.nextInt();
		int rev=0;
		while(a!=0) {
			int i = a%10;
			rev=rev*10+i;
			a=a/10;
		}
		System.out.println("Reversed number is : "+rev);
		
	}

}
