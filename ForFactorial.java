import java.util.Scanner;

public class ForFactorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long fac = 1; // incase of a huge number , always set to '1' when multiplying
		int num;

		System.out.print("Enter a number: ");
		num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			fac *= i; // fac = fac * i
		}

		System.out.printf("%d! is %d. ", num, fac); // %d gives a fixed number

	}

}
