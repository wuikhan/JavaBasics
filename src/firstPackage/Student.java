package firstPackage;


class Faculty {
	double salary = 50000;
	
	public  void programs() {
		System.out.println("This is a programs method");
	}
}

public class Student extends Faculty {
double bonus = 30000;

	public static void main(String[] args) {
		Student a = new Student();
		System.out.println(a.salary);
		System.out.println(a.bonus);
		a.programs();
		test();
		a.test();
	}
	
	public static void test() {
		
	}

}
