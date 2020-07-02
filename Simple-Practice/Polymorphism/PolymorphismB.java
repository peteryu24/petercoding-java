class A {
	public String x() {
		return "x";
	}
}

class B extends A {
	public String y() {
		return "y";
	}
}

public class PolymorphismB {
	public static void main(String[] args) {
		A obj = new B();
		obj.x();
		// obj.y(); error because class A doesn't hava a 'y' method
	}
}
