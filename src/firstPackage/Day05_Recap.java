package firstPackage;

import java.util.Scanner;

public class Day05_Recap {

	public static void main(String[] args) {

		// Using a scanner class creates a calculator. Allow a user to enter the 2
		// numbers and operator( +,-,*,/ ). Based on the operator, provide the result to
		// the user.

		Scanner getInput = new Scanner(System.in);
		System.out.println("Enter Number 1");
		int number1 = getInput.nextInt();
		System.out.println("Enter Number 2");
		int number2 = getInput.nextInt();
	
		
		System.out.println("Which operator do you want to use +,-,/,*?");
		String operators = getInput.next();
		
		if (operators.equals("+")) {
			float a =number1+number2;
			System.out.println(a);
		} 
		else if (operators.equals("-")) {
			float b =number1-number2;
			System.out.println(b);
		} 
		else if (operators.equals("*")) {
			float c =number1*number2;
			System.out.println(c);
		} 
		else if (operators.equals("/")) {
			float d =number1/number2;
			System.out.println(d);
		}

		}
	}

