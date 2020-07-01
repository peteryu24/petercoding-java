class OverLoading {
	int left, middle, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void setOprands(int left, int middle, int right) {  //  overloading = having a different parameter
		this.left = left;
		this.right = right;
		this.middle = middle;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public int avg() {
		return ((this.left + this.right) / 2);

	}

}

class LoadOver extends OverLoading {

	public void sum() {
		System.out.println("The result is " + (this.left + this.right) + ".");
	}

	public void substract() {
		System.out.println(this.left - this.right);
	}

	public int avg() {
		return super.avg();
	}
}
