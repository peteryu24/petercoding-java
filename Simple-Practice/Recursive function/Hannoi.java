import java.util.Scanner;

public class Hanoi {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insert how many plates: ");
		int num = scan.nextInt();
		hannoi(1,2,3,num);
	}
	public static void hannoi(int from,int m,int to,int num) {
		if(num==0) {
			return;
		}else {
			hannoi(from,to,m,num-1);
			System.out.println(num+": "+from+"->"+to);
			hannoi(m,from,to,num-1);
		}
	}
}
