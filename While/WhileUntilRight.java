import java.util.Scanner;

public class WhileUntilRight {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;

		do {
			System.out.print("Enter a number between 1~5: ");
			num = scan.nextInt();
		} while (num < 1 || num > 5); // loops until it's false

	}

}
