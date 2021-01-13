package firstPackage;

public class Day11_Variables {
	// instance variable / global variable
	String globalVar = "This is global variable inside the class , and outside the method";
	
	public static void main(String[] args) {
		int a = 100; //local variable
		String b = "Hello World"; // local variable
		
		System.out.println("The value of a variable is "+a+", and the value of b variable is "+b);
//		System.out.println("The value of c variable is : "+c);
		
		Day11_Variables obj = new Day11_Variables();
		System.out.println(obj.globalVar); // global or instance variable
		
		Day11_Variables newVal = new Day11_Variables();
		System.out.println(newVal.globalVar);
		newVal.globalVar = "Updated the value for global variable"; // updated the value for the global or instance variable
		System.out.println(newVal.globalVar);
	}
	
	public static void anotherMethod() {
		int c = 109; // local variable
		
		System.out.println("The value of c variable is : "+c);
//		System.out.println("The value of a variable is "+a+", and the value of b variable is "+b);
	}
}
