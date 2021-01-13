package firstPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class Day25_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Waqas");
		a.add("Ahmed");
		a.add("Umair");
		a.add("Amir");
		a.add("Amir");
		a.add("Amir");
		
		for(int i=0;i<a.size(); i++) {
			System.out.println("Using for loop "+a.get(i));
		}
		
		int i=0;
		while(i<a.size()) {
			System.out.println("Using while loop " +a.get(i));
			i++;
		}
		
		for(String i1:a) {
			System.out.println("Using advance loop "+i1);
		}

		Iterator aa = a.iterator();
		while(aa.hasNext()) {
			System.out.println("Using Iterator "+aa.next());
		}
	}

}
