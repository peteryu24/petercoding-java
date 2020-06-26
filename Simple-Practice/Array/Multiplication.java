
public class ArrayMultiplication {

	public static void main(String[] args) {

		int[][] arr = new int[10][10];

		for (int i = 1; i < arr.length; i++) { //  array starts with 0, but multiplication with 0 is unnecessary
			for (int j = 1; j < arr.length; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}

	}

}
