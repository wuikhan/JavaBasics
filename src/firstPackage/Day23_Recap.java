package firstPackage;

import java.util.Scanner;

public class Day23_Recap {

	public static void main(String[] args) throws Exception {
	int[] a = new int[5];
	
	int sum=0;
	Scanner aa = new Scanner(System.in);
	for(int i=0;i<a.length;i++) {
		a[i] = aa.nextInt();
		sum = sum + a[i];
	}
	
	System.out.println(sum);
	}
}
