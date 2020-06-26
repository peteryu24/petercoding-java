import java.util.Scanner;

public class ArrayMinimum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter ten words randomly: ");
			arr[i] = scan.nextInt();
		}

		int mini = arr[0]; // setting the minimum

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < mini) {
				mini = arr[i]; //  changes the minimum
			}
		}
		System.out.println("The minimum number is: " + mini + ".");
	}

}
