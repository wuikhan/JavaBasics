package firstPackage;

class A {
	static int a = 100;
	static void helloA() {
		System.out.println("This method is coming from class A");
	}
	
	int c = 300;
	void helloC() {
		System.out.println("This is a C method");
	}
}

class B extends A {
	static int b = 200;
	static void helloB() {
		System.out.println("This method is coming from class b");
	}
	
}

public class Day13_MultipleInheritance extends B {

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		helloA();
		helloB();
		Day13_MultipleInheritance c = new Day13_MultipleInheritance();
		System.out.println(c.c);
		c.helloC();
	}

}
