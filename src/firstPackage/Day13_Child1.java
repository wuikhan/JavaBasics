package firstPackage;

public class Day13_Child1 extends Day13_Parent {
	
	int personalChecking = 5000;

	public static void main(String[] args) {
		Day13_Child1 childOne = new Day13_Child1();
	System.out.println(	childOne.amount);
	System.out.println(childOne.personalChecking);
	childOne.personal();
	

	}
	
	public  void personal() {
		System.out.println("I have x amount in the checking");
	}

}
