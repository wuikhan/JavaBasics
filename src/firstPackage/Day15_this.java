package firstPackage;

class Studentss {
	int rollNo;
	String name;
	float fee;
	
	Studentss(){
		System.out.println("This is a default constructor");
	}
	
	Studentss(int rollNo, String name, float fee){
		this();
		this.rollNo = rollNo;
		this.name = name;
		this.fee = fee;
		
	}
	

	void displayData() {
		System.out.println("roll number is : "+rollNo+" name is : "+name+" fee is :"+fee);
		this.hello();
	}
	
	void hello() {
		
		System.out.println("This is hello method inside the student class");
	}
	
}

public class Day15_this {

	public static void main(String[] args) {
		Studentss studentOne = new Studentss(100, "John", 3000);
		studentOne.displayData();
	}

}
