public class ErrorA {
	public static void main(String[] args) {

		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println("The Error is : " + e.getMessage());
			// Error is :   / by zero
		}
	}
}
