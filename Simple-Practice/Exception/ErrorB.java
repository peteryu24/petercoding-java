public class ErrorB {
	public static void main(String[] args) {

		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace(); // System.out.println(); <- no need
		}
	}
}
// e.getMessage()  ->  "/ by zero"

// e.toString()  ->  "java.lang.ArithmeticException: / by zero"

// e.printStackTrace();  ->  "java.lang.ArithmeticException: / by zero
//                             at ErrorB.main(ErrorB.java:5)" 
