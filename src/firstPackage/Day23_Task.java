package firstPackage;

import java.util.Scanner;

public class Day23_Task {

	public static void main(String[] args) {
		int sum=0;
		Scanner getInput = new Scanner(System.in);
		System.out.println("How many values you need a sum for ? ");
		int values = getInput.nextInt(); //6
		
			int[] eachValue = new int[values];
		
		for(int i=0;i<eachValue.length;i++) {
			System.out.println("Enter the "+(i+1)+" number");
			eachValue[i]=getInput.nextInt();
			sum=sum+eachValue[i];
		}
		System.out.println("The sum is : "+sum);
		
	}
}
