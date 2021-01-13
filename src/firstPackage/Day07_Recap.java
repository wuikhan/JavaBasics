package firstPackage;

public class Day07_Recap {

	public static void main(String[] args) {
		int[][] a = new int[2][3];

		a[0][0] = 23;
		a[0][1] = 43;
		a[0][2] = 53;
		a[1][0] = 21;
		a[1][1] = 31;
		a[1][2] = 41;

		System.out.println(a[1][2]);
		
		
		int[][] b = {
				{ 11,22,33 },
				{ 21,32,42},
				{31,41,51}
		};
		
		System.out.println(b[2][2]);

	}

}
