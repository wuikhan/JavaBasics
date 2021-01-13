package testNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// Salesforce
public class Day04_Parameters {
	  static WebDriver driver;
	@Parameters({"browser","url","username","password"})
	@Test
	public  void loginFunctionality(String browser, String url, String ursername, String password) {
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "/Users/codegator/Desktop/selenium/chromedriver");
		 driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.gecko.driver", "/Users/codegator/Desktop/selenium/geckodriver");
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(ursername);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();

		}	
	
	@Test
	public void testMehtod() {
		System.out.println("This is a test method");
	}
	
	
	}
	

