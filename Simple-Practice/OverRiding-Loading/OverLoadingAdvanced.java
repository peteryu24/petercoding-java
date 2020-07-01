class OverLoadingAdvanced {
	int left, middle, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void setOprands(int left, int middle, int right) {
		// this.left = left;
		// this.right = right;
		this.setOprands(left, right); // instead of overlapping
		this.middle = middle;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public int avg() {
		return ((this.left + this.right) / 2);

	}

}

class LoadOver extends OverLoadingAdvanced {

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
