package firstPackage;

class AA {
	 void fruit() {
		System.out.println("This is an apple");
	}
	void car(int a) {
		System.out.println("This method is coming from AA class"+a);
	}
	void car(String a) {
		System.out.println("This method is coming from AA class which is accepting a String input");
	}
}

class BB extends AA {

	
	void car(String a, Float b) {
		System.out.println("This method is coming from BB class which is accepting a String input");
	}
}

class CC extends BB {

}

public class Day14_Polymorphism_Overriding extends BB {

	public static void main(String[] args) {
		CC a = new CC();
		a.fruit();
		a.car(4);
		a.car("Hello");
	}

}
