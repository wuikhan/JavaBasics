package firstPackage;

public class Day02 {
	// global variable
	static int b; // declared a variable name "b"
	static float c;
	static double d;
	// default values for char, string, and boolean
	static char e;
	static boolean f;
	static String g;

	public static void main(String[] args) {
		// local variable

		// to store integer values you will use int
		int a = 20; // declared and initialized
		System.out.println("This will print assigned int value : " + a);
		System.out.println("This will print default int value : " + b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);

		String h = "Hello";
		String i = "World";
		System.out.println(h + i);

		System.out.println("Today is " + " Day 2 " + " of Java !!!");

		int j = 5 + 2;
		System.out.println("The sum of 5 & 2 is : " + j);
		// addition
		int k = 120;
		int l = 110;

		int m = k + l;
		System.out.println("The sum of " + k + " and " + l + " is : " + m);
		// subtraction
		int n = k - l;
		System.out.println("The difference between " + k + " and " + l + " is : " + n);

		int aa = 5;
		double bb = 6.2;

		System.out.println(aa + bb);

		// square of the number
		float cc = 3.9f;
		System.out.println(cc * cc);

		int length = 2;
		int width = 3;
		int area = length * width;
		System.out.println(area);

		System.out.println("**************************************");
		// If Statement
/*
 * ==
 * !=
 * >
 * <
 * >=
 * <=
 */
		int age = 19;
		if (age <= 21) {
			System.out.println("The age is less than 21.");
		} else {
			System.out.println("The age is greater than 21.");
		}
		
	}
}
