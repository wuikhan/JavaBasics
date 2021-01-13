package firstPackage;

class finalClass {
	// we can have different data members or methods
	final public void hello() {
		System.out.println("Hello World");
	}
}

public class Day23_Final extends finalClass {
	final static int b = 20;

	public static void main(String[] args) {
		Day23_Final a = new Day23_Final();
		a.hello();
		System.out.println(b); // 20
		
	//	b = 40;
		System.out.println(b); //40
		
	}

}
