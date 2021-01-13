package testNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day03_Dependency {
	
	@Test(groups= {"hello"})
	public void a() {
		System.out.println("This is a first method");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods={"a"})
	public void b() {
		System.out.println("This ia a seconds method");
		Assert.assertEquals(3, 3);
	}
	
	@Test(dependsOnMethods= {"a"})
	public void c () {
		System.out.println("This is a third method");
	}
	
	@Test(dependsOnGroups= {"hello"})
	public void d() {
		System.out.println("This is a forth method");
	}

}
