package firstPackage;

import java.util.Scanner;

public class Day05 {

	public static void main(String[] args) {
		// print event numbers between 20 and 50
		System.out.println("****** Even ******");
		for(int i=20;i<=50;i++) {
			if(i%2 == 0) {
				System.out.println(i);
			} 
		}
		System.out.println("****** ODD ******");
		for(int i=20;i<=50;i++) {
			if(i%2 == 1) {
				System.out.println(i);
			} 
		}
		// #5
		for (int i=0;i<=2;i++) {
		Scanner getInput = new Scanner(System.in);
		System.out.println("Enter the month you were born : ");
		String month = getInput.next();
		switch(month) {
		case "Jan": // USA
			System.out.println("Winter"); // English
			break;
		case "Feb":
			System.out.println("Winter");
			break;
		case "Mar":
			System.out.println("Winter");
			break;
		case "Apr":
			System.out.println("Spring");
			break;
		case "May":
			System.out.println("Spring");
			break;
		case "Jun":
			System.out.println("Spring");
			break;
		case "Jul":
			System.out.println("Summer");
			break;
		case "Aug":
			System.out.println("Summer");
			break;
		case "Sep":
			System.out.println("Summer");
			break;
		case "Oct":
			System.out.println("Fall");
			break;
		case "Nov":
			System.out.println("Fall");
			break;
		case "Dec":
			System.out.println("Fall");
			break;
			default:
				System.out.println("Enter a valid month");
		}
	}
}
}