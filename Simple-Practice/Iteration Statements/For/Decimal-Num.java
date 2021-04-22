import java.util.*;

public class Decimal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("insert num: ");
		int n = scan.nextInt();

		dec(n);

	}

	static void dec(int a) {
		int[] array = new int[a];

		int arr = 0;
		if (a <= 1) {
			System.out.println("None.");
		} else {

			for (int i = 2; i <= a; i++) {
				int count = 0;
				for (int j = 2; j < i; j++) {
					if ((i % j) == 0) {

						count++;
						break;
					}
				}
				if (count == 0) {
					array[arr] = i;
					arr++;
				}
			}
			for (int i = 0; i < array.length; i++) {
				if (array[i] != 0) {
					System.out.print(array[i] + " ");
				}
			}
		}
	}

}
