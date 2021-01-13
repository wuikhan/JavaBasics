package firstPackage;

public class Day13_Child2 extends Day13_Parent {

	public static void main(String[] args) {
		
		Day13_Child2 childTwo = new Day13_Child2();
		System.out.println(childTwo.amount);
		System.out.println(childTwo.car);
		childTwo.eachChild();
	}

}
