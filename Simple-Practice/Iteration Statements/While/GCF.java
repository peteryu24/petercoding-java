import java.util.*;

public class GCF {
	public static void main(String[] args) {
		int x, y, r;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter two num: ");
		x = scan.nextInt();
		y = scan.nextInt();

		if (x > y) {
			while (y != 0) {
				r = x % y;
				x = y;
				y = r;
			}
			System.out.println("Greatest Common Factor is " + x);
		} else {
			while (x != 0) {
				r = y % x;
				y = x;
				x = r;
			}
			System.out.println("Greatest Common Factor is " + y);
		}

	}
}
