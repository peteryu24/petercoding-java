class Kcal {
	int left, right;
	static int i = 1;

	public void go(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void add() {
		System.out.println(this.left + this.right + 3);
	}
}

public class Cal2 {
	public static void main(String[] args) {

		Kcal kc = new Kcal();
		kc.go(3, 5);
		kc.sum();
		kc.add();

		System.out.println(kc.i); // i = 1;
		System.out.println(Kcal.i); // needs to be static

		kc.go(5, 4);
		kc.sum();
		kc.add();
	}
}
