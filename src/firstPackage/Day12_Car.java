package firstPackage;

public class Day12_Car {
	
	  Day12_Car() {
		System.out.println("This is default constructor from Day12_Car class");
	}
	
	  Day12_Car(int a){
		  System.out.println("This is parameterized constructor from Day12_Car class"+a);
	  }
	  
	  Day12_Car(String a){
		  System.out.println("This is parameterized constructor from Day12_Car class"+a);
	  }
	  
	  Day12_Car(int a, String b){
		  System.out.println("This is parameterized constructor from Day12_Car class"+a);
		  System.out.println("This is parameterized constructor from Day12_Car class"+b);
	  }
	  
	public  void drive() {
		System.out.println("This is the drive method from Day12_Car class");
	}

}
