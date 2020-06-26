import java.util.Scanner;

public class IfPositiveOrNegative {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		int num = scan.nextInt();

		if (num > 0) {
			System.out.println("It is a positive number.");
		} else if (num < 0) {
			System.out.println("It is a negative number.");
		} else {
			System.out.println("It is zero.");
		}
	}

}
