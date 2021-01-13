package firstPackage;


 class Day12 {
	Day12(){
		System.out.println("This line of code is coming from constructor");
	}
	
	Day12(int a){
		System.out.println("This is a parameterized constructor, the value of a is "+a);
	}
	
	public static void hello() {
		System.out.println("This line is coming from hello method");
	}
	
}
public class Day12_Constructor {

	public static void main(String[] args) {
		Day12 a = new Day12();
		a.hello();
		Day12 aa = new Day12(10);
		aa.hello();
	}
}
