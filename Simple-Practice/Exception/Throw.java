class A {
	void run() throws ArithmeticException {
		System.out.println(3 / 0); // ArithmeticException thrown -> no error detected
	}
}

class B {
	void run() {
		A a = new A();
		try { // catching
			a.run();
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage()); // -> / by zero
		}

	}
}

public class Throw {
	public static void main(String[] args) {
		B b = new B();
		b.run();

	}
}
