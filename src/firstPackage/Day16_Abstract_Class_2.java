package firstPackage;

abstract class Phone {
	abstract void facialRecongnition(); // declared method or un defined methods

	abstract void thumbImpression(); // declared method or un defined methods

	abstract void camera(); // declared method or un defined methods
	
}

abstract class iPhone extends Phone {
	void facialRecongnition() {
		System.out.println("We will use facial recog. system");
	}

	void thumbImpression() {
		System.out.println("We will use thumb impression system");
	}
	abstract void camera(); 
}

class iPhoneX extends iPhone {
	void camera() {
		System.out.println("we will use 12 mp camera");
	}

	void thumbImpression() {
		System.out.println("We will use thumb impression system from iPhone x");
	}
	
}

public class Day16_Abstract_Class_2 {

	public static void main(String[] args) {
		// Phone a = new iPhoneX(); // indirect way of creating an object
		Phone a = new iPhoneX(); // direct way of creating an object
		a.camera();
		a.facialRecongnition();
		a.thumbImpression();

	}
}