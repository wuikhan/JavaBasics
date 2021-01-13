package firstPackage;

import java.util.ArrayList;

public class Day24_ArrayList {

	public static void main(String[] args) {
//		int[] a = new int[5];
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(50); // 0 index
		a.add(100); // 1 index
		a.add(70); // 2 index
		
		System.out.println("Elements in the object are : "+a);
		System.out.println(a.size());
		a.remove(1);
		a.add(40);
		System.out.println("Elements after adding 40 to the last index : "+a);
		a.add(0, 400);
		System.out.println("Elements in the object are by adding 400 to 0 index : "+a);
		a.remove(1);
		System.out.println("After removing the 1 index : "+a);
		
	}

}
