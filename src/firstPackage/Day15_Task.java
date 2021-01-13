package firstPackage;

class Bank {
	String FirstName;
	String LastName;
	String AccountType;
	float Balance;
	
	Bank(String fName, String lName, String aType, float bal){
		
		this.FirstName = fName;
		this.LastName = lName;
		this.AccountType = aType;
		this.Balance = bal;
	
	}
	
	void getBalance() {
		System.out.println("The first name is : "+FirstName+" & the last name is : "+LastName+" balance of "+AccountType+ " is "+ Balance);
	}
	
}

public class Day15_Task {

	public static void main(String[] args) {
		Bank john = new Bank("John","Doe","Checking",10000f);
		john.getBalance();

	}

}
