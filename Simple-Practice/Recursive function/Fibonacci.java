import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n= scan.nextInt();
		System.out.println(fibo(n));
	}
	static int fibo(int a) {
		if(a<=1) {
			return 0;
		}else if(a==2){
			return 1;
		}else {
			return(fibo(a-1)+fibo(a-2));
		}
	}
}
