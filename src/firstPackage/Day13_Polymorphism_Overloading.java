package firstPackage;

// method overloading in polymorphism
class Addition {
	
	void sum(int a, int b) {
		System.out.println("The sum of 2 int values are : "+(a+b));
	}
	void sum(String a, int b) {
		System.out.println("The sum of 2 int values are : "+(a+b));
	}
	
	void sum(int a, int b, int c) {
		System.out.println("The sum of 3 int values are : "+(a+b+c));
	}
	
	void sum(int a, int b, int c, int d) {
		System.out.println("The sum of 4 int values are : "+(a+b+c+d));
	}
	
	void sum (String a, String b) {
		System.out.println("The 2 string values are " + a +" and "+b);
	}
}

public class Day13_Polymorphism_Overloading {

	public static void main(String[] args) {
		Addition a = new Addition();
		a.sum(10, 20);
		a.sum(12, 22, 33);
		a.sum(33, 77, 66, 55);
		a.sum("Hello", "World");
	}

}
