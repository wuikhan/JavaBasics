package firstPackage;

public class Day06_Recap {

	public static void main(String[] args) {
		// single dimensional array
		int[] a; // declaration
		a = new int[7]; // initialization
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[5] = 60;
		a[6] = 70;
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]); 
			  sum = sum + a[i]; 
			  
		}
		System.out.println("The sum of all values  : "+sum);
		
		
		


	
	}

}
