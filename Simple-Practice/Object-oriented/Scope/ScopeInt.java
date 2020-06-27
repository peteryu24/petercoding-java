
public class ScopeInt {
	static int i = 3; // global variable

	static void a() {
		int i = 5; // local variable
		b();
	}

	static void b() {
		System.out.println(i); // will use a global variable
	}

	public static void main(String[] args) {
		a();
	}
}
