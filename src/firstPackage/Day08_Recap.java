package firstPackage;

public class Day08_Recap {

	public static void main(String[] args) {

		// if the method is in the same class and it is static then you can call the
		// method by its name
		sample();
		
		sampleTwo(5,15);
		sampleTwo(50, 100);

	}

	// method without any parameter
	public static void sample() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}
	
	// method with parameters
	public static void sampleTwo(int a, int b) {
		System.out.println(a+b);
	}

}
