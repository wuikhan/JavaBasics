package firstPackage;

public class Day10_2 {

	
	public static void publicTestWithinPackage() {
		System.out.println("This method is present in a different class");
	}
	
	private static void privateTestWithinPackage() {
		System.out.println("This is a private method in a different class");
	}
	
	protected static void protectedTestWithinPackage() {
		System.out.println("Protected method within Package");
	}

	static void defaultTestWithinPackage() {
		System.out.println("Default Method");
	}
}
