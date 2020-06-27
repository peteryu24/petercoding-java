class Class {

	public static void add(int left, int right) {
		System.out.println(left + right);
	}

	public static void minus(int left, int right) {
		if (left > right) {
			System.out.println(left - right);
		} else {
			System.out.println(right - left);
		}
	}
}

public class StaticClass {
	public static void main(String[] args) {

		Class.add(20, 30);
		Class.minus(40, 30);
	}
}