package firstPackage;

public class Day08_Methods {

	public static void main(String[] args) {
	System.out.println("This is main method");
	methodOne();
	methodTwo();
	}
	

	public static void methodTwo() {
		System.out.println("This is method two");
	}
	
	// create method without parameter
	public static void methodOne() {
		System.out.println("This line is coming from method one which is a user defined method");
	}
}
