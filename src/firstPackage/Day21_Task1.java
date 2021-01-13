package firstPackage;

public class Day21_Task1 {

	public static void main(String[] args) {
		// Create a method that will take 1 String sentence as a parameter. 
		// Inside your method write a code that should return a String without any spaces.
		String returnValue = taskOne("Hello This is Task number One");
		System.out.println(returnValue);
		
		int returnNumber = taskTwo("Hello This is Task number One !@#$%^&* 123456");
		System.out.println(returnNumber);
		
		String a="Today is a good day . It is Thursday . We have a Java Class .";
		String[] b = a.split("\\.");
		System.out.println(b.length);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
	}
	
	
	public static String taskOne(String sentence) {
		return sentence.replaceAll("[^A-Za-z]", "");
	}
	
	
	public static int taskTwo(String sentence) {
		String returnAlpha = sentence.replaceAll("[^A-Za-z]", "");
		
		
		return returnAlpha.length();
	}

}
