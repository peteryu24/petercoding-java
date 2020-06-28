class Calculator {
	int left, right;

	public void setNum(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

class CalwithSub extends Calculator { // keeps the original 'Calculator'
	public void sub() {
		if (this.left > this.right) {
			System.out.println(this.left - this.right);
		} else {
			System.out.println(this.right - this.left);
		}
	}
}

public class Inheritance {
	public static void main(String[] args) {
		CalwithSub cws = new CalwithSub();
		cws.setNum(40, 30);
		cws.sum(); // original methods are kept
		cws.avg();
		cws.sub();
	}
}
