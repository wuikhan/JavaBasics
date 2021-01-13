package firstPackage;



public class Day22_Throw {

	public static void main(String[] args) throws Exception  {
	
		validateStudent(5);

	}
	
	public static void validateStudent(int age) throws Exception  {
		if(age<5) {
			throw new Exception("age to play more"); // throw is used to explicitily thow an exception
		
		} else {
			System.out.println("Welcome to School");
		}
	}

}