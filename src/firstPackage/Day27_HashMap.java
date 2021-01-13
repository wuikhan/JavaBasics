package firstPackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day27_HashMap {

	public static void main(String[] args) {
		//HashSet<String> countryName = new HashSet<String>();
		HashMap<Integer, String> name = new HashMap<Integer, String>();
		name.put(1, "Waqas");
		name.put(2, "Khan");
		name.put(3, "John");
		name.put(4, "Mike");
		name.put(5, "Mike");
		name.put(1, "Waqas 2");
		
		System.out.println(name);
		// return the value for the specific key
		System.out.println(name.get(3));
		// will remove the entry from HashSet
		name.remove(2);
		System.out.println("After removing key # 2 : "+name);
		
		// Iterator is not accessible in hashmap, first we convert hashmap into sets
		Set b = name.entrySet();
		// convert set to iterator
		Iterator c = b.iterator();
		System.out.println("**** Using Iterator ****");
		while(c.hasNext()) {
		//	System.out.println(c.next()); // this returns the complete entry
			Map.Entry<Integer,String> z = (Map.Entry<Integer,String>) c.next();
			System.out.println("The key is "+z.getKey()+" and the value is "+z.getValue());
		}
		System.out.println("**** Using Advance Loop ****");
		// using advance loop
		for (Map.Entry<Integer, String> i : name.entrySet()) {
			System.out.println("The key is "+i.getKey()+" and the value is "+i.getValue());
		}
		
		Object cloned = name.clone(); // this clone method will create a copy of name object and store in variable
		System.out.println(cloned);
		
		((HashMap<Integer, String>) cloned).clear(); // it will clear all the values stored in the cloned object
		System.out.println("This is cloned "+cloned);

		System.out.println(name);
		
		
		boolean cKey = name.containsKey(100); // true
		System.out.println(cKey);
		System.out.println(name);
		boolean cValue = name.containsValue("Waqas 2");
		System.out.println(cValue);
		System.out.println(name.get(3));
		
		System.out.println(name.isEmpty());
		
		System.out.println(name.keySet());
		System.out.println(name.size());
		System.out.println(name.values());
		
		HashMap<Integer, String> newHasMap = new HashMap<Integer, String>();
		newHasMap.putAll(name);
		System.out.println("New Hash Map values : "+newHasMap);
	}
}