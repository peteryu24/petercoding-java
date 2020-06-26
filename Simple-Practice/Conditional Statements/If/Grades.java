import java.util.Scanner;

public class IfGrades {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;
		char grade;

		System.out.print("Enter your score: ");
		num = scan.nextInt();

		if (num > 90) {
			grade = 'A';
		} else if (num > 80) {
			grade = 'B';
		} else if (num > 70) {
			grade = 'C';
		} else {
			grade = 'F';
		}

		System.out.println("Your score is  " + grade + ".");

	}

}
