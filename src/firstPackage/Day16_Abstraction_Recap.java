package firstPackage;


abstract class baseClass {
	
	abstract void loginFunctionality();
	abstract void logOutFunctionality();
	abstract void contentCreation();
	abstract void testRoles();
	
}

abstract class testLogin extends baseClass {
	void loginFunctionality() {
		
	}
}

class testRole extends testLogin {
	void testRoles() {
		
	}

	void logOutFunctionality() {
		
		
	}


	void contentCreation() {
	
	}
}

public class Day16_Abstraction_Recap {

	public static void main(String[] args) {
	

	}

}
