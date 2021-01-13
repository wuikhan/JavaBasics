package firstPackage;

import java.util.Random;
import java.util.Scanner;

public class Day11_Task {

	public static void main(String[] args) {
		Random rand = new Random();
		int secretNumber = rand.nextInt(20);
		//System.out.println(secretNumber);
		Scanner number = new Scanner(System.in);

		System.out.println("Guess a number :");
		int guess;
		do {
			guess = number.nextInt();
			if (guess == secretNumber) {
				System.out.println("Your guess is correct");
			} else if (guess < secretNumber) {
				System.out.println("Your guess is smaller than the secret Number");
			} else {
				System.out.println("Your guess is greater than the secret number ");
			}
		} while (guess != secretNumber);
	}
}
