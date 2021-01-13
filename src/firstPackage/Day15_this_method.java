package firstPackage;

class Hello {

	Hello() {
		System.out.println("This is a default constructor");
	}

	Hello(int a) {
		this();
		System.out.println("This is a user defined constructor , the value of a is " + a);
	}
}

public class Day15_this_method {

	public static void main(String[] args) {
		Hello a = new Hello(5);
	}
}
