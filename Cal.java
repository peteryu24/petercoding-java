class Calcal {
	int left, right;

	public void setNum(int left, int right) {
		this.left = left; // cal1 = 10, cal2 = 20
		this.right = right; // cal1 = 20, cal2 = 30
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class Cal {

	public static void main(String[] args) {

		Calcal cal1 = new Calcal();
		cal1.setNum(10, 20);
		cal1.sum(); // 10+20
		cal1.avg(); // (10 +20) / 2

		Calcal cal2 = new Calcal();
		cal2.setNum(20, 30);
		cal2.sum();
		cal2.avg();
	}
}