package firstPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Day25 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(10);
		a.add(200);
		a.add(102);
		a.add(120);
		a.add(10);
		a.add(10);
		a.add(10);

	// for loop
		/*
	for(int i=0;i<a.size();i++) {
		System.out.println(a.get(i));
	}
	
	// advance loop
	for(Integer i:a) {
		System.out.println(i);
	}

		
	// While Loop
		int i=0;
		while(i<a.size()) {
			System.out.println(a.get(i));
			i++;
		}
		*/
		// Interator
		// Create an object of Interator
		Iterator i = a.iterator();
	
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	
	
	}

}
