public interface Inter { // interface
	public void setOprands(int first, int second, int third);

	public int sum(); // all methods in Interface must be a 'public' method

	public int avg();
}

class Interface implements Inter { // implementing the interface "Interface"
	int first, second, third;

	public void setOprands(int first, int second, int third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public int sum() { // must implement all methods [sum(); , avg(); ]
		return this.first + this.second + this.third;
	}

	public int avg() {
		return (this.first + this.second + this.third) / 3;
	}
}
