package firstPackage;

abstract class Day16_Abstract_Class {
	// abstract class is a class which has defined methods and un defined methods
	public void a() {
		System.out.println("This is a defined/concrete method");
	}
	// example of undefined method
	public abstract void b();
}

public class Day16_Concrete_Class { 
	// Concrete class is a class which has defined methods
// this is an example of defined/concrete method because it has a body
	public static void display() {
		System.out.println("This is an example of concrete method");
	}

	public static void main(String[] args) {

		display();
	}

}
