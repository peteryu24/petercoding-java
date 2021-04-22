
public class Pascal {
	public static void main(String[] args) {
		int n=7; // 7 lines of Pascal's Triangle
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(pascal(i,j)+" ");
			}
			System.out.println(""); 
		}
	}
	static int pascal(int i, int j) {
		if(j==0) {
			return 1; // always stars with 1
		}else if(j==i) {
			return 1; // always ends with 1
		}else {
			return (pascal(i-1,j-1)+pascal(i-1,j)); 
		}
	}
}
