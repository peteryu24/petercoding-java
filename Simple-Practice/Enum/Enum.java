enum Sport {
	Soccer, Baseball, Basketball
}
/* class Fruit {
 * public static final Sport Soccer = new Sport();
 * public static final Sport Baseball = new Sport();
 * public static final Sport Basketball = new Basketball();    
 */

enum Number {
	one, two, three
}

public class Enum {
	public static void main(String[] args) {
		Sport sport = Sport.Soccer;
		
    switch(sport) {
		case Soccer:
			System.out.println("Fun.");
			break;
		case Baseball:
			System.out.println("Awesome.");
			break;
		case Basketball:
			System.out.println("Active.");
			break;
		}
		
	}
}
