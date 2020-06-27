class Cla {
	int a = 10;

	public void print() {
		int a = 30;
		System.out.println(a); // will print local variable
		System.out.println(this.a); // will print global variable
	}
}

public class ScopeThis {
	public static void main(String[]  args) {
		Cla cl = new Cla();
		cl.print();
	}
}
