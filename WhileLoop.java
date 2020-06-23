import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the sentence you want to loop: ");
		String loop = scan.nextLine();

		System.out.print("How many times do you want to loop it? ");
		int times = scan.nextInt();

		int i = 0;

		while (i < times) {
			System.out.println(loop);
			i++;
		}

	}

}
