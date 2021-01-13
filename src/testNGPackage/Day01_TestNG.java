package testNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day01_TestNG {
	
	
	@Test
	public void testMethodOne() {
		System.out.println("This is a test annotation from testMethodOne");
	}
	
	@Test
	public void testMethodTwo() {
		System.out.println("This is a test annotation from testMethodTwo");
	}
	
	@BeforeSuite
	public void beforeSuiteAnnotation() {
		System.out.println("This is a before suite annotation from beforeSuiteAnnotation");
	}
	
	@BeforeTest
	public void beforeTestAnnotation() {
		System.out.println("This is a before test annotation from beforeTestAnnotation");
	}
	
	@BeforeClass
	public void beforeClassAnnotation() {
		System.out.println("This is a before class annotation from beforeClassAnnotation");
	}
	
	@BeforeGroups
	public void beforeGroupsAnnotation() {
		System.out.println("This is a before group annotation from beforeGroupAnnotation");
	}
	
	@BeforeMethod
	public void beforeMethodAnnotation() {
		System.out.println("This is a before method annotation from beforeMethodAnnotation");
	}
	
	@AfterMethod
	public void AfterMethodAnnotation() {
		System.out.println("This is a after method annotation from AfterMethodAnnotation");
	}
	
	@AfterGroups
	public void afterGroupAnnotation() {
		System.out.println("This is an after group from afterGroupAnnotation");
	}
	@AfterClass
	public void afterClassAnnotation() {
		System.out.println("This is an after class from afterClassAnnotation");
	}
	
	@AfterTest
	public void afterTestAnnotation() {
		System.out.println("This is an after test from afterTestAnnotation");
	}
	
	@AfterSuite
	public void afterSuiteAnnotation() {
		System.out.println("This is an after suite from afterSuiteAnnotation");
	}

}
