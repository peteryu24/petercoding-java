import java.util.Scanner;

public class ArrayNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scan.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i; //  arr[0] = 0, arr[1] = 1, arr[2] =2, ......
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
