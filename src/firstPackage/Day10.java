package firstPackage;

import secondPackage.Day10_3;

 class sample {
	
	public static void sampleMethod() {
		System.out.println("This is sample method from sample class");
	}
	
	private static void privateSampleMethod() {
		System.out.println("This is private method inside a sub class");
	}
	
	protected static void protectedSampleMethod() {
		System.out.println("This is protected method inside a sub class");
	}
	
	static void defaultMethod() {
		System.out.println("Default method inside the sub class");
	}
}


public class Day10 {

	public static void main(String[] args) {

		/*
		publicTest();
		privateTest();
		protectedTest();
		defaultTest();
		*/
		
		Day10_2 a = new Day10_2();
		a.publicTestWithinPackage();
		a.protectedTestWithinPackage();
		a.defaultTestWithinPackage();
		
		
		Day10_3 b = new Day10_3();
		//b.publicTest3();
		
		sample c = new sample();
		c.sampleMethod();
		c.protectedSampleMethod();
		c.defaultMethod();
		
	}
	
	public static void publicTest() {
		System.out.println("Can i access this method in the main method");
	}
	
	private static void privateTest() {
		System.out.println("This is a private method, Can i access this method in the main method");
	}
	
	protected static void protectedTest() {
		System.out.println("This is a protected method, can i access this method in the main method ?");
	}
	
	static void defaultTest() {
		System.out.println("This is a default method, can i access this method in the main method ?");
	}

}
