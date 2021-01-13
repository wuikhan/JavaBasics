package testNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import seleniumPackage.Utilities;

public class Day01_TestNGLogin  extends Utilities {
	 WebDriver driver;

	// Test the login functionality
	@BeforeMethod()
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "/Users/codegator/Desktop/selenium/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
	}
	

	
	@Test(priority=2)
	public void validLogin() throws Exception {
		driver.findElement(By.id("username")).sendKeys("test.user@gmail.com.test");
		driver.findElement(By.id("password")).sendKeys("Pa55word");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
		
		WebElement logo = driver.findElement(By.xpath("//img[@title='Salesforce.com']"));
		boolean logoDisplayed = logo.isDisplayed();
		
		Assert.assertTrue(logoDisplayed);
	
	}
	
	@Test(priority=3)
	public void invalidLogin() throws Exception {
		driver.findElement(By.id("username")).sendKeys("test.user123@gmail.com.test");
		driver.findElement(By.id("password")).sendKeys("Pa55word122");
		driver.findElement(By.id("Login")).click();
		
		Thread.sleep(5000);
		String expectedError = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		
		String actualError = driver.findElement(By.id("error")).getText();
		System.out.println(actualError);
		
		Assert.assertEquals(actualError, expectedError);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority=1)
	public void verifyTitle() {
		
		String previousTitle = "Welcome to Salesforce";
		String currentTitle = driver.getTitle(); // Login | Salesforce
		Assert.assertNotEquals(previousTitle, currentTitle);
		
	}

}


