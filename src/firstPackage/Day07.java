package firstPackage;

public class Day07 {

	public static void main(String[] args) {

		// declare and initiliaze the 2D array
		int[][] a = new int[2][2];

		a[0][0] = 15;
		a[1][0] = 25;
		a[0][1] = 35;
		a[1][1] = 45;

		System.out.println(a[1][1]);
		
		
		int[][] b = {
				{ 10,20,30 },
				{ 40,50,60 },
				{ 70,80,90 }
		};
		
		
		System.out.println(b[2][2]);
		System.out.println(b[1][1]);
		
		
		
		
		

		// one dimensional array
//		int[] a = { 5, 2, 3, 4, 5, 4, 3, 2, 4,5,6,7 };
//		
//		System.out.println(a[7]);
//		System.out.println("The length is "+a.length);
//		
//		String[] b = {"John", "Chris", "Mike", "Peter" };
//		System.out.println(b[3]);
//
//		char[] c = {'a','b','c'};
//		System.out.println(c[0]);

	}

}
