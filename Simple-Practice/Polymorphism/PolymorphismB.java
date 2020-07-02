interface I {
}

class C implements I {
}

public class PolymorphismB {
	public static void main(String[] args) {
		I obj = new C();
	}
}
