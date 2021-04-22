import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter for checking: ");
		String palindrome = scan.next();
		checkPalin(palindrome);
		if (checkPalin(palindrome) == true) {
			System.out.println(palindrome + " is a palindrome.");
		} else {
			System.out.println(palindrome + " is not a palindrome.");
		}
	}

	static Boolean checkPalin(String s) {
		return determinPalin(s, 0, s.length() - 1);
	}

	static Boolean determinPalin(String s, int i, int j) {
		if (i >= j) {
			return true;
		} else if (s.charAt(i) != s.charAt(j)) {
			return false; // checking each end
		} else {
			return (determinPalin(s, i + 1, j - 1)); // Recursive function
		}
	}
}
