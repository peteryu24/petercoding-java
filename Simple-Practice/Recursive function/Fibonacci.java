import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = scan.nextInt();
		System.out.println(fibo1(n));
		System.out.println(fibo2(n));
	}

	static int fibo1(int a) {  // Recursive Funtion
		if (a <= 1) {
			return 0;
		} else if (a == 2) {
			return 1;
		} else {
			return (fibo1(a - 1) + fibo1(a - 2));
		}
	}

	static int fibo2(int a) { // Loop
		int num1 = 0;
		int num2 = 1;
		int sum = 1;
		if (a <= 1) {
			return 0;
		} else if (a == 2) {
			return 1;
		} else {
			for (int i = 2; i < a; i++) {
				sum = num1 + num2;
				num1 = num2;
				num2 = sum;
			}
			return sum;
		}
	}
}
