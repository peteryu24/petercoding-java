import java.util.Scanner;

public class IfWhichIsBigger {

	public static void main(String[] args) {
		int x, y, max = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		x = scan.nextInt();

		System.out.print("Enter the second number: ");
		y = scan.nextInt();

		if (x > y) {
			max = x;

		} else if (x < y) {
			max = y;
		} else {
			System.out.println("Error"); // Two numbers are the same.
			System.exit(0);
		}

		System.out.println("The bigger number is " + max);

	}

}
