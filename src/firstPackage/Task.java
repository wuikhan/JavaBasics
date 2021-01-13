package firstPackage;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		// if the input in even print 2 middle characters
		// if the input is odd print the 1 middle character
		Scanner getInput = new Scanner(System.in);
		System.out.println("Enter some words : ");
		String checkValue = getInput.next();
		System.out.println(checkValue.length());
		int len = checkValue.length(); // 5
		int startingValue = 0;
		int endingValue = 0;
		if(len >= 3) {
			if(len%2 == 1) {
				// odd
				startingValue = len/2;
				endingValue = 1;
				
			} else {
				// even
				startingValue = (len/2)-1;
				endingValue=2;
			}
			System.out.println("The character is : "+checkValue.substring(startingValue, startingValue+endingValue) );
		}
	}
}
