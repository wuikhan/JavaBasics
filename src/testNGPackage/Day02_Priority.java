package testNGPackage;

import org.testng.annotations.Test;

public class Day02_Priority {
	
	@Test(priority=1, groups= {"homepage"})
	public void efirstMethod() {
		System.out.println("This is a firstMethod ");
	}
	
	@Test(priority=2,groups= {"homepage","regression"})
	public void dsecondMethod() {
		System.out.println("This is a second method");
	}
	
	@Test(groups= {"regression","smoketest"})
	public void cthirdMethod() {
		System.out.println("This is a third method");
	}
	
	@Test(priority=3)
	public void bforthMethod() {
		System.out.println("This is a forth method");
	}
	
	@Test
	public void afifthMethod() {
		System.out.println("This is a fifth method");
	}

}
