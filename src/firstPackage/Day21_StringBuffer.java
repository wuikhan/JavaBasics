package firstPackage;

import java.util.Scanner;

public class Day21_StringBuffer {
	public static void main(String[] args) {
	// String class is immutable / means you cannot change
		// String a = new String("Hello");
		String a = "Hello";
		String b = a.concat(" World");
		System.out.println(a);
		System.out.println(b);
		// String buffer is mutable , that means we can change it
		StringBuffer c = new StringBuffer("Hello");
		c.append(" World");
		System.out.println(c);
		c.append("Today is ");
		System.out.println(c);
		long startTime = System.currentTimeMillis();
		StringBuffer sbuff = new StringBuffer("Java"); 
		for(int i=0;i<100000;i++) {
			sbuff.append("Class");
		}
		System.out.println("Time took to complete "+ (System.currentTimeMillis()-startTime)+"ms");
		StringBuilder sbuild = new StringBuilder("Java"); 
		for(int i=0;i<100000;i++) {
			sbuild.append("Class");
		}
		System.out.println("Time took to complete "+ (System.currentTimeMillis()-startTime)+"ms");
	}
}