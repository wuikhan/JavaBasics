package firstPackage;

public class Day09 {

	public static void main(String[] args) {
	// because it is a static method and it is present within the class we can call it by its name
		add();
		add1("The sum is :",5,12);
		
		int a = add2();
		System.out.println(a);
		
		add3(50,100,100);
	}
	
	// method with void return type and without parameter/argument
	public static void add() {
		int a = 40;
		int b = 50;
		int c = 60;
		System.out.println(a+b+c);
	}
	
	// method with void return type and with parameter/argument
	public static void add1(String message, int a, int b) {
		System.out.println(message+" "+(a+b));
	}
	
	// method without void return type and without parameter
	public static int add2() {
		int a = 50;
		int b = 60;
		int c = 70;
		return a+b+c;
	}
	// method without void return type and with parameter
	public static int add3(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("The sum is "+d);
		return d;
	}
}
