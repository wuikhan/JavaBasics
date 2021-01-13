package secondPackage;

import java.util.Scanner;

public class Day10_3 {
	
	public static void main(String[] args) {
		int sum=0;
		Scanner getInput = new Scanner(System.in);
		System.out.println("How many values you need a sum for ?");
		int values = getInput.nextInt(); //2
		
		int[] eachValue = new int[values];

		for(int i=0;i<eachValue.length;i++) {
			System.out.println("Enter the "+(i+1)+" value : ");
			eachValue[i]=getInput.nextInt();
			sum=sum+eachValue[i];
		}
		
		System.out.println("The sum is "+sum);
		
	}
	
	
}
