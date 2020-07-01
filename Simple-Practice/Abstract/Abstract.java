abstract class Alpha {
	abstract void a(); // abstract method. Must define by inheriting
			   // abstract method cannot have a logic
	void b() {
		System.out.println("Hello.");
	}
}

class B extends Alpha {
	void a() {
		System.out.println("Abstract"); // defined
	}
}

public class Abstract {
	public static void main(String[] args) {
		B obj = new B();
		obj.a();
	}
}
