package firstPackage;

abstract class Banks {
	abstract void getBalance(int deposit);
}

class BankA extends Banks {
int deposit;
	void getBalance(int deposit) {
	this.deposit = deposit;
		System.out.println("The amount deposit to Bank A is "+deposit);
	}
	
}

class BankB extends Banks {
	int deposit;
	void getBalance(int deposit) {
		this.deposit = deposit;
		System.out.println("The amount deposit to Bank B is "+deposit);
	}
	}

class BankC extends Banks {
	int deposit;
	void getBalance(int deposit) {
		this.deposit = deposit;
		System.out.println("The amount deposit to Bank C is "+deposit);
	}
		
	}


public class Day18_TaskTwo {

	public static void main(String[] args) {
		
		Banks a = new BankA();
		a.getBalance(100);
		
		Banks b = new BankB();
		b.getBalance(150);
		
		Banks c = new BankC();
		c.getBalance(200);
	
	}
}
