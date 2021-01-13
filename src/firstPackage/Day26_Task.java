package firstPackage;

import java.util.HashSet;

public class Day26_Task {

	public static void main(String[] args) {
		HashSet<String> countryName = new HashSet<String>();
		countryName.add("USA"); 
		countryName.add("Pakistan"); 
		countryName.add("Afghanistan");
		countryName.add("Canada");
		countryName.add("USA");
		countryName.add("Pakistan");
		countryName.add("Afghanistan");
		countryName.add("USA");
		countryName.add("Pakistan");
		countryName.add("Afghanistan");
		System.out.println("Total number of countries using HashSet : "+countryName.size());
		System.out.println(countryName);
		countryName.add("France");
		countryName.add("Mexico");
		System.out.println(countryName);
		countryName.remove("Mexico");
		countryName.remove("Canada");
		

		for(String country : countryName) {
			System.out.println(country);
			if(country=="Afghanistan") {
				System.out.println("Country Found");
				break;
			}
		}
	}

}
