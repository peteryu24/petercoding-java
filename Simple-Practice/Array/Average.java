import java.util.Scanner;

public class ArrayAverage {

	public static void main(String[] args) {

		int sum = 0, average = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("How many numbers? ");
		int num = scan.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the number for each: ");
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i]; //  sum = sum = arr[i]
		}
		average = sum / num;

		System.out.print("The average for the numbers is: " + average);

	}

}
