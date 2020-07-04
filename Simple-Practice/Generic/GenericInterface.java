interface Info { // interface
	public abstract int getNum();
}

class Information implements Info { 
	public int rank;

	Information(int rank) {
		this.rank = rank;
	}

	public int getNum() {
		return this.rank;
	}
}

class Person<T extends Info> { // Restricts the type for Generic
	public T info;

	Person(T info) {
		this.info = info;
	}
}

public class GenericInterface {
	public static void main(String[] args) {
		Person p1 = new Person(new Information(1));
	}
}
