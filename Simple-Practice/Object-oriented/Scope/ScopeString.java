public class ScopeString {
	static void a() {
		String str = "Hello World."; // stated in a method.
	}

	public static void main(String[] args) {
		a();
		// System.out.println(str); Java won't be able to find str.
	}
}