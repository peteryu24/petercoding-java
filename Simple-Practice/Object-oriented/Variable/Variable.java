public class Variable {
	static int i; // global variable

	static void a() {
		i = 0; // int i = 0; will end the infinity 'for' loop
	}

	public static void main(String[] args) {
		for (i = 0; i < 5; i++) { // no statement for 'i'
			a(); // keeps changing 'i' to zero.
			System.out.println(i);
		} // infinity loop

		for (int i = 0; i < 5; i++) { // statement for 'i'
			a();
			System.out.println(i);
		}
	}

}
