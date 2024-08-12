package For_loop;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter number :");
		int a = s.nextInt();
		int fact =1;
		
		for(int i=1; i<=a; i++) {
			fact*=i;
		}
		System.out.println("Factorial of "+a+": "+fact);
		
	}

}
