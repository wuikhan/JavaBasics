package firstPackage;

import java.util.ArrayList;
import java.util.HashSet;

public class Day25_HashSet {

	public static void main(String[] args) {
		HashSet<String> a = new HashSet<String>();
		a.add("Waqas");
		a.add("Ahmed");
		a.add("Umair");
		a.add("amir");
		a.add("Amir");
		a.add("Amir");
		
		// converting hashset to array list
		ArrayList<String> b = new ArrayList<String>(a);
		b.add("Amir");
		b.add("Waqas");
		
		System.out.println(b);
		
		System.out.println(b.isEmpty());
		b.clear();
		System.out.println(b.isEmpty());
		
		// convert hashset to array
		String[] aa = new String[a.size()];
		a.toArray(aa);
		
		for(String i:aa) {
			System.out.println(i);
		
		}
		
		
	}

}
