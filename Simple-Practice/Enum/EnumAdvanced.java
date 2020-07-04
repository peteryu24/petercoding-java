enum Sport {
	Soccer("1"), Baseball("2"), Basketball("3");

	public String Number;

	public String getNumber() {
		return this.Number;
	}

	Sport(String Number) {
		System.out.println("Sport " + this);
	}
}

public class EnumAdvanced {
	public static void main(String[] args) {
		Sport sport = Sport.Soccer;
		switch (sport) {
		case Soccer:
			System.out.println("Fun." + Sport.Soccer.getNumber());
			break;
		case Baseball:
			System.out.println("Fun." + Sport.Baseball.getNumber());
			;
			break;
		case Basketball:
			System.out.println("Active." + Sport.Basketball.getNumber());
			break;
		}

	}
}

//Sport Soccer
//Sport Baseball
//Sport Basketball
//Fun.null
