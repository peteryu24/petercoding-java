import java.util.Scanner;

public class Factorial {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n= scan.nextInt();
		System.out.println(factorial(n));
	}
	static int factorial(int a) {
		if(a<=1) {
			return a;
		}else {
			return (a*factorial(a-1));
		}
	}
}
