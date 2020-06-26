import java.util.Scanner;

public class SwitchGrades {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int score, num;
		char grade;

		System.out.print("Enter your score: ");
		score = scan.nextInt();

		num = score / 10; //  Easier for cases

		switch (num) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			grade = 'F';
			break;
		}

		System.out.println("Your grade is " + grade + ".");
	}

}
