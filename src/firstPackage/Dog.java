package firstPackage;


public class Dog {

	String breed ; // delared different global variables
	String size;
	String color;
	int age;
	

	
	public static void main(String[] args) {
		Dog dog1_obj = new Dog(); // created objects for the Dog class
		dog1_obj.breed = "German Shephered"; // assigning values to the variable/state/attributes
		dog1_obj.size = "Big";
		dog1_obj.color = "Black/Brown";
		dog1_obj.age = 1;
		
		Dog dog2_obj = new Dog();
		dog2_obj.breed = "Maltese";
		dog2_obj.size = "Small";
		dog2_obj.color = "White";
		dog2_obj.age = 2;
		
		
		System.out.println("The dog breed is : "+dog1_obj.breed + " and it is a "+dog1_obj.size+" "
				+ "dog, and the color of the dog is : "+dog1_obj.color+" and the age is "+dog1_obj.age); // printing the state
		
		System.out.println("The dog breed is : "+dog2_obj.breed + " and it is a "+dog2_obj.size+" "
				+ "dog, and the color of the dog is : "+dog2_obj.color+" and the age is "+dog2_obj.age);
		
	}




}
