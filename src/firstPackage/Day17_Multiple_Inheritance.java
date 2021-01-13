package firstPackage;

interface Developer {
	void writeCode();
}

interface Manager {
	void managesTeam();
}

public class Day17_Multiple_Inheritance implements Developer, Manager {

	public static void main(String[] args) {
		Day17_Multiple_Inheritance a = new Day17_Multiple_Inheritance();
		a.writeCode();
		a.managesTeam();

	}


	public void writeCode() {
		System.out.println("The developer writes code");
		
	}

	public void managesTeam() {

		System.out.println("The manager takes decissions");
	}

}
