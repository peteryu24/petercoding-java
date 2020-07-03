class Arithmetic {
	int one, two;

	void setNum(int one, int two) {
		this.one = one;
		this.two = two;
	}

	void divide1() {
		if (this.one == 0 || this.two == 0) {
			throw new ArithmeticException();
		}
		// it will stop here
		if (this.one > this.two) {
			System.out.println(this.one / this.two);
		} else {
			System.out.println(this.two / this.one);
		}
		System.out.println("Will this print?"); // No it won't.
	}

	void divide2() {
		if (this.one == 0 || this.two == 0) {
			throw new ArithmeticException("There can't be a zero.");
		}
		// it will stop here
		if (this.one > this.two) {
			System.out.println(this.one / this.two);
		} else {
			System.out.println(this.two / this.one);
		}
		System.out.println("Will this print?"); // No it won't.
	}
}

public class ThrowNew {
	public static void main(String[] args) {

		Arithmetic ar = new Arithmetic();
		ar.setNum(10, 0);
		try {
			ar.divide1();
		} catch (ArithmeticException a) {
			System.out.println("There can't be a zero.");
		}
		try {
			ar.divide2();
		} catch (ArithmeticException b) {
			System.out.println(b.getMessage()); // b.getMessage() : "There can't be a zero."
		}
	}
}
