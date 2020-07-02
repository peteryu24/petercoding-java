interface father {
}

interface mother {
}

interface programmer {
	public void coding();
}

interface believer {
}

class Steve implements father, programmer, believer {
	public void coding() {
		System.out.println("fast");
	}
}

class Rachel implements mother, programmer {
	public void coding() {
		System.out.println("elegance");
	}
}

public class PolymorphismC {
	public static void main(String[] args) {
		programmer employee1 = new Steve(); // just like minimalism; doesn't have to care about interface father or believer
		programmer employee2 = new Rachel(); // same for Rachel; no need for mother

		employee1.coding();
		employee2.coding();
	}
}
