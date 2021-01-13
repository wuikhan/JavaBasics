package firstPackage;


class AAA {
	AAA() {
		System.out.println("A");
	}
}

class BBB extends AAA{
	BBB(){
		System.out.println("B");
	}
}
class C extends BBB{
	C(){
		System.out.println("C");
	}
}
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C a = new C();
	}

}
