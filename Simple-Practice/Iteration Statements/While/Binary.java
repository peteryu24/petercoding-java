import java.util.*;

public class Binary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int num = scan.nextInt();

		while (num > 0) {
			System.out.print(num % 2);
			num /= 2;

		}

	}
}
