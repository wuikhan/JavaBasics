package testNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day04_DataProvider {

	WebDriver driver;

	@Test(dataProvider="getData")
	public  void test(String browser, String url, String ursername, String password) {
	
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "/Users/codegator/Desktop/selenium/chromedriver");
		 driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(ursername);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
		}
	}
	

	@DataProvider
	public Object[][] getData(){
		
		Object[][] testData = new Object[2][4];
		testData[0][0] = "chrome";
		testData[0][1] = "http://login.salesforce.com";
		testData[0][2] = "test.user@gmail.com.test";
		testData[0][3] = "Pa55word";
		
		testData[1][0] = "chrome";
		testData[1][1] = "http://login.salesforce.com";
		testData[1][2] = "test.user@gmail.com.test";
		testData[1][3] = "Pa55word";

		return testData;
	}
	}


