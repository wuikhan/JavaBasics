package firstPackage;

public class Day22_Exception {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c;

		int[] arr = new int[4];
		try {
			arr[0] = 10;
			arr[1] = 5;
			arr[2] = 3;
			arr[3] = 30;

			c = a / b;
			System.out.println(c);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You are storing a value in a wrong index which does not exist");
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("This code is from finally block");
		}
	}

}
