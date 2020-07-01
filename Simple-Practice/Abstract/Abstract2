abstract class Set {
	int one, two;

	void setOprands(int one, int two) {
		this.one = one;
		this.two = two;
	}

	abstract void sum();

	abstract void minus();

	void math() {
		sum();
		minus();
	}
}

class Define extends Set {
	void sum() {
		System.out.println(this.one + this.two); // defined
	}

	void minus() {
		if (this.one > this.two) {
			System.out.println(this.one - this.two); // defined
		} else {
			System.out.println(this.two - this.one);
		}
	}
}

public class Abstract2 {
	public static void main(String[] args) {
		Define def = new Define();
		def.setOprands(3, 1);
		def.math();
	}
}
