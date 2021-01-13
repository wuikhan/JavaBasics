package firstPackage;

import java.util.Scanner;

class employee {
	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class Day18_Encapsulation {

	public static void main(String[] args) {
	employee a = new employee();
	Scanner getInput = new Scanner (System.in);
	System.out.println("Enter your name : ");
	String name = getInput.next();
	a.setName(name);
	
	String value = a.getName();
	System.out.println(value);

//	a.setAge(19);
//	System.out.println(a.getAge());
	}
}
