class OverRiding2 {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public int avg() {
		return ((this.left + this.right) / 2);

	}

}

class RideOver extends OverRiding2 {

	public void sum() {
		System.out.println("The result is " + (this.left + this.right) + ".");
	}

	public void substract() {
		System.out.println(this.left - this.right);
	}

	public int avg() {
		return super.avg(); //  super can be usable
		System.out.println(this.left + this.right + 3);
	}
}

/*
 * when overriding, return type must match
 * parameter must also match
 */
