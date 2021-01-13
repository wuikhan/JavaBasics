package firstPackage;

class Furniture {
	String color = "black";
	Furniture(){
		System.out.println("This is a constructor from the Furniture class");
	}
	void color() {
		System.out.println("This is a color method from furniture class");
	}
}

class chair extends Furniture {
	String color = "brown";
	
	chair(){
		super();
		System.out.println("This is a constructor from the chair class");
	}
	void chairColor() {
		System.out.println("The chair color is "+color); // this will call the color variable because the variable value is overriden
		System.out.println("The chair color from furniture class is : "+super.color); // this will call the color value from the parent color variable
	}
	
	void color() {
		System.out.println("This is a color method from chair class");
	}
	
	void newColor() {
		super.color();
	}
}

public class Day15_Super {

	public static void main(String[] args) {
		chair a = new chair();
		a.chairColor();
		a.color(); // this will invoke the color method which is overridden in the child class
		a.newColor(); // this will invoke the newColor method which is calling the method from the parent class

	}

}
