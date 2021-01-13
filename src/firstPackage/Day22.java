package firstPackage;

import java.util.Scanner;

public class Day22 {
	public static void main(String[] args) {
		Scanner getInput = new Scanner(System.in);
		System.out.println("Enter the numerator value : ");
		int first = getInput.nextInt();
		System.out.println("Enter the denomenator value : ");
		int second = getInput.nextInt();
		division(first,second);
		System.out.println("This is after the division method");
}

// create a user defined method and call it division which accepts 2 parameters a & b which should divide a by b
// use the scanner class to get user input, make use of try/catch to handle the exception
// call the division method in the main method
	public static void division (int a, int b) {
		try {
		int c = a/b;
		System.out.println("The result is : "+c);
		
		// array arrayoutboundexception
		} catch (ArithmeticException aa) {
			System.out.println(aa);
		} catch (Exception e) {
			
		} catch (Throwable e) {
			
		}
	}
}