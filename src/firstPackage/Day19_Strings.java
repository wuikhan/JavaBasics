package firstPackage;

import java.util.Scanner;

public class Day19_Strings {

	public static void main(String[] args) {
		// .length
		String a = "WELCOME to the bootcamp";
		System.out.println(a.length());

		String b = "hello";
		int bLength = b.length();
		System.out.println(bLength);

		String c = new String("Codegator inc");
		System.out.println(c.length());

		String aLowerCase = a.toLowerCase();
		System.out.println(a);
		System.out.println(aLowerCase);
		
		Scanner aa = new Scanner(System.in);
		String getInput = aa.next(); 
		String conVert = getInput.toLowerCase();
		System.out.println("this converts to lower case :"+conVert);
		
		String aUpperCase = a.toUpperCase();
		System.out.println("this will convert to upper case : "+aUpperCase);
		
		
//		String a = "                 Hello           ";
//		String b = "World " ;
//		boolean c = a.equalsIgnoreCase(b);
//		System.out.println(c);
		
		int d = a.compareTo(b);
		System.out.println(d);
		
		int e = a.compareToIgnoreCase(b);
		System.out.println(e);
		
		String f = a.concat("World");
		System.out.println(f);
		
		String g = a.trim();
		System.out.println(g);
		
		String h = "Welcome To The class";
		String i = h.toLowerCase();
		System.out.println(i.startsWith("welcome"));
		System.out.println(i.endsWith("class"));
		
		char j = h.charAt(3);
		System.out.println(j);
		
		String k = "john@gmail.com";
	int l =	k.indexOf("@");
	System.out.println(l);
	
	String m = h.substring(8);
	System.out.println(m);
		
	String n = h.substring(8, 12);
	System.out.println(n);
	
	String o = h.replace("T", "t");
	System.out.println(o);
		
	}

}
