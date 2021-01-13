package firstPackage;

import java.util.Scanner;

public class Day04 {
	public static void main(String[] args) {
		Scanner getInput = new Scanner(System.in);
		System.out.println("Enter Student name : ");
		String studenName = getInput.next();
		System.out.println("Enter physics score :");
		int physicsScore = getInput.nextInt();
		System.out.println("Enter math score : ");
		int mathScore = getInput.nextInt();
		System.out.println("Enter chemistry score : ");
		int chemistryScore = getInput.nextInt();
		System.out.println("Enter biology score : ");
		int biologyScore = getInput.nextInt();
		int total = physicsScore + mathScore + chemistryScore + biologyScore;
		float percentage = (total * 100) / 400;
		System.out.println("Percentage is : " + percentage);
		if (percentage >= 90 && percentage < 100) {
			System.out.println("Congratulations !!! " + studenName + " you have scored " + percentage + "%");
		} else if (percentage >= 80 && percentage < 90) {
			System.out.println("Good Work !!! " + studenName + " you have scored " + percentage + "%");
		} else if (percentage >= 70 && percentage < 80) {
			System.out.println("Good Try !!! " + studenName + " you have scored " + percentage + "%");
		} else {
			System.out.println("Study hard " + studenName + " try again next time");
		}

	}
}
