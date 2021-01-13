package firstPackage;

class model {
	int b;
	static int id = 30;
	
	public static void gear() {
		System.out.println("The value of id is "+id);
	}
	public  void test() {
		System.out.println("This is a non static method");
	}
}

public class Day10_car {
	static int a = 10;

	public static void main(String[] args) {
		System.out.println(a);
		a = 30;
		System.out.println(a);
		
		model carOne = new model();
		carOne.b = 10;
		carOne.test();
		
		System.out.println(carOne.b);
		System.out.println(carOne.id); //30
		System.out.println(model.id); //30
		
		model.id = 50;
		System.out.println(model.id); //50
		model.gear();
	}

}
