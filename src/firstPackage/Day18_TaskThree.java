package firstPackage;

abstract class Marks {
	abstract void getPercentage();
}

class studentA extends Marks {
	int math;
	int chemistry;
	int bio;

	studentA(int math, int chemistry, int bio) {
		this.math = math;
		this.chemistry = chemistry;
		this.bio = bio;
	}

	void getPercentage() {
		float avg = (math + bio + chemistry) / 3;
		float percentageA = avg / 100;
		System.out.println(avg);

	}

}

class studentB extends Marks {
	int math;
	int chemistry;
	int bio;
	int physics;
	
	studentB(int math, int chemistry, int bio, int physics){
		this.math = math;
		this.chemistry = chemistry;
		this.bio = bio;
		this.physics = physics;
	}

	void getPercentage() {
		float avg = (math + bio + chemistry + physics) / 4;
		float percentageB = avg / 100;
		System.out.println(avg);
		
	}
	
}

public class Day18_TaskThree {

	public static void main(String[] args) {
		studentA a = new studentA(77, 88, 87);
		a.getPercentage();
		
		studentB b = new studentB(76,87,79,90);
		b.getPercentage();
	}
}
