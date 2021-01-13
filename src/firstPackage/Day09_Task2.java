package firstPackage;

import java.util.Scanner;

public class Day09_Task2 {

	public static void main(String[] args) {
		// create a method to find the largest number between 3 numbers. Reuse the
		// method in the main method and make sure we are able to pass values at the
		// time of calling a method.
		Scanner enterValue = new Scanner(System.in);
		System.out.println("Enter the first value");
		int a = enterValue.nextInt();
		
		System.out.println("Enter the second value");
		int b = enterValue.nextInt();
		
		System.out.println("Enter the third value");
		int c = enterValue.nextInt();
		
		
		biggerValue(a,b,c);
	}
	
	
	public static void biggerValue(int a, int b, int c) {
		if(a >b && a > c) {
			System.out.println("The first value is the largest value");
		} else if (b > a && b > c) {
			System.out.println("The second value is the largest value");
		} else if (c > a && c>b) {
			System.out.println("The third value is the largest value");
		} else {
			System.out.println("The numbers are not distinct");
		}
	}

}
