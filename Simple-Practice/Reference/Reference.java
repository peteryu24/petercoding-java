class A {
	public int value;

	A(int value) {
		this.value = value;
	}
}

public class Reference {
	public static void run1() {
		int a = 1;
		int b = a; // copy
		b = 2;
		System.out.println("run1: " + a); // 1
	}

	public static void run2() {
		A a = new A(1); // primitive data type != data type with 'new'
		A b = a; // Reference: Instance A is shared by a and b. Changing either one of them will affect each other.
		b.value = 2; // b.value == a,value
		System.out.println("run2: " + a.value); // 2
	}

	public static void run3() {
		A a = new A(1);
		A b = a;
		b = new A(2); // Declaring 'new' , a and b have a different instance . Changing b will not affect a
		System.out.println("run3: " + a.value); // 1

	}

	static void run4(A b) {
		b = new A(2); // Declaring 'new' , a and b have a different instance . Changing b will not affect a
	}
	static void run_run4() {
		A a = new A(1);
		run4(a);
		System.out.println("run4: " + a.value); // 1
	}

	static void run5(A b) {
		b.value = 2; //  Reference: Instance A is shared by a and b. Changing either one of them will affect each other.
	}

	static void run_run5() {
		A a = new A(1);
		run5(a);
		System.out.println("run5: " + a.value); // 2
	}

	public static void main(String[] args) {
		run1();
		run2();
		run3();
		run_run4();
		run_run5();
	}

}
