import java.util.Scanner;

public class ForSubmultiple {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a positive number: ");
		int num = scan.nextInt();

		System.out.println(num + "\'s submultiples are ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i +" ");
			}
		}

	}

}
