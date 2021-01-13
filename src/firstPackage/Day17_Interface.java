package firstPackage;

interface exampleOne {
	 public void methodOne();
	 public void methodTwo();
	public static final int a = 0;

}

interface exampleThreee extends exampleOne {
	
}

class exampleTwo implements exampleThreee {
	int b;
	public  void methodOne() {
		System.out.println("This is method one");
	}
	public void methodTwo() {
	System.out.println("This is method two");
	}
}
public class Day17_Interface  {

	public static void main(String[] args) {
		exampleTwo a = new exampleTwo();
		a.methodOne();
		a.methodTwo();
		
		exampleOne b = new exampleTwo();
		b.methodOne();
		b.methodTwo();
	}
}
