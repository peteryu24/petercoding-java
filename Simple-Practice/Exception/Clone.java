import java.util.Scanner;

class Dummy implements Cloneable { // clone
	String str;

	Dummy(String str) {
		this.str = str;
	}

	protected Object clone() throws CloneNotSupportedException { // needs to be a protected method
		return super.clone();
	}
}

public class Clone {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter something: ");
		String str = scan.next();
		Dummy dumm1 = new Dummy(str);
		try {
			Dummy dumm2 = (Dummy) dumm1.clone(); // Object class needs to be casted
			System.out.println(dumm1.str);
			System.out.println(dumm2.str);
		} catch (CloneNotSupportedException c) {
			System.out.println("Error: " + c);
		}
	}
}