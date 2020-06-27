class Class {
	static int sta_var = 1;
	int ins_var = 2; // instance variable

	static void sta_sta() {
		System.out.println(sta_var); // static method -> static variable (O)
	}

	static void sta_ins() {
		// System.out.println(ins_var); // static method -> instance variable (X)

	}

	void ins_sta() {
		System.out.println(sta_var); // instance method -> static variable (O)
	}

	void ins_ins() {
		System.out.println(ins_var); // instance method -> instance variable (O)
	}
}

public class StaticClass {
	public static void main(String[] args) {
		Class c = new Class();

		c.sta_sta();
		c.sta_ins(); // can't compile
		c.ins_sta();
		c.ins_ins();
		Class.sta_sta();
		Class.sta_ins(); // can't compile
		// Class.ins_sta(); //can't comiple
		// Class.ins_ins(); //can't compile

	}
}
