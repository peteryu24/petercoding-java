class A {
	private int[] arr = new int[3];

	A() {
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}

	public void z(int first, int second) {
		try {
			System.out.println(arr[first] / arr[second]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("finally");
		}
	}
/*	ArrayIndexOutOfBoundsException
*	finally
*	ArithmeticException
*	finally
*	2
*	finally
*/
}

public class Finally {
	public static void main(String[] args) {
		A a = new A();
		a.z(10, 0); // arr[] = arr[0] ~ a[2]  ,  a[10] -> ArrayIndexOutOfBoundsException
		a.z(1, 0);  //  10/0 = ArithmeticException
		a.z(2, 1); // 2
	}
}
