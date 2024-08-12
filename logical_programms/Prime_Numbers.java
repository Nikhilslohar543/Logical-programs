package For_loop;
import java.util.Scanner;
public class Prime_Numbers {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		boolean fact = true;
		
		System.out.print("Enter number to check prime or not :");
		int a = s.nextInt();
		
		if(a<=1) {
			fact=false;
		}
		
		for(int i=2; i<=a/2; i++) {
			if(a%2==0) {
				fact=false;
				break;
			}
		}		
		
		if(fact) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("number is not prime");
		}
		
	}

}
